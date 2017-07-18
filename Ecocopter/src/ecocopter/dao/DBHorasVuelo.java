
package ecocopter.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DBHorasVuelo {
    private static final Logger log = LoggerFactory.getLogger(DBHorasVuelo.class);
    public static String ERROR;
    static ArrayList parametro = null;
    public  DBHorasVuelo(){
        
    }
    public static ArrayList lstHistorialHoras() throws SQLException {
    ArrayList lstHistorial = new ArrayList();
     parametro = new ArrayList();
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstHistorial, "GESTION_HORAS_VUELO.LST_HISTORIAL_HORAS",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstHistorial;   
    } 
    public static ArrayList lstResumenHoras() throws SQLException {
    ArrayList lstResumen = new ArrayList();
     parametro = new ArrayList();
      try {
         DBUtility.executeSQLStoredProcedureArrayList(lstResumen, "GESTION_HORAS_VUELO.LST_RESUMEN_HORAS",
                                                            parametro);
     } catch (Exception e) {
          ERROR = e.getMessage();
     }
      return lstResumen;   
    }  
}
