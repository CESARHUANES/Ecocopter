/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.conexion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cesar
 */
public class LeerParametros {
  public   LeerParametros(){
      
  }
  public String getIpAddress(){
      String ipAddress="";
      try {   
       ipAddress=Inet4Address.getLocalHost().getHostAddress().toString();
      } catch (UnknownHostException ex) {
          Logger.getLogger(LeerParametros.class.getName()).log(Level.SEVERE, null, ex);
      }
     return ipAddress; 
  }
  public void leerParametros(){
    Properties propiedades = new Properties();
    InputStream entrada = null;

    try {

        entrada = new FileInputStream("\\\\"+this.getIpAddress().trim()+"\\Sistema\\conexion\\ParametrosConexion.properties");

       
        propiedades.load(entrada);
        VariablesConexion.ip=propiedades.getProperty("pp.ip").trim();
        VariablesConexion.usuario=propiedades.getProperty("app.usuario").trim();
        VariablesConexion.password=propiedades.getProperty("app.password").trim();
        VariablesConexion.sid=propiedades.getProperty("app.sid").trim();
        VariablesConexion.sidNumero=propiedades.getProperty("app.sidNumero").trim();
      
        System.out.println("IP SERVIDOR:=="+propiedades.getProperty("pp.ip"));
        System.out.println("USUARIO:=="+propiedades.getProperty("app.usuario"));
        System.out.println("PASSWORD:=="+propiedades.getProperty("app.password"));
        System.out.println("SID:=="+propiedades.getProperty("app.sid"));
        System.out.println("SID NUMERO:=="+propiedades.getProperty("app.sidNumero"));

    } catch (IOException ex) {
        ex.printStackTrace();
    } finally {
        if (entrada != null) {
            try {
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

  }   
   
}
