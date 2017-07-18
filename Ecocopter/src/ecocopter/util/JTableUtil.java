
package ecocopter.util;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class JTableUtil {
    TableRowSorter<TableModel> sorter=null;
    public JTableUtil(){
        
    }
    public void filtro(DefaultTableModel dt,JTable jTable,JTextField jText,int indice){
     sorter = new TableRowSorter<TableModel>(dt);
     jTable.setRowSorter(sorter);
     jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     
    RowFilter<TableModel, Object> rf = null;
   
    try {
    rf = RowFilter.regexFilter(jText.getText(), indice);
    } catch (java.util.regex.PatternSyntaxException e) {
    }
    sorter.setRowFilter(rf);
     
 }
   public void calcularDatos(JTable jtable,JTextField jTotalFallas,JTextField jTotalHoras,JTextField jTotalIndice){
   double totalFallas=0.00,totalHoras=0.00;
   if(jtable.getRowCount()>0){
       for(int i=0;i<jtable.getRowCount();i++){
           double cantFallas=Double.parseDouble(jtable.getValueAt(1, i).toString());
           double cantHoras=Double.parseDouble(jtable.getValueAt(2, i).toString());
           totalFallas=cantFallas+totalFallas;
           totalHoras=cantHoras+totalHoras;
       }
       
   }     
       
   }
   public double calculaIndice(double cantFalla,double cantHoras){
    double indiceTotal=0.00;
    return indiceTotal=cantFalla/cantHoras;
    
   }
           
           
           
}
