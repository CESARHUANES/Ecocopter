
package ecocopter.usuarios.Interface;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class JTableUtilUsuarios {
 
public  JTableUtilUsuarios(DefaultTableModel dt,JTable jTable){
    jTable.setModel(dt);
    dt.addColumn("DNI");
    dt.addColumn("AP_PATERNO");
    dt.addColumn("AP_MATERNO");
    dt.addColumn("NOMBRES");
    dt.addColumn("USUARIO");
    dt.addColumn("ROL/REPORTES");
    dt.addColumn("ROL/PELIGROS");
    dt.addColumn("FEC.CADUCIDAD");
    dt.addColumn("PASSWORD");
    dt.addColumn("ESTADO");
   
    
   jTable.getColumnModel().getColumn(0).setPreferredWidth(30);
   jTable.getColumnModel().getColumn(1).setPreferredWidth(80);
   jTable.getColumnModel().getColumn(2).setPreferredWidth(80);
   jTable.getColumnModel().getColumn(3).setPreferredWidth(80);
   jTable.getColumnModel().getColumn(4).setPreferredWidth(40);
   jTable.getColumnModel().getColumn(5).setPreferredWidth(80);
   jTable.getColumnModel().getColumn(6).setPreferredWidth(80);
   jTable.getColumnModel().getColumn(7).setPreferredWidth(80);
   jTable.getColumnModel().getColumn(8).setPreferredWidth(40);
   jTable.getColumnModel().getColumn(9).setPreferredWidth(40);
  
    
   jTable.getTableHeader().setEnabled(false);//desabilitar los tamaños de las clumnas
} 

}
