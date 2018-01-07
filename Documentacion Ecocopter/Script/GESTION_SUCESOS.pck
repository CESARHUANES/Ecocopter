create or replace package GESTION_SUCESOS IS
 -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Creación de Gestion de Sucesos 
 TYPE SucesosCursor IS REF CURSOR;
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de Proveedores  
  FUNCTION LSTCMB_PROVEEDOR
  RETURN SucesosCursor;
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de reportadores  
   FUNCTION LSTCMB_REPORTADOR
  RETURN SucesosCursor;
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de departamentos
   FUNCTION LSTCMB_DEPARTAMENTO
  RETURN SucesosCursor;
 
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de fase vuelo    
   FUNCTION LSTCMB_FASE_VUELO
  RETURN SucesosCursor;
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de area responsable  
   FUNCTION LSTCMB_AREA_REPONSABLE
  RETURN SucesosCursor;
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de mov publico  
   FUNCTION LSTCMB_MOV_PUBLICO
 RETURN SucesosCursor;
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de sucesos
   FUNCTION LSTCMB_CLASE_SUCESO
  RETURN SucesosCursor;
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de Categoria de Sucesos
   FUNCTION LSTCMB_CATEGORIA_SUCESO
  RETURN SucesosCursor;
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de Eventos de Sucesos
   FUNCTION LSTCMB_EVENTO_SUCESO
  RETURN SucesosCursor;
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de Plataforma de Sucesos
   FUNCTION LSTCMB_PLATAFORMA_SUCESO
  RETURN SucesosCursor;
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de Plataforma de Aeronaves
   FUNCTION LSTCMB_AERONAVE
  RETURN SucesosCursor;
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Graba sucesos 

    FUNCTION GRABA_SUCESOS(pFecSuceso IN CHAR,pDesSuceso IN CHAR,pCodAeronave IN INTEGER,pCodRep IN CHAR,pCodPro IN CHAR,
    pClaseSuc IN CHAR,pCategoria IN CHAR,pCodEvento IN CHAR,pCodPla IN CHAR,pCodFase IN CHAR,pCodAreaResp IN CHAR,pCodMov IN CHAR,pCodOr IN CHAR,pCodDes IN CHAR,pCodLug IN CHAR,pUsuCrea IN CHAR )
    RETURN CHAR;

  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Actualiza Sucesos
  
    FUNCTION ACTUALIZA_SUCESOS(pCodSuceso IN CHAR,pFecSuceso IN CHAR,pDesSuceso IN CHAR,pCodAeronave IN CHAR,pCodRep IN CHAR,pCodPro IN CHAR,
    pClaseSuc IN CHAR,pCategoria IN CHAR,pCodEvento IN CHAR,pCodPla IN CHAR,pCodFase IN CHAR,pCodAreaResp IN CHAR,pCodMov IN CHAR,pCodOr IN CHAR,pCodDes IN CHAR,pCodLug IN CHAR,pUsuCrea IN CHAR )
    RETURN CHAR;

  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Lista Sucesos
    FUNCTION LSTSUCESOS
    RETURN SucesosCursor;
    
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Eliminacion Logica de sucesos
      FUNCTION ELIMINA_SUCESOS(pCodSuceso IN CHAR,pEstado IN CHAR )
    RETURN CHAR;
    -- Author  : CESAR HUANES
    -- Created : 22/06/2015
    -- Purpose : Listado de Sucesos en funcion al codigo

    FUNCTION LSTSUCESOS_ACTUALIZA(pCodSuceso IN CHAR)
    RETURN SucesosCursor;

 END GESTION_SUCESOS;
/
create or replace package body GESTION_SUCESOS IS

  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Creación de Gestion de Sucesos 


  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de Proveedores 
 FUNCTION LSTCMB_PROVEEDOR
  RETURN SucesosCursor
  IS
  curSucesos SucesosCursor;
  
  BEGIN
  OPEN curSucesos FOR
   
    SELECT PRO.COD_PROVEEDOR||'Ã' ||PRO.NOM_PROVEEDOR FROM TBL_PROVEEDOR PRO ;
  RETURN curSucesos;
  END;

  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de reportadores  
   FUNCTION LSTCMB_REPORTADOR
  RETURN SucesosCursor
  IS
  curSucesos SucesosCursor;
  
  BEGIN
  OPEN curSucesos FOR
    SELECT REP.COD_REPORTADOR||'Ã' ||REP.NOM_REPORTADOR FROM TBL_REPORTADOR REP ;
  RETURN curSucesos;
  END;
  
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de departamentos
   FUNCTION LSTCMB_DEPARTAMENTO
  RETURN SucesosCursor
  IS
  curSucesos SucesosCursor;
  
  BEGIN
  OPEN curSucesos FOR
    SELECT DEP.COD_DEPARTAMENTO||'Ã' ||DEP.NOM_DEPARTAMENTO FROM TBL_DEPARTAMENTO DEP ;
  RETURN curSucesos;
  END;
  
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de fase vuelo    
   FUNCTION LSTCMB_FASE_VUELO
  RETURN SucesosCursor
  IS
  curSucesos SucesosCursor;
  
  BEGIN
  OPEN curSucesos FOR
    SELECT FASE.COD_FASE_VUELO||'Ã' ||FASE.NOM_FASE_VUELO FROM TBL_FASE_VUELO FASE ;
  RETURN curSucesos;
  END;

  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de area responsable  
   FUNCTION LSTCMB_AREA_REPONSABLE
  RETURN SucesosCursor
  IS
  curSucesos SucesosCursor;
  
  BEGIN
  OPEN curSucesos FOR
    SELECT RES.COD_AREA_RESPONSABLE||'Ã' ||RES.NOM_AREA_RESPONSABLE FROM TBL_AREA_RESPONSABLE RES ;
  RETURN curSucesos;
  END;

  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de mov publico  
   FUNCTION LSTCMB_MOV_PUBLICO
  RETURN SucesosCursor
  IS
  curSucesos SucesosCursor;
  
  BEGIN
  OPEN curSucesos FOR
    SELECT MOV.COD_MOV_PUBLICO||'Ã' ||MOV.NOM_MOV_PUBLICO FROM TBL_MOV_PUBLICO MOV ;
  RETURN curSucesos;
  END;
   -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de sucesos
   FUNCTION LSTCMB_CLASE_SUCESO
  RETURN SucesosCursor
  IS
  curSucesos SucesosCursor;
  
  BEGIN
  OPEN curSucesos FOR
    SELECT SUC.COD_CLASE_SUCESO||'Ã' ||SUC.NOM_CLASE_SUCESO FROM TBL_CLASE_SUCESO SUC ;
  RETURN curSucesos;
  END;
   -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de Categoria de Sucesos
   FUNCTION LSTCMB_CATEGORIA_SUCESO
  RETURN SucesosCursor
  IS
  curSucesos SucesosCursor;
  
  BEGIN
  OPEN curSucesos FOR
    SELECT CAT.COD_CATEGORIA||'Ã' ||CAT.NOM_CATEGORIA FROM TBL_CATEGORIA_SUCESO  CAT ;
  RETURN curSucesos;
  END;
   -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de Eventos de Sucesos
   FUNCTION LSTCMB_EVENTO_SUCESO
  RETURN SucesosCursor
  IS
  curSucesos SucesosCursor;
  
  BEGIN
  OPEN curSucesos FOR
    SELECT EVE.COD_EVENTO||'Ã' ||EVE.NOM_EVENTO FROM TBL_EVENTO_SUCESOS  EVE ORDER BY EVE.COD_EVENTO DESC;
  RETURN curSucesos;
  END;
   -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de Plataforma de Sucesos
   FUNCTION LSTCMB_PLATAFORMA_SUCESO
  RETURN SucesosCursor
  IS
  curSucesos SucesosCursor;
  
  BEGIN
  OPEN curSucesos FOR
    SELECT PLA.COD_PLATAFORMA||'Ã' ||PLA.NOM_PLATAFORMA FROM TBL_PLATAFORMA  PLA ;
  RETURN curSucesos;
  END;
  
   FUNCTION LSTCMB_AERONAVE
  RETURN SucesosCursor
  IS
  curSucesos SucesosCursor;
  
  BEGIN
  OPEN curSucesos FOR
    SELECT EC.IDNAVE ||'Ã' || EC.NOMNAVE FROM ECO_NAVE EC;
  RETURN curSucesos;
  END;
    -- Author  : CESAR HUANES
  -- Created : 27/06/2015
  -- Purpose : GRABA GESTION DE SUCESOS
  
   FUNCTION GRABA_SUCESOS(pFecSuceso IN CHAR,pDesSuceso IN CHAR,pCodAeronave IN INTEGER,pCodRep IN CHAR,pCodPro IN CHAR,
   pClaseSuc IN CHAR,pCategoria IN CHAR,pCodEvento IN CHAR,pCodPla IN CHAR,pCodFase IN CHAR,pCodAreaResp IN CHAR,pCodMov IN CHAR,pCodOr IN CHAR,pCodDes IN CHAR,pCodLug IN CHAR,pUsuCrea IN CHAR )
  RETURN CHAR
  IS
     FLAG CHAR(5);
     
     
  BEGIN
     FLAG:='N';
    
     INSERT INTO  TBL_SUCESOS(
    COD_SUCESO,
    FEC_SUCESO,
    DES_SUCESO,
    IDNAVE,
    COD_REPORTADOR,
    COD_PROVEDOR,
    COD_CLASE_SUCESO,
    COD_CATEGORIA,
    COD_EVENTO,
    COD_PLATAFORMA,
    COD_FASE_VUELO,
    COD_AREA_RESPONSABLE,
    COD_MOV_PUBLICO,
    COD_ORIGEN,
    COD_DESTINO,
    COD_LUGAR_SUCESO,
    USU_CREACION)VALUES(LPAD(SECUENCIA_SUCESO.NEXTVAL,10,'0'),TO_DATE(pFecSuceso,'dd/mm/yyyy'),pDesSuceso,pCodAeronave,pCodRep,pCodPro,
     pClaseSuc,pCategoria,pCodEvento,pCodPla,pCodFase,pCodAreaResp,pCodMov,pCodOr,pCodDes,pCodLug,pUsuCrea);
  COMMIT;
     FLAG:='S';
     RETURN FLAG;
  EXCEPTION 
    WHEN OTHERS  THEN
    DBMS_OUTPUT.put_line(SQLCODE || SQLERRM);
    ROLLBACK;
    RETURN FLAG;
  END;
  
  
  FUNCTION ACTUALIZA_SUCESOS(pCodSuceso IN CHAR,pFecSuceso IN CHAR,pDesSuceso IN CHAR,pCodAeronave IN CHAR,pCodRep IN CHAR,pCodPro IN CHAR,
   pClaseSuc IN CHAR,pCategoria IN CHAR,pCodEvento IN CHAR,pCodPla IN CHAR,pCodFase IN CHAR,pCodAreaResp IN CHAR,pCodMov IN CHAR,pCodOr IN CHAR,pCodDes IN CHAR,pCodLug IN CHAR,pUsuCrea IN CHAR )
  RETURN CHAR
  IS
     FLAG CHAR(5);
  
     
  BEGIN
     FLAG:='N';
    
   UPDATE  TBL_SUCESOS 
    
    SET FEC_SUCESO=TO_DATE(pFecSuceso,'dd/mm/yyyy'),
    DES_SUCESO=pDesSuceso,
    IDNAVE=pCodAeronave,
    COD_REPORTADOR=pCodRep,
    COD_PROVEDOR=pCodPro,
    COD_CLASE_SUCESO=pClaseSuc,
    COD_CATEGORIA=pCategoria,
    COD_EVENTO=pCodEvento,
    COD_PLATAFORMA=pCodPla,
    COD_FASE_VUELO=pCodFase,
    COD_AREA_RESPONSABLE=pCodAreaResp,
    COD_MOV_PUBLICO=pCodMov,
    COD_ORIGEN=pCodOr,
    COD_DESTINO=pCodDes,
    COD_LUGAR_SUCESO=pCodLug,
    USU_MODIFICACION =pUsuCrea,
    FEC_MODIFICACION=SYSDATE  WHERE COD_SUCESO=pCodSuceso;
   COMMIT;
     FLAG:='S';
    
     RETURN FLAG;
  EXCEPTION 
    WHEN OTHERS  THEN
    DBMS_OUTPUT.put_line(SQLCODE || SQLERRM);
     ROLLBACK;
    RETURN FLAG;
  END;
  
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de Sucesos
  
    FUNCTION LSTSUCESOS
    RETURN SucesosCursor
    IS 
    curListado SucesosCursor;
    BEGIN
    OPEN curListado FOR
    SELECT 
    S.COD_SUCESO|| 'Ã' ||
    TO_CHAR(S.FEC_SUCESO,'dd/mm/yyyy')|| 'Ã' ||
    UPPER(TO_CHAR(S.FEC_SUCESO,'Month'))|| 'Ã' ||
    TO_CHAR(S.FEC_SUCESO,'YYYY')|| 'Ã' ||
    S.DES_SUCESO|| 'Ã' ||
    NVL((SELECT EC.NOMNAVE FROM ECO_NAVE EC  WHERE EC.IDNAVE =S.IDNAVE),'-')|| 'Ã' ||
    NVL((SELECT  RE.NOM_REPORTADOR FROM TBL_REPORTADOR RE WHERE RE.COD_REPORTADOR =S.COD_REPORTADOR),'-')|| 'Ã' ||
    NVL((SELECT PRO.NOM_PROVEEDOR FROM TBL_PROVEEDOR PRO WHERE PRO.COD_PROVEEDOR =S.COD_PROVEDOR),'-')|| 'Ã' ||
    NVL((SELECT CL.NOM_CLASE_SUCESO FROM TBL_CLASE_SUCESO CL WHERE CL.COD_CLASE_SUCESO=S.COD_CLASE_SUCESO),'-')|| 'Ã' ||
    NVL((SELECT CA.NOM_CATEGORIA FROM  TBL_CATEGORIA_SUCESO  CA WHERE CA.COD_CATEGORIA=S.COD_CATEGORIA),'-')|| 'Ã' ||
    NVL((SELECT EV.NOM_EVENTO FROM TBL_EVENTO_SUCESOS EV WHERE EV.COD_EVENTO=S.COD_EVENTO),'-')|| 'Ã' ||
    NVL((SELECT PL.NOM_PLATAFORMA FROM TBL_PLATAFORMA PL WHERE PL.COD_PLATAFORMA=S.COD_PLATAFORMA),'-')|| 'Ã' ||
    NVL((SELECT  FA.NOM_FASE_VUELO FROM TBL_FASE_VUELO FA WHERE FA.COD_FASE_VUELO= S.COD_FASE_VUELO),'-')|| 'Ã' ||
    NVL((SELECT RES.NOM_AREA_RESPONSABLE FROM  TBL_AREA_RESPONSABLE RES WHERE RES.COD_AREA_RESPONSABLE= S.COD_AREA_RESPONSABLE),'-')|| 'Ã' ||
    NVL((SELECT  MOV.NOM_MOV_PUBLICO FROM TBL_MOV_PUBLICO MOV WHERE MOV.COD_MOV_PUBLICO=  S.COD_MOV_PUBLICO),'-')|| 'Ã' ||
    NVL((SELECT  DE.NOM_DEPARTAMENTO FROM TBL_DEPARTAMENTO DE WHERE DE.COD_DEPARTAMENTO= S.COD_ORIGEN),'-')|| 'Ã' ||
    NVL((SELECT  DE.NOM_DEPARTAMENTO FROM TBL_DEPARTAMENTO DE WHERE DE.COD_DEPARTAMENTO= S.COD_DESTINO),'-')|| 'Ã' ||
    NVL((SELECT  DE.NOM_DEPARTAMENTO FROM TBL_DEPARTAMENTO DE WHERE DE.COD_DEPARTAMENTO= S.COD_LUGAR_SUCESO),'-')
    
    FROM TBL_SUCESOS S WHERE S.ESTADO='S';
  
  RETURN   curListado;
  END;
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Eliminacion Logica de sucesos

  FUNCTION ELIMINA_SUCESOS(pCodSuceso IN CHAR,pEstado IN CHAR )
    RETURN CHAR
  IS
     FLAG CHAR(5);
     
     
  BEGIN
     FLAG:='N';
    UPDATE   TBL_SUCESOS SU  SET SU.ESTADO=pEstado WHERE SU.COD_SUCESO=pCodSuceso;
      COMMIT;
     FLAG:='S';
     RETURN FLAG;
  EXCEPTION 
    WHEN OTHERS  THEN
    DBMS_OUTPUT.put_line(SQLCODE || SQLERRM);
    ROLLBACK;
    RETURN FLAG;
  END;
   
  -- Author  : CESAR HUANES
  -- Created : 22/06/2015
  -- Purpose : Listado de Sucesos en funcion al codigo
  
    FUNCTION LSTSUCESOS_ACTUALIZA(pCodSuceso IN CHAR)
    RETURN SucesosCursor
    IS 
    curListado SucesosCursor;
    BEGIN
    OPEN curListado FOR
    SELECT 
    TO_CHAR(S.FEC_SUCESO,'dd/mm/yyyy')|| 'Ã' ||
    S.DES_SUCESO|| 'Ã' ||
    S.IDNAVE|| 'Ã' ||
    S.COD_REPORTADOR|| 'Ã' ||
    S.COD_PROVEDOR|| 'Ã' ||
    TRIM(S.COD_CLASE_SUCESO)|| 'Ã' ||
    S.COD_CATEGORIA|| 'Ã' ||
    S.COD_EVENTO|| 'Ã' ||
    S.COD_PLATAFORMA|| 'Ã' ||
    S.COD_FASE_VUELO|| 'Ã' ||
    S.COD_AREA_RESPONSABLE|| 'Ã' ||
    S.COD_MOV_PUBLICO|| 'Ã' ||
    S.COD_ORIGEN|| 'Ã' ||
    S.COD_DESTINO|| 'Ã' ||
    S.COD_LUGAR_SUCESO
    
    FROM TBL_SUCESOS S WHERE S.COD_SUCESO=pCodSuceso;
  
  RETURN   curListado;
  END;
  
   
  
END GESTION_SUCESOS;
/
