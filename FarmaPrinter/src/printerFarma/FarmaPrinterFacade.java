/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package printerFarma;

import printerEpson.FarmaPrinterEpsonFacade;
import printerStar.FarmaPrinterStarFacade;

/**
 * @author Cesar Huanes
 * @since  21-07-2014
 * @version  1.0
 */
public class FarmaPrinterFacade implements FarmaPrinterInterface  {
private String modelo;
private String ruta;
FarmaPrinterStarFacade  star;
FarmaPrinterEpsonFacade epson;
 public FarmaPrinterFacade(){
 }
  public FarmaPrinterFacade(String mod,String rut){
  this.modelo=mod;
  this.ruta=rut;
  if(this.modelo.equalsIgnoreCase("EPSON")){
  epson=new FarmaPrinterEpsonFacade(this.ruta) ;}
   if(this.modelo.equalsIgnoreCase("START")){
  star=new FarmaPrinterStarFacade(this.ruta);}
 
  }
 
    @Override
    public boolean startPrintService() {
    boolean flag = false;
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
    //epson=new FarmaPrinterEpsonFacade(this.getRuta()) ;   
    flag=getEpson().startPrintService();
    System.out.println("Ingreso al Epson printer" +flag);
    }
    if(this.getModelo().equalsIgnoreCase("START")){
    //star=new FarmaPrinterStarFacade(this.getRuta());
    flag=getStar().startPrintService();
    System.out.println("Ingreso al star printer" +flag);
    }
   
    return flag;
    }

    @Override
    public void printCodePDF417(String trama) {
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
     getEpson().printCodePDF417(trama);
    }
    if(this.getModelo().equalsIgnoreCase("START")){
     getStar().printCodePDF417(trama);
    }
      
    }

    @Override
    public void printCodeQR(String trama) {
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
    getEpson().printCodeQR(trama);
    }
    if(this.getModelo().equalsIgnoreCase("START")){
    getStar().printCodeQR(trama);
    }    
    }

    @Override
    public void endPrintService() {
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
      getEpson().endPrintService();
    }
    if(this.getModelo().equalsIgnoreCase("START")){
      getStar().endPrintService();
    }    
    }

    @Override
    public void cutPaper() {
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
     getEpson().cutPaper();
    }
    if(this.getModelo().equalsIgnoreCase("START")){
     getStar().cutPaper();
    }    
    }

    @Override
    public void stepLine() {
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
     getEpson().stepLine();
    }
    if(this.getModelo().equalsIgnoreCase("START")){
    getStar().stepLine();
    }    
    }

    @Override
    public void printLineBold(String texto) {
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
    getEpson().printLineBold(texto);
    }
    if(this.getModelo().equalsIgnoreCase("START")){
     getStar().printLineBold(texto);
    }    
    }

    @Override
    public void printUnderLine(String texto) {
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
     getEpson().printUnderLine(texto);
    }
    if(this.getModelo().equalsIgnoreCase("START")){
    getStar().printUnderLine(texto);
    }    
    }

    @Override
    public void printLine(String texto) {
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
       getEpson().printLine(texto);
    }
    if(this.getModelo().equalsIgnoreCase("START")){
       getStar().printLine(texto);
    }    
    }

    @Override
    public void printLineDoubleSize(String texto) {
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
      getEpson().printLineDoubleSize(texto);
    }
    if(this.getModelo().equalsIgnoreCase("START")){
      getStar().printLineDoubleSize(texto);
    }    
    }

    @Override
    public String printLineCenter(String texto) {
    String valor=null;
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
    valor=  getEpson().printLineCenter(texto);
    }
    if(this.getModelo().equalsIgnoreCase("START")){
    valor=  getStar().printLineCenter(texto);
    }
    return valor;
    }

    @Override
    public String printEspacioBlanco(int numEspacio) {
    String espacio=null;
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
    espacio=getEpson().printEspacioBlanco(numEspacio);
    }
    if(this.getModelo().equalsIgnoreCase("START")){
    espacio=getStar().printEspacioBlanco(numEspacio);
    }
    return espacio;
    }

    @Override
    public void printLineDotted(int maxPoint) {
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
     getEpson().printLineDotted(maxPoint);
     }
    if(this.getModelo().equalsIgnoreCase("START")){
     getStar().printLineDotted(maxPoint);
    }    
    }
 
    @Override
    public void printLineRigth(String texto) {
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
    getEpson().printLineRigth(texto);
    }
    if(this.getModelo().equalsIgnoreCase("START")){
    getStar().printLineRigth(texto);
    }    
    }

    @Override
    public String alineaMontos(String texto) {
    String ajuste=null;
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
    ajuste= getEpson().alineaMontos(texto);
    }
    if(this.getModelo().equalsIgnoreCase("START")){
    ajuste= getStar().alineaMontos(texto);
    }
    return ajuste;
    }

    @Override
    public String alineaDetalle(String codigo, String descripcion, String cant, String preUni,String desc, String importe) {
    String alinea=null;
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
    alinea= getEpson().alineaDetalle(codigo, descripcion, cant, preUni,desc, importe);
    }
    if(this.getModelo().equalsIgnoreCase("START")){
    alinea= getStar().alineaDetalle(codigo, descripcion, cant, preUni,desc, importe);
    }
    return alinea;
    }

    @Override
    public void inicializate() {
    if(this.getModelo().equalsIgnoreCase("EPSON")){   
    getEpson().inicializate();
    }
    if(this.getModelo().equalsIgnoreCase("START")){
    getStar().inicializate();
    }    
    }
  
    public String getModelo() {
        return modelo;
    }

   
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    public String getRuta() {
        return ruta;
    }

  
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

   
    public FarmaPrinterStarFacade getStar() {
        return star;
    }

  
    public FarmaPrinterEpsonFacade getEpson() {
        return epson;
    }

 
}
