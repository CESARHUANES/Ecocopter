create or replace package GESTION_HORAS_VUELO IS
 TYPE HorasCursor IS REF CURSOR;
 -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de historial de horas de vuelo
   FUNCTION LST_HISTORIAL_HORAS
  RETURN HorasCursor;
   -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de resumen de horas vuelo
   FUNCTION LST_RESUMEN_HORAS
  RETURN HorasCursor;
END;
/
create or replace package body GESTION_HORAS_VUELO IS

  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de historial de horas de vuelo
   FUNCTION LST_HISTORIAL_HORAS
  RETURN HorasCursor
  IS
  curHoras HorasCursor;
  
  BEGIN
  OPEN curHoras FOR
  SELECT COD_REGIS||'Ã' ||N.NOMNAVE||'Ã' ||NOM_MES||'Ã' ||NOM_ANO||'Ã' ||NUM_HORAS||'Ã' ||
  TO_CHAR(FECHA,'dd/mm/yyyy') FROM HIST_HORAS H,ECO_NAVE N WHERE H.IDNAVE=N.IDNAVE ORDER BY  COD_REGIS DESC;

  RETURN curHoras;
  END;
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de resumen de horas vuelo
   FUNCTION LST_RESUMEN_HORAS
  RETURN HorasCursor
  IS
  curHoras HorasCursor;
  
  BEGIN
  OPEN curHoras FOR
  SELECT  N.NOMNAVE||'Ã' ||H.NOM_MES||'Ã' ||H.NOM_ANO||'Ã' ||SUM(H.NUM_HORAS) 
   FROM  HIST_HORAS H,ECO_NAVE N WHERE H.IDNAVE=N.IDNAVE  GROUP BY H.NOM_MES,N.NOMNAVE,H.NOM_ANO ORDER BY N.NOMNAVE,H.NOM_MES DESC;


  RETURN curHoras;
  END;
END;
/
