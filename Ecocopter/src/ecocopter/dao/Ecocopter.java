/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.dao;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class Ecocopter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Connection miConexion;
        miConexion=Conexion.GetConnection();
      
        if(miConexion!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexión  Correcta con Base de Datos","Información",JOptionPane.INFORMATION_MESSAGE);
        }else{
         JOptionPane.showMessageDialog( null,"No hay Conexión con la Base de Datos.!","Error",JOptionPane.WARNING_MESSAGE);   
   
        }
         
      
    }
   
}
