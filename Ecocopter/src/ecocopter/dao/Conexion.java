
package ecocopter.dao;

import ecocopter.conexion.LeerParametros;
import ecocopter.conexion.VariablesConexion;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
     public static Connection GetConnection()
    {
       
    LeerParametros parametros=new   LeerParametros();
    //parametros.leerParametros();
    String Driver="oracle.jdbc.driver.OracleDriver";
    String Url="jdbc:oracle:thin:@"+VariablesConexion.ip+":"+VariablesConexion.sidNumero+":"+VariablesConexion.sid;//10.11.1.204
    String User=VariablesConexion.usuario;
    String Password=VariablesConexion.password;    
     Connection cn=null;
    try{
    Class.forName(Driver);
    cn=DriverManager.getConnection(Url, User, Password);
    
    DatabaseMetaData meta=cn.getMetaData();
    System.out.println("Nombre:-"+meta.getDriverName());
    System.out.println("Version:-"+meta.getDriverVersion());
   
    }catch(ClassNotFoundException | SQLException e){
     e.getMessage();
    System.out.println("No se puede conectar con el servidor"+e.getMessage());
    }    
    return cn;
       
    }
  
}
