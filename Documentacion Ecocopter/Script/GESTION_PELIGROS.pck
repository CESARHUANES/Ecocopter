create or replace package GESTION_PELIGROS IS
 -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Creaci�n de Gestion de Sucesos 
 TYPE PeligrosCursor IS REF CURSOR;
 
  FUNCTION LST_PELIGROS
  RETURN PeligrosCursor;
END;
/
create or replace package body GESTION_PELIGROS IS

 -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Creaci�n de Gestion de Sucesos 


  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de Proveedores 
 FUNCTION LST_PELIGROS
  RETURN PeligrosCursor
  IS
  curPeligros PeligrosCursor;
  
  BEGIN
  OPEN curPeligros FOR
   
   SELECT 
   PEL.CODIGO_REGISTRO|| '�' ||
   NA.IDNAVE|| '�' ||
   NA.NOMNAVE|| '�' ||
   PEL.DEFENSA_MR|| '�' ||
   PEL.ACCION_MR
   
   FROM TBL_REGISTRO_PELIGROS PEL ,ECO_NAVE NA
   WHERE PEL.IDNAVE=NA.IDNAVE;
   
  RETURN curPeligros;
  END;
END;
/
