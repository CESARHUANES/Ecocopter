
package ecocopter.peligros.Dao;

import ecocopter.dao.DBUtility;
import java.sql.SQLException;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DBPeligros {
    
    private static final Logger log = LoggerFactory.getLogger(DBPeligros.class);
    public static String ERROR;
    static ArrayList parametro = null;
    
    public DBPeligros(){
        
    }
    public static ArrayList lstPeligros() throws SQLException {
    ArrayList lstPeligros=new ArrayList();
    parametro=new ArrayList();
    
    DBUtility.executeSQLStoredProcedureArrayList(lstPeligros, "GESTION_PELIGROS.LST_PELIGROS",
                                                            parametro);
        
     return lstPeligros;   
    }
}
