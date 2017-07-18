
package ecocopter.usuarios.Dao;


import ecocopter.dao.DBUtility;

import java.sql.SQLException;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DBUsuarios {
    private static final Logger log = LoggerFactory.getLogger(DBUsuarios.class);
    public static String ERROR;
    static ArrayList parametro = null; 
    public static ArrayList lstCmbRoles() throws SQLException {
    ArrayList lstRoles = new ArrayList();
     parametro = new ArrayList();
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstRoles, "GESTION_USUARIO.LSTCMBROLES",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstRoles;   
    }
     public static String grabaUsuario(String pDni,String pPaterno,String pMaterno,String pNombres,
             String pUsuario,String pPassword,String pEstado,String pUsuCreacion) throws SQLException{
    parametro = new ArrayList();
    parametro.add( pDni );
    parametro.add( pPaterno );
    parametro.add( pMaterno );
    parametro.add( pNombres );
    parametro.add( pUsuario );
    parametro.add( pPassword );
    parametro.add( pEstado );
    parametro.add( pUsuCreacion );
    return DBUtility.executeSQLStoredProcedureStr("GESTION_USUARIO.GRABA_USUARIO(?,?,?,?,?,?,?,?)",
                                                           parametro);    
    }
    public static String isExisteDni(String pDni) throws SQLException{
    parametro = new ArrayList();
    parametro.add(pDni);
    return DBUtility.executeSQLStoredProcedureStr("GESTION_USUARIO.IS_EXISTE_DNI(?)",
                                                           parametro);    
    }
    public static ArrayList lstUsuarioRoles() throws SQLException {
    ArrayList lstUsuRol = new ArrayList();
     parametro = new ArrayList();
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstUsuRol, "GESTION_USUARIO.LST_USUARIOS_ROL",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstUsuRol;   
    }
     public static String isExisteUsuario(String pUsuario) throws SQLException{
    parametro = new ArrayList();
    parametro.add( pUsuario);
    return DBUtility.executeSQLStoredProcedureStr("GESTION_USUARIO.IS_EXISTE_USUARIO(?)",
                                                           parametro);    
    }
     
     public static String isAsignaRolUsuario(String pDni,String pRol,String pRol2,
             String pFechaCad,String pUsuCrea) throws SQLException{
    parametro = new ArrayList();
    parametro.add(pDni);
    parametro.add(pRol);
    parametro.add(pRol2);
    parametro.add(pFechaCad);
    parametro.add(pUsuCrea);
  
    return DBUtility.executeSQLStoredProcedureStr("GESTION_USUARIO.GRABA_ROL_USUARIO(?,?,?,?,?)",
                                                           parametro);    
    }
   
     public static String actualizaUsuario(String pDni,String pPaterno,String pMaterno,String pNombres,
             String pUsuario,String pPassword,String pEstado,String pUsuCreacion) throws SQLException{
    parametro = new ArrayList();
    parametro.add(pDni);
    parametro.add(pPaterno);
    parametro.add(pMaterno);
    parametro.add(pNombres);
    parametro.add(pUsuario);
    parametro.add(pPassword);
    parametro.add(pEstado);
    parametro.add(pUsuCreacion);
    return DBUtility.executeSQLStoredProcedureStr("GESTION_USUARIO.ACTUALIZA_USUARIO(?,?,?,?,?,?,?,?)",
                                                           parametro);    
    }
     public static String autentificaUsuario(String pUsuario,String pContrasena) throws SQLException{
    parametro = new ArrayList();
    parametro.add(pUsuario);
    parametro.add(pContrasena);
    return DBUtility.executeSQLStoredProcedureStr("GESTION_USUARIO.AUTENTIFICA_USUARIO(?,?)",
                                                           parametro);    
    }
}
