
package ecocopter.aeronave;

import ecocopter.dao.DBUtility;

import java.sql.SQLException;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DBAeronave {
  private static final Logger log = LoggerFactory.getLogger(DBAeronave.class);
    public static String ERROR;
    static ArrayList parametro = null; 
   
     public static String validarActualizacion(String pCodAeronave) throws SQLException{
    parametro = new ArrayList();
    parametro.add(pCodAeronave);
    
    return DBUtility.executeSQLStoredProcedureStr("GESTION_AERONAVE.FN_VALIDA_ELIMINACION(?)",
                                                           parametro);    
    }
   
}
