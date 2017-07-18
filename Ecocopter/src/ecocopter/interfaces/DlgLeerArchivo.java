/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.interfaces;

import com.csvreader.CsvReader;
import ecocopter.bean.Cabecera;
import ecocopter.bean.Detalle;
import ecocopter.bean.VariablesEcocopter;
import ecocopter.dao.FacadeEcopter;
import ecocopter.util.EcocopterUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Cesar
 */
public class DlgLeerArchivo {
  public DlgLeerArchivo(){
        
    }
  
  EcocopterUtil util=new EcocopterUtil();
    boolean antiguo = false;
    transient List<Detalle> detalle = null;
    FacadeEcopter ecopter=new FacadeEcopter();
    public void leerArchivo(String path,String idNave) {
 List lstDatos = new ArrayList();
 
  if (path.contains(".xlsx") || path.contains(".XLSX") ) {
 
   leerArchivoXLSX(path, lstDatos,idNave);
 
   antiguo = false;
 
  } else if (path.contains(".xls")|| path.contains(".XLS")) {
 
   leerArchivoXLS(path, lstDatos,idNave);
 
   antiguo = true;
 
  }
 
 
  leerDatos(path,lstDatos,idNave);
 
 }
    
    public void leerArchivoCSV(String nomPath,String idNave){
        try {
         detalle= new ArrayList<Detalle>();
       
      
        CsvReader detalle_import = new CsvReader(nomPath);
        char delimi=detalle_import.getDelimiter();//obtenermos el delimitador
        detalle_import.setDelimiter(';');
        //detalle_import.readHeaders();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");	
        while (detalle_import.readRecord())
        {  
  
           // String idArchivo = detalle_import.get(0);
           
             try {
            String refArchivo = detalle_import.get(0);
            String fecha = detalle_import.get(1);
            String discrepancia = detalle_import.get(2);
            String accion = detalle_import.get(3);
            String codAta = detalle_import.get(4); 
            detalle.add(new Detalle("1", refArchivo, fecha, discrepancia,accion,codAta)); 
             } catch (Exception ex) {
                 Logger.getLogger(DlgLeerArchivo.class.getName()).log(Level.SEVERE, null, ex);
             }
               
        }
         
        detalle_import.close();
         
        
       grabaCabecera(nomPath,detalle,idNave);
       grabaDetalle(detalle);
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        
    }
    public boolean grabaCabecera(String nomPath,List<Detalle> detalle,String idNave){
    boolean flag=true;
    try{
    File archivo=new File(nomPath);
    FacadeEcopter facade=new FacadeEcopter();
    String idArchivo=String.valueOf(facade.getIdArchivo());
    VariablesEcocopter.vIdArchivo=idArchivo;
    String nomArchivo=archivo.getName();
    String pesoArchivo= VariablesEcocopter.vPesoArchivo;
    int cantRegistros=detalle.size();
    
    Cabecera cab=new Cabecera();
    cab.setIdArchivo(idArchivo);
    cab.setIdNave(idNave);
    cab.setNomArchivo(nomArchivo);
    cab.setCantReg(cantRegistros);
    cab.setEstado("A");
    cab.setPesoArchivo(pesoArchivo);
    ecopter.grabaArchivo(new Cabecera(cab.getIdArchivo(),cab.getIdNave(),cab.getNomArchivo(),cab.getCantReg(),cab.getEstado(),cab.getPesoArchivo(),cab.getFecCarga()));
    }catch(Exception e){
     e.printStackTrace();
     flag=false;
    }
    return flag;    
    }
    
   private void grabaDetalle(List<Detalle> detalle){
     for(Detalle det : detalle){
         
           ecopter.nuevoDetalle(new Detalle(VariablesEcocopter.vIdArchivo,det.getRefArchivo(),det.getFecha(),det.getDiscrepancia(),det.getAccion(),det.getCodAta()));
          System.out.println(det.getIdArchivo()+ " - "+det.getRefArchivo()+ " - "+det.getFecha()+ " - "+det.getDiscrepancia()+ " - "+det.getAccion()+ " - "+det.getCodAta());   
     
     }
   
    }
    
  private void leerArchivoXLS(String path, List lstDatos,String idNave) {
 
  try {

   FileInputStream fileInputStream = new FileInputStream(path);
   POIFSFileSystem fsFileSystem = new POIFSFileSystem(fileInputStream);
   HSSFWorkbook Libro_trabajo = new HSSFWorkbook(fsFileSystem);
   HSSFSheet Hoja_hssf = Libro_trabajo.getSheetAt(0);
   Iterator Iterador_de_Fila = Hoja_hssf.rowIterator();
 
   while (Iterador_de_Fila.hasNext()) {
 
    HSSFRow Fila_hssf = (HSSFRow) Iterador_de_Fila.next();
    Iterator iterador = Fila_hssf.cellIterator();
    List lstDatosTmp = new ArrayList();
    while (iterador.hasNext()) {
 
     HSSFCell Celda_hssf = (HSSFCell) iterador.next();
     lstDatosTmp.add(Celda_hssf);
    }
    lstDatos.add(lstDatosTmp);
 
    }
 
   } catch (Exception e) {
   e.printStackTrace();
  }
 
 }
  
  
    private  void leerArchivoXLSX( String path, List lstDatos,String idNave) {
  
  try {

    FileInputStream fileInputStream = new FileInputStream(path);
    XSSFWorkbook Libro_trabajo = new XSSFWorkbook(fileInputStream);
    XSSFSheet Hoja_hssf = Libro_trabajo.getSheetAt(0);
    Iterator Iterador_de_Fila = Hoja_hssf.rowIterator();
 
    while (Iterador_de_Fila.hasNext()) {
    XSSFRow Fila_hssf = (XSSFRow) Iterador_de_Fila.next();
    Iterator iterador = Fila_hssf.cellIterator();
    List lstDatosTmp = new ArrayList();

       while (iterador.hasNext()) {
        XSSFCell Celda_hssf = (XSSFCell) iterador.next();
        lstDatosTmp.add(Celda_hssf);
       }

       lstDatos.add(lstDatosTmp);

      }
      
     } catch (Exception e) {

      e.printStackTrace();

     }
 
 }
    
    
     private  void leerDatos(String path,List Datos_celdas,String idNave) {
 
 
    String refArchivo="";
    String fecha="";
    String discrepancia="";
    String accion="";
    String codAta="";
  
     detalle= new ArrayList<Detalle>();
    
    for (int i = 0; i < Datos_celdas.size(); i++) {

     List Lista_celda_temporal = (List) Datos_celdas.get(i);

   if (antiguo) {

       HSSFCell col1 = (HSSFCell) Lista_celda_temporal.get(0);

       HSSFCell col2 = (HSSFCell) Lista_celda_temporal.get(1);

       HSSFCell col3 = (HSSFCell) Lista_celda_temporal.get(2);

       HSSFCell col4 = (HSSFCell) Lista_celda_temporal.get(3);

       HSSFCell col5 = (HSSFCell) Lista_celda_temporal.get(4);

       
//fecha,discrepancia,ACCIONT TOMADA,ATA,REFERENCIA
      refArchivo=col5.toString().trim();

      fecha=col1.toString();
     
      discrepancia=col2.toString();

      accion=col3.toString();

      codAta=col4.toString().trim();
       
      if(!util.validarInPut(refArchivo, fecha, discrepancia, accion, codAta, i+1)){
       return;   
      }
       detalle.add(new Detalle(idNave, refArchivo, fecha, discrepancia,accion,codAta)); 

      } else {
       XSSFCell col1 = (XSSFCell) Lista_celda_temporal.get(0);

       XSSFCell col2 = (XSSFCell) Lista_celda_temporal.get(1);

       XSSFCell col3 = (XSSFCell) Lista_celda_temporal.get(2);

       XSSFCell col4 = (XSSFCell) Lista_celda_temporal.get(3);

       XSSFCell col5 = (XSSFCell) Lista_celda_temporal.get(4);

      

        refArchivo=col5.toString().trim();

        fecha=col1.toString();

        discrepancia=col2.toString();

        accion=col3.toString();

        codAta=col4.toString().trim();
       if(!util.validarInPut(refArchivo, fecha, discrepancia, accion, codAta, i+1)){
       return;   
      }

      detalle.add(new Detalle(idNave, refArchivo,fecha, discrepancia,accion,codAta)); 
   
   }
   
  }
    
     if(grabaCabecera(path,detalle,idNave)){
       grabaDetalle(detalle);
        JOptionPane.showMessageDialog( null,"Archivo Registrado","Información",JOptionPane.INFORMATION_MESSAGE);
        DlgCabeceraArchivo cab=new DlgCabeceraArchivo();
        cab.setVisible(true);
       }else{
         JOptionPane.showMessageDialog( null,"No se pudo registrar el Archivo","Error",JOptionPane.ERROR_MESSAGE);
   
       }
      
  
   

 
 }
}
