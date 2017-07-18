

package ecocopter.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.jfree.chart.JFreeChart;

/***
 *@author:Ing.Cesar Huanes
 *@since :16/07/2015
 *@version :1.0
 *Genera una descarga de una archivo excel a partir de un jTable.
 *Funcionalidad complementaria, JProgresBar y JLabel para medios visuales.
 **/

public class UtilDescargaExcel extends JFrame{
   int numCol=0; 
   int numRow=0;
       
 public UtilDescargaExcel(){
     
 }
 /**
  * Gestion principal de descarga de archivo excel
  * @param jTable
  * @param jProgressBar
  * @param jLabel 
  */
 public void gestionDescargaExcel(JTable jTable,JProgressBar jProgressBar,JLabel jLabel,JFreeChart chart){
      numRow=jTable.getRowCount();
     if(numRow>0){
        descargaExcel(jTable,jProgressBar,jLabel,chart); 
     }else{
      JOptionPane.showMessageDialog( null,"No se puede gestionar la descarga del archivo\n"
              + "ya que la grilla no cuenta con información.","Información",JOptionPane.INFORMATION_MESSAGE);   
     }
 }
/***
 * Gestionamos el JFileChooser para guardar el archivo excel.
 * @param jTable
 * @param jProgressBar
 * @param jLabel 
 */
 
 private void descargaExcel(JTable jTable,JProgressBar jProgressBar,JLabel jLabel,JFreeChart chart){
     JFileChooser fileChooser=new JFileChooser();
     fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
     int resultado=fileChooser.showSaveDialog(this);
     if(resultado==JFileChooser.CANCEL_OPTION){
     return;   }  
     
     File file=fileChooser.getSelectedFile();
     String directorio=file.getAbsolutePath();
     String nomArchivo=file.getName();
     System.out.println("Directorio:="+directorio); 
     System.out.println("Nombre del Archivo:="+nomArchivo); 
     if(file.exists()){
         int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de reemplazar el documento?", 
                 "Ya existe el documento :"+nomArchivo+"..!", JOptionPane.YES_NO_OPTION);
         if(resp==JOptionPane.YES_OPTION){ 
         file.delete();
         grabarArchivo(jTable,jProgressBar,jLabel,directorio,chart);
         }
     }else{
         grabarArchivo(jTable,jProgressBar,jLabel,directorio,chart);
     }
     
 }
 /***
  * Gestiona la escritura del archivo excel a travez de un Thread
  * @param jTable
  * @param jProgressBar
  * @param jLabel
  * @param directorio 
  */
 private void grabarArchivo(final JTable jTable,final JProgressBar jProgressBar,final JLabel jLabel,
         final String directorio,final JFreeChart chart){
    numCol=jTable.getColumnCount();
    numRow=jTable.getRowCount();
        Thread t;
          t = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                escribirArchivo(jTable,jProgressBar,jLabel,directorio,numCol,numRow,chart);
            } catch (Exception ex) {
                Logger.getLogger(UtilDescargaExcel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } });
          t.start();
 }
 /***
  * Escritura virtual del archivo excel en el objeto HSSFWorkbook.
  * @param jTable
  * @param jProgressBar
  * @param jLabel
  * @param directorio
  * @param numCol
  * @param numRow 
  */
private void escribirArchivo(JTable jTable,JProgressBar jProgressBar,
        JLabel jLabel,String directorio,int numCol,int numRow,JFreeChart chart) throws Exception{
    jProgressBar.setVisible(true);
    jProgressBar.setStringPainted(true);    
    String[][] datos=new String[numCol][numRow];
    datos=obtenerInformacion(jTable);
    HSSFWorkbook workbook = new HSSFWorkbook();
    HSSFSheet sheet = workbook.createSheet("Reporte");
    Row fila = sheet.createRow(0);
    File archivo = new File(directorio+".xls");
    Cell celda;
     String titulos[]=new String[numCol];
    //OBTENEMOS LOS VALORES DE LA CABECERA  DE LA TABLA
    for(int c=0;c<numCol;c++){
      titulos[c]=jTable.getModel().getColumnName(c).toUpperCase().toString();
    }  
    //ESCRIBIMOS EL VALOR DE LA CABECERA EN EL EXCEL
     for (int c = 0; c < numCol; c++) {
      celda = fila.createCell(c);
      celda.setCellValue(titulos[c]);
    } 
     //CREANDO EL DETALLE EN LA FILA NUMERO UNO EN ADELANTE
     for (int f = 0; f < numRow; f++) {
             fila = sheet.createRow(f+1);
              for(int c=0;c<numCol;c++){
                   celda = fila.createCell(c);
                   System.out.println(""+datos[f][c]+"\t");
                   celda.setCellValue(datos[f][c]);
                   setDatosProgreso(jProgressBar,jLabel,f,numRow);
              }
            try {//REALIZAMOS UNA PARADA DE MEDIO SEGUNDO
                   Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       System.out.println("ERROR :"+e.getMessage());
              }
        }
       if(jProgressBar!=null && jLabel !=null){
        jLabel.setText("");
        jProgressBar.setVisible(false);
       }
     //REALIZANDO LA ESCRITURA FISICA EN EL DOCUMENTO
     escrituraFisicaExcel(workbook,archivo,chart);
     
} 
/***
 * Escritura fisica del archivo excel en el disco.
 * @param workbook
 * @param archivo 
 */ 
private void escrituraFisicaExcel(HSSFWorkbook workbook ,File archivo,JFreeChart chart) throws Exception{
    
 try {
              FileOutputStream out = new FileOutputStream(archivo);
              
              workbook.write(out);
              out.close();
              JOptionPane.showMessageDialog( null,"Archivo creado exitosamente!","Información",
                      JOptionPane.INFORMATION_MESSAGE);
              System.out.println("Archivo creado exitosamente!");

        } catch (IOException e) {
            JOptionPane.showMessageDialog( null,"Error de escritura","Error",JOptionPane.WARNING_MESSAGE);
            System.out.println("Error de escritura"+e.getMessage());
            
        }     
}
/***
 * Leemos la data del JTable y lo llenamos en un vector para 
 * mayor gestion.
 * @param jTable
 * @return 
 */
 private   String  [][] obtenerInformacion( JTable jTable){
     int numFilas=jTable.getRowCount();
     int numColumnas=jTable.getColumnCount();
    String matriz[][]=new String [numFilas][numColumnas];
   for(int rowIndex=0;rowIndex<numFilas;rowIndex++){
       for(int colIndex=0;colIndex<numColumnas;colIndex++){
           matriz[rowIndex][colIndex]=jTable.getValueAt(rowIndex, colIndex).toString();
       }
   } 
   return matriz;
    
    }
 /***
  * Visualiza los datos de progresso
  * @param jProgressBar
  * @param jLabel
  * @param fila
  * @param numRow 
  */
 private void setDatosProgreso(JProgressBar jProgressBar,JLabel jLabel,int fila,int numRow){
   int porcentaje=(Integer)(100/numRow)*(fila+1);
                   if(jProgressBar!=null && jLabel !=null){
                   if(numRow%2==0){   
                   jProgressBar.setValue(porcentaje);
                   jLabel.setText("");
                   jLabel.setText("Procesando " + porcentaje + "%...");
                   }else{
                  if((fila+1)==numRow){
                   jProgressBar.setValue(100);
                   jLabel.setText("");
                   jLabel.setText("Procesando " + 100 + "%...");  
                   }else{
                  System.out.println("fila"+(fila+1));
                  System.out.println("Porcentaje"+porcentaje);
                   jProgressBar.setValue(porcentaje);
                   jLabel.setText("");
                   jLabel.setText("Procesando " + porcentaje + "%...");
                   }
                   }
                   }   
 }

}
