
package ecocopter.sucesos.Dao;

import ecocopter.dao.DBUtility;
import java.sql.SQLException;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DBSucesos {
    private static final Logger log = LoggerFactory.getLogger(DBSucesos.class);
    public static String ERROR;
    static ArrayList parametro = null;
    public  DBSucesos(){
        
    }
    public static ArrayList lstCmbProveedor() throws SQLException {
    ArrayList lstProveedor = new ArrayList();
     parametro = new ArrayList();
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstProveedor, "GESTION_SUCESOS.LSTCMB_PROVEEDOR",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstProveedor;   
    }
    public static ArrayList lstCmbPeportador() throws SQLException {
    ArrayList lstReportador = new ArrayList();
     parametro = new ArrayList();
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstReportador, "GESTION_SUCESOS.LSTCMB_REPORTADOR",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstReportador;   
    }
    public static ArrayList lstCmbDepartamento() throws SQLException {
    ArrayList lstDepartamento = new ArrayList();
     parametro = new ArrayList();
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstDepartamento, "GESTION_SUCESOS.LSTCMB_DEPARTAMENTO",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstDepartamento;   
    }
 
   public static ArrayList lstCmbFaseVuelo() throws SQLException {
    ArrayList lstFaseVuelo = new ArrayList();
     parametro = new ArrayList();
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstFaseVuelo, "GESTION_SUCESOS.LSTCMB_FASE_VUELO",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstFaseVuelo;   
    }
   public static ArrayList lstCmbAreaResponsable() throws SQLException {
    ArrayList lstAreaResponsable = new ArrayList();
     parametro = new ArrayList();
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstAreaResponsable, "GESTION_SUCESOS.LSTCMB_AREA_REPONSABLE",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstAreaResponsable;   
    }
   public static ArrayList lstCmbMovPublico() throws SQLException {
    ArrayList lstMovPublico = new ArrayList();
     parametro = new ArrayList();
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstMovPublico, "GESTION_SUCESOS.LSTCMB_MOV_PUBLICO",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstMovPublico;   
    }
   public static ArrayList lstCmbClaseSuceso()throws SQLException{
    ArrayList lstClaseSuceso =new ArrayList(); 
     parametro = new ArrayList();
 
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstClaseSuceso, "GESTION_SUCESOS.LSTCMB_CLASE_SUCESO",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstClaseSuceso; 
   }
    public static ArrayList lstCmbCategoriaSuceso()throws SQLException{
    ArrayList lstCategoriaSuceso =new ArrayList(); 
     parametro = new ArrayList();
 
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstCategoriaSuceso, "GESTION_SUCESOS.LSTCMB_CATEGORIA_SUCESO",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstCategoriaSuceso; 
   }
    public static ArrayList lstCmbEventoSuceso()throws SQLException{
    ArrayList lstEventoSuceso =new ArrayList(); 
     parametro = new ArrayList();
 
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstEventoSuceso, "GESTION_SUCESOS.LSTCMB_EVENTO_SUCESO",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstEventoSuceso; 
   }
    public static ArrayList lstCmbPlataforma()throws SQLException{
    ArrayList lstPlataforma =new ArrayList(); 
     parametro = new ArrayList();
 
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstPlataforma, "GESTION_SUCESOS.LSTCMB_PLATAFORMA_SUCESO",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstPlataforma; 
   }
     public static ArrayList lstCmbAeronave()throws SQLException{
    ArrayList lstAeronave =new ArrayList(); 
     parametro = new ArrayList();
 
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstAeronave, "GESTION_SUCESOS.LSTCMB_AERONAVE",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstAeronave; 
   }
    public static String grabaSuceso(String pFecSuceso ,String pDesSuceso ,int pCodAeronave ,String pCodRep ,String pCodPro ,String
pClaseSuc ,String pCategoria ,String pCodEvento ,String pCodPla ,String pCodFase ,String pCodAreaResp ,
String pCodMov ,String pCodOr ,String pCodDes ,String pCodLug ,String pUsuCrea) throws SQLException{
    parametro = new ArrayList();
    parametro.add( pFecSuceso );
    parametro.add( pDesSuceso );
    parametro.add( pCodAeronave );
    parametro.add( pCodRep );
    parametro.add( pCodPro );
    parametro.add( pClaseSuc );
    parametro.add( pCategoria );
    parametro.add( pCodEvento );
    parametro.add( pCodPla );
    parametro.add( pCodFase );
    parametro.add( pCodAreaResp );
    parametro.add( pCodMov );
    parametro.add( pCodOr );
    parametro.add( pCodDes );
    parametro.add( pCodLug );
    parametro.add( pUsuCrea);

    return DBUtility.executeSQLStoredProcedureStr("GESTION_SUCESOS.GRABA_SUCESOS(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                                                           parametro);   
        
      
    } 
    
     public static ArrayList lstGrillaSucesos()throws SQLException{
     ArrayList lstSucesos =new ArrayList(); 
  parametro = new ArrayList();
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstSucesos, "GESTION_SUCESOS.LSTSUCESOS",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstSucesos; 
   }
    public static String eliminaSuceso(String pCodSuceso ,String pEstado ) throws SQLException{
    parametro = new ArrayList();
    parametro.add( pCodSuceso );
    parametro.add( pEstado );
    return DBUtility.executeSQLStoredProcedureStr("GESTION_SUCESOS.ELIMINA_SUCESOS(?,?)",
                                                           parametro);   
        
      
    } 
    
 public static String actualizaSuceso(String pCodSuceso,String pFecSuceso ,String pDesSuceso ,int pCodAeronave ,String pCodRep ,String pCodPro ,String
pClaseSuc ,String pCategoria ,String pCodEvento ,String pCodPla ,String pCodFase ,String pCodAreaResp ,
String pCodMov ,String pCodOr ,String pCodDes ,String pCodLug ,String pUsuCrea) throws SQLException{
    parametro = new ArrayList();
    parametro.add(pCodSuceso);
    parametro.add( pFecSuceso );
    parametro.add( pDesSuceso );
    parametro.add( pCodAeronave );
    parametro.add( pCodRep );
    parametro.add( pCodPro );
    parametro.add( pClaseSuc );
    parametro.add( pCategoria );
    parametro.add( pCodEvento );
    parametro.add( pCodPla );
    parametro.add( pCodFase );
    parametro.add( pCodAreaResp );
    parametro.add( pCodMov );
    parametro.add( pCodOr );
    parametro.add( pCodDes );
    parametro.add( pCodLug );
    parametro.add( pUsuCrea);

    return DBUtility.executeSQLStoredProcedureStr("GESTION_SUCESOS.ACTUALIZA_SUCESOS(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                                                           parametro);   
        
      
    }   
 
  public static ArrayList lstGrillaSucesos(String pCodSuceso)throws SQLException{
     ArrayList lstSucesos =new ArrayList(); 
     parametro = new ArrayList();
     parametro.add(pCodSuceso);
 
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstSucesos, "GESTION_SUCESOS.LSTSUCESOS_ACTUALIZA(?)",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstSucesos; 
   }
     
}
