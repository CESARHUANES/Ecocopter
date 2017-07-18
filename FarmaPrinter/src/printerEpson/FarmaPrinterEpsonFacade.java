/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package printerEpson;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import printerUtil.FarmaUtil;

/**
 * @author Cesar Huanes
 * @since  21/07/2014
 * @version  1.2
 */
public class FarmaPrinterEpsonFacade implements FarmaPrinterEpsonInterface{
    private String ruta=null;
    private PrintStream ps=null;
    private final FarmaUtil util=new FarmaUtil();
    private final FarmaPrinterEpsonBuilder epson=new FarmaPrinterEpsonBuilder();
    public FarmaPrinterEpsonFacade(){
    }
    public FarmaPrinterEpsonFacade(String ruta){
   
    this.ruta=ruta;
    }

    @Override
    public boolean startPrintService() {
    boolean flag=false;
    FileOutputStream fos=null;
    try {
    fos=new FileOutputStream(this.getRuta());
    ps=new PrintStream(fos);
    flag=true;
    } catch (FileNotFoundException ex) {
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterEpsonFacade.class.getName()).log(Level.SEVERE, message, ex);       
    }
    return flag;
    }
   

    @Override
    public void printCodePDF417(String trama ) {
    try {
       
    int longitudTrama=trama.getBytes().length;
    System.out.print("trama long"+longitudTrama);
    int nl=trama.getBytes().length%256;
    int nh=trama.getBytes().length/256;
    ps.write(epson.setCenterPDF417());
    ps.write(epson.setNumRowsPDF417());
    ps.write(epson.setRowHeigth());
    ps.write(epson.setCorrectionLevel());
    ps.write(epson.setParameter1PDF417());
    ps.write(epson.setParameter2PDF417());
    ps.write(epson.setOption());
    ps.write(epson.setParameter3PDF417(nl,nh));
    ps.write(trama.getBytes());
    ps.write(epson.setParameter4PDF417());
    ps.write(epson.setDimension());
    ps.write(epson.setLefth());
    } catch (IOException ex) {
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterEpsonFacade.class.getName()).log(Level.SEVERE, message, ex);
    }
    }

    @Override
    public void printCodeQR(String trama) {
    try {
    int longitudTrama=trama.getBytes().length;
    ps.write(epson.setParameter1QR());
    ps.write(epson.setParameter2QR());
    ps.write(epson.setParameter3QR());
    ps.write(epson.setParameter4QR(longitudTrama));
    ps.write(trama.getBytes("utf8"));  
    ps.write(epson.setParameter5QR());
    } catch (IOException ex) {
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterEpsonFacade.class.getName()).log(Level.SEVERE, message, ex);
    }
    }

    @Override
    public void cutPaper() {
    try {
    ps.write(epson.setCutPaper());
    } catch (IOException ex) {
     String message;
    message = ex.getMessage();  
    Logger.getLogger(FarmaPrinterEpsonFacade.class.getName()).log(Level.SEVERE, message, ex);
    }
    }

    @Override
    public void endPrintService() {
    try{    
    ps.flush();
    for(int i=0;i<5;i++){
    ps.println();}
    this.cutPaper();
    ps.close();
    }catch(Exception ex){
    String message;
    message = ex.getMessage(); 
    Logger.getLogger(FarmaPrinterEpsonFacade.class.getName()).log(Level.SEVERE, message, ex);
    }    
    }

    @Override
    public void printUnderLine(String texto) {
    try {
    ps.write(epson.feedLine());     
    ps.write(epson.setFontB());
    ps.write(epson.setUnderLine());
    ps.write(texto.getBytes());
    ps.write(epson.setOffUnderLine());
    ps.write((byte)(char)10);
    } catch (IOException ex) {
    String message;
    message = ex.getMessage();     
    Logger.getLogger(FarmaPrinterEpsonFacade.class.getName()).log(Level.SEVERE, message, ex);
    }
    }

    @Override
    public void printLine(String texto) {
    try {
    ps.write(epson.feedLine());
    ps.write(epson.setFontB());
    ps.write(texto.getBytes());
    ps.write((byte)(char)10);  
    } catch (IOException ex) {
    String message;
    message = ex.getMessage();    
    Logger.getLogger(FarmaPrinterEpsonFacade.class.getName()).log(Level.SEVERE, message, ex);
    }
    }

    @Override
    public String printLineCenter(String texto) {
    try {
    ps.write(epson.feedLine());    
    ps.write(epson.setCenter());
    ps.write(epson.setFontB());
    ps.write(texto.getBytes());
    ps.write((byte)(char)10);
    ps.write(epson.setLefth());
    } catch (IOException ex) {
    String message;
    message = ex.getMessage();   
    Logger.getLogger(FarmaPrinterEpsonFacade.class.getName()).log(Level.SEVERE, message, ex);
    }
    return texto.getBytes().toString();
    }

    @Override
    public void stepLine() {
    try{
    ps.println();
    }catch(Exception ex){
    String message;
    message = ex.getMessage();    
    Logger.getLogger(FarmaPrinterEpsonFacade.class.getName()).log(Level.SEVERE, message, ex);
    }    
    }

    @Override
    public void printLineBold(String texto) {
    try{
    ps.write(epson.feedLine());      
    ps.write(epson.setOnPrintBold());//pendiente no funciona
    ps.println(texto);
    ps.write(epson.setOffPrintBold());
   
    }catch (IOException ex) {
    String message;
    message = ex.getMessage(); 
    Logger.getLogger(FarmaPrinterEpsonFacade.class.getName()).log(Level.SEVERE, message, ex);
    }
    }

    @Override
    public void printLineDoubleSize(String texto) {
    try {
    ps.write(epson.feedLine());
    ps.write(epson.setCenter());//
    ps.write(epson.setOnPrintBold());//
    ps.write(epson.setFontA());
    ps.write(texto.getBytes());
    ps.write(epson.setOffPrintBold());//
    ps.write(epson.setFontB());
    ps.write((byte)(char)10);
    ps.write(epson.setLefth());//
    } catch (IOException ex) {
    String message;
    message = ex.getMessage();     
    Logger.getLogger(FarmaPrinterEpsonFacade.class.getName()).log(Level.SEVERE, message, ex);
    }
        
    }

    @Override
    public String printEspacioBlanco(int numEspacio) {
    return util.espacioBlanco(numEspacio);
    }

    @Override
    public void printLineDotted(int maxPoint) {
    ps.println(util.guion(maxPoint));
    }

    @Override
    public void printLineRigth(String texto) {
    try {
    ps.write(epson.setFontB());
    ps.write(epson.setRigth());
    ps.write(texto.getBytes());
    ps.write((byte)(char)10);
    ps.write(epson.setLefth());
    } catch (IOException ex) {
    String message;
    message = ex.getMessage();    
    Logger.getLogger(FarmaPrinterEpsonFacade.class.getName()).log(Level.SEVERE, message, ex);
    }
    }

    @Override
    public String alineaMontos(String texto) {
    return util.alineaMontos(texto);
    }

    @Override
    public String alineaDetalle(String codigo, String descripcion, String cant, String preUni,String desc, String importe) {
    return util.alineaDetalle(codigo, descripcion, cant, preUni,desc, importe);
    }

    @Override
    public void inicializate() {
     try {
    ps.write(epson.inicializate());
    } catch (IOException ex) {
    String message;
    message = ex.getMessage();     
    Logger.getLogger(FarmaPrinterEpsonFacade.class.getName()).log(Level.SEVERE, message, ex);
    }  
    }
     
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

}
