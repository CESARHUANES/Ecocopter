
package ecocopter.sucesos.Interface;

import javax.swing.JTable;


public class JTableUtilSucesos {
    public JTableUtilSucesos(JTable table){
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(0);
        table.getColumnModel().getColumn(4).setMinWidth(0);
        table.getColumnModel().getColumn(4).setPreferredWidth(0);
        
        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(3).setResizable(false);
        table.getColumnModel().getColumn(4).setResizable(false);
        table.getColumnModel().getColumn(5).setResizable(false);
        table.getColumnModel().getColumn(6).setResizable(false);
        table.getColumnModel().getColumn(7).setResizable(false);
        table.getColumnModel().getColumn(8).setResizable(false);
        table.getColumnModel().getColumn(9).setResizable(false);
        table.getColumnModel().getColumn(10).setResizable(false);
        table.getColumnModel().getColumn(11).setResizable(false);
        table.getColumnModel().getColumn(12).setResizable(false);
        table.getColumnModel().getColumn(13).setResizable(false);
        table.getColumnModel().getColumn(14).setResizable(false);
        table.getColumnModel().getColumn(15).setResizable(false);  
        table.getColumnModel().getColumn(16).setResizable(false); 

                
    }
}
