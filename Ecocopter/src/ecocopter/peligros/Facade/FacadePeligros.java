
package ecocopter.peligros.Facade;

import ecocopter.peligros.Dao.DBPeligros;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FacadePeligros {
    
  public static  ArrayList lstPeligros(){
      ArrayList lstPeligros=new ArrayList();
      try {
          
          lstPeligros=DBPeligros.lstPeligros();
         
      } catch (SQLException ex) {
          Logger.getLogger(FacadePeligros.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      return lstPeligros;
  }  
    
}
