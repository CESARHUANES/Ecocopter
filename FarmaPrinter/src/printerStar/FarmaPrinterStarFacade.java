

package printerStar;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import printerUtil.FarmaUtil;


/**
 *
 * @author Cesar Huanes
 * @since  21/07/2014
 * @version  1.2
 */
public class FarmaPrinterStarFacade  implements FarmaPrinterStarInterface{
    String ruta=null;
    PrintStream ps=null;
    private final FarmaUtil util=new FarmaUtil();
    private final FarmaPrinterStarBuilder star=new FarmaPrinterStarBuilder();
    public FarmaPrinterStarFacade(){
    
    }
    
    public FarmaPrinterStarFacade(String ruta){
    this.ruta=ruta;
    }
    
    @Override
    public boolean startPrintService(){
    boolean flag=false;
    FileOutputStream fos=null;
    try {
    fos=new FileOutputStream(this.getRuta());
    ps=new PrintStream(fos);
    flag=true;
    } catch (FileNotFoundException ex) {
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterStarFacade.class.getName()).log(Level.SEVERE, message, ex);       
    }
    return flag;
    }
    
    @Override
    public void printCodePDF417(String trama){
  
    try {
  
    int nBytesCodeData=trama.getBytes().length;
    System.out.print("trama long"+nBytesCodeData);
    int nl=trama.getBytes().length%256;
    int nh=(trama.getBytes().length/256);
    ps.flush();
    ps.write(star.setPrintCenter());
    ps.write(star.setModelCodeBarraPDF417());
    ps.write(star.setEscaleNivelPDF417());
    ps.write(star.setDirectionXPDF417());
    ps.write(star.setRatioPDF417());
    ps.write(star.setDataPDF417(nl,nh));
    ps.write(trama.getBytes());
    ps.write(star.setBarCodeExpantionPDF417());//OPCIONAL
    ps.write(star.setPrintPDF417());
    ps.write(star.setPrintLefth());
    } catch (IOException ex) {
     String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterStarFacade.class.getName()).log(Level.SEVERE, message, ex);  
    }
    }
    
    @Override
    public void printCodeQR(String trama){
        
    try {
    int nBytesCodeData=trama.getBytes().length;
    ps.flush();
    ps.write(star.setModelCodeBarraQR());
    ps.write(star.setEscaleNivelQR());
    ps.write(star.setDirectionXQR());
    ps.write(star.setDataQR(nBytesCodeData));
    ps.write(trama.getBytes());
    ps.write(star.setBarCodeExpantionQR());
    ps.write(star.setPrintQR());
    ps.println();  
    } catch (IOException ex) {
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterStarFacade.class.getName()).log(Level.SEVERE, message, ex);  
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
    Logger.getLogger(FarmaPrinterStarFacade.class.getName()).log(Level.SEVERE, message, ex);  
    }
    }
    
    @Override
    public void cutPaper() {
    try {
    ps.write(star.cutePaper());
    } catch (IOException ex) {
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterStarFacade.class.getName()).log(Level.SEVERE, message, ex);  
    }
    }

    @Override
    public void stepLine() {
    try{
    ps.println();
    }catch(Exception ex){
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterStarFacade.class.getName()).log(Level.SEVERE, message, ex);  
    }
    }

    @Override
    public void printLineBold(String texto) {
    try{
    ps.write(star.feedLine());
    ps.print(star.getActivateBold());
    ps.println(texto);
    ps.print(star.getDeactivateBold());
    }catch(IOException ex){
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterStarFacade.class.getName()).log(Level.SEVERE, message, ex);  
    }
   
    }

    @Override
    public void printUnderLine(String texto) {
    try{
    ps.write(star.feedLine());
    ps.write(star.setFont());
    ps.print(star.getActivateUnderline());
    ps.println(texto);
    ps.print(star.getDeactivateUnderline());
    }
    catch(IOException ex){
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterStarFacade.class.getName()).log(Level.SEVERE, message, ex);  
    }
    }
    
    @Override
    public void printLine(String texto) {
   
    try{  
    ps.write(star.feedLine());    
    ps.write(star.setFont());
    ps.write(texto.getBytes());
    ps.write((byte)(char)10);
    }catch(IOException ex){
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterStarFacade.class.getName()).log(Level.SEVERE, message, ex);  
    }
    }

    @Override
    public void printLineDoubleSize(String texto) {
    try{
    ps.write(star.feedLine());
    ps.write(star.setPrintCenter());//
    ps.print(star.getActivateDoubleWidthMode());
    ps.println(texto);
    ps.write(star.setPrintLefth());  
    ps.print(star.getDeactivateDoubleWidthMode());
   
    }catch(IOException ex){
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterStarFacade.class.getName()).log(Level.SEVERE, message, ex);  
    }   
    }

    @Override
    public String printLineCenter(String texto) {
    try {
    ps.write(star.feedLine());       
    ps.write(star.setFont());
    ps.write(star.setPrintCenter());
    ps.write(texto.getBytes());
    ps.write((byte)(char)10);
    ps.write(star.setPrintLefth());   
    } catch (IOException ex) {
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterStarFacade.class.getName()).log(Level.SEVERE, message, ex);  
    }
    return texto.getBytes().toString();
    }

    @Override
    public String printEspacioBlanco(int numEspacio) {
    return  util.espacioBlanco(numEspacio);
    }

    @Override
    public void printLineDotted(int maxPoint) {
    ps.println(util.guion(maxPoint));
   }

    @Override
    public void printLineRigth(String texto) {
    try {
    ps.write(star.feedLine());    
    ps.write(star.setFont());
    ps.write(star.setPrintRigth());
    ps.write(texto.getBytes());
    ps.write((byte)(char)10);
    ps.write(star.setPrintLefth());
    } 
    catch (IOException ex) {
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterStarFacade.class.getName()).log(Level.SEVERE, message, ex);  
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
    ps.write(star.inicializate());
    } catch (IOException ex) {
    String message;
    message = ex.getMessage();
    Logger.getLogger(FarmaPrinterStarFacade.class.getName()).log(Level.SEVERE, message, ex);  
    }
    }
    
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

   

   
    
}
