
package ecocopter.sucesos.Facade;

import ecocopter.sucesos.Interface.ConstantesSucesos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class GrabarArchivoExcel {
    public GrabarArchivoExcel(){
        
    }
   public   String  [][] obtenerInformacion( JTable jTable){
     int numFilas=jTable.getRowCount();
     int numColumnas=jTable.getColumnCount();
     String matriz[][]=new String [numFilas][numColumnas];
   for(int rowIndex=0;rowIndex<numFilas;rowIndex++){
       for(int colIndex=0;colIndex<numColumnas;colIndex++){
           matriz[rowIndex][colIndex]=(String)jTable.getValueAt(rowIndex, colIndex);
       }
   } 
   return matriz;
    
    }
   public void grabarArchivoExcel( final JTable jTable, final String directorio,final JProgressBar jProgress,final JLabel jLabel){
       
          

   
        Thread t;
        //Inicializamos
        t = new Thread(new Runnable() {

           @Override
           public void run() {
                jProgress.setVisible(true);
                jProgress.setStringPainted(true);
          final int numCol=ConstantesSucesos.titulos.length;
         final int numRow=jTable.getRowCount();
         String[][] datos=new String[numCol][numRow];
        datos=obtenerInformacion(jTable); 
               
    HSSFWorkbook workbook = new HSSFWorkbook();
    HSSFSheet sheet = workbook.createSheet("Sucesos");
    Row fila = sheet.createRow(0);
    File archivo = new File(directorio+".xls");
    Cell celda;
    //Creando el encabezado
    String titulos[]= ConstantesSucesos.titulos;
    for (int c = 0; c < numCol; c++) {
      celda = fila.createCell(c);
      celda.setCellValue(titulos[c]);
    }  
           //Creando el dedatlle
    // Nueva fila
        for (int f = 0; f < numRow; f++) {
             fila = sheet.createRow(f+1);
              for(int c=0;c<numCol;c++){
                   celda = fila.createCell(c);
                   System.out.print(""+datos[f][c]+"\t");
                   celda.setCellValue(datos[f][c]);
                   jProgress.setValue((Integer)(100/numRow)*(f+1));
             jLabel.setText("");
             jLabel.setText("Procesando " + (Integer)(100/numRow)*(f+1) + "%...");
              }
              System.out.println("\n");
             
             //Hacemos una parada de medio segundo por cada siclo while
             try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
        }
         jLabel.setText("");
        jProgress.setVisible(false);
     // Escribimos el archivo
        try {
              FileOutputStream out = new FileOutputStream(archivo);
              workbook.write(out);
              out.close();
              JOptionPane.showMessageDialog( null,"Archivo creado exitosamente!","Información",JOptionPane.INFORMATION_MESSAGE);
              System.out.println("Archivo creado exitosamente!");

        } catch (IOException e) {
            JOptionPane.showMessageDialog( null,"Error de escritura","Error",JOptionPane.WARNING_MESSAGE);
            System.out.println("Error de escritura");
            e.printStackTrace();
        }      
               
               
               
           
           }
        
        });
      
     t.start();
   }
    
}
