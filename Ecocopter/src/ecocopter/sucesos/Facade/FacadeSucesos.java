
package ecocopter.sucesos.Facade;


import ecocopter.sucesos.Bean.BeanAeronave;
import ecocopter.sucesos.Bean.BeanAreaResponsable;
import ecocopter.sucesos.Bean.BeanCategoria;
import ecocopter.sucesos.Bean.BeanClaseSuceso;
import ecocopter.sucesos.Bean.BeanDepartamento;
import ecocopter.sucesos.Bean.BeanEvento;
import ecocopter.sucesos.Bean.BeanFaseVuelo;
import ecocopter.sucesos.Bean.BeanMovimientoPublico;
import ecocopter.sucesos.Bean.BeanPlataforma;
import ecocopter.sucesos.Bean.BeanProveedor;
import ecocopter.sucesos.Bean.BeanReportador;
import ecocopter.sucesos.Dao.DBSucesos;
import ecocopter.sucesos.Interface.ConstantesSucesos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;



public class FacadeSucesos {
   
   public FacadeSucesos(){
       
             
          
         
   }
    public void lstCmbProveedor(JComboBox cmbProveedor){
          ArrayList lstProveedor=new ArrayList();
    
        try {
              
             lstProveedor=DBSucesos.lstCmbProveedor();
             VariablesSucesos.lstProveedor=lstProveedor;
           
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
            cmbProveedor.removeAllItems();
            cmbProveedor.addItem(new BeanProveedor("000","Seleccionar"));
            for (int i=0;i<lstProveedor.size();i++){
             String cod=((ArrayList)lstProveedor.get(i)).get(0).toString();
             String nom=((ArrayList)lstProveedor.get(i)).get(1).toString(); 
             cmbProveedor.addItem(new BeanProveedor(cod,nom));
            }
        
    }
     public void lstCmbReportador(JComboBox cmbReportador){
          ArrayList lstReportador=new ArrayList();
    
         try {
             lstReportador=DBSucesos.lstCmbPeportador();
              VariablesSucesos.lstReportador=lstReportador;
            
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
            cmbReportador.removeAllItems();
            cmbReportador.addItem(new BeanReportador("000","Seleccionar"));
            for (int i=0;i<lstReportador.size();i++){
             String cod=((ArrayList)lstReportador.get(i)).get(0).toString();
             String nom=((ArrayList)lstReportador.get(i)).get(1).toString(); 
             cmbReportador.addItem(new BeanReportador(cod,nom));
            }
        
    }
     public void lstCmbDepartamento(JComboBox cmbDepartamento){
          ArrayList lstDepartamento=new ArrayList();
     
         try {
             lstDepartamento=DBSucesos.lstCmbDepartamento();
             VariablesSucesos.lstDepartamento=lstDepartamento;
           
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
            cmbDepartamento.removeAllItems();
            cmbDepartamento.addItem(new BeanDepartamento("000","Seleccionar"));
            for (int i=0;i<lstDepartamento.size();i++){
             String cod=((ArrayList)lstDepartamento.get(i)).get(0).toString();
             String nom=((ArrayList)lstDepartamento.get(i)).get(1).toString(); 
             cmbDepartamento.addItem(new BeanDepartamento(cod,nom));
            }
       
    }
     
    public void lstCmbFaseVuelo(JComboBox cmbFaseVuelo){
        
     ArrayList lstFaseVuelo=new ArrayList();
     
         try {
             lstFaseVuelo=DBSucesos.lstCmbFaseVuelo();
              
            VariablesSucesos.lstFaseVuelo=lstFaseVuelo;
            
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
            cmbFaseVuelo.removeAllItems();
             cmbFaseVuelo.addItem(new BeanFaseVuelo("000","Seleccionar"));
            for (int i=0;i<lstFaseVuelo.size();i++){
             String cod=((ArrayList)lstFaseVuelo.get(i)).get(0).toString();
             String nom=((ArrayList)lstFaseVuelo.get(i)).get(1).toString(); 
             cmbFaseVuelo.addItem(new BeanFaseVuelo(cod,nom));
            }
       
    } 
     public void lstCmbAreaResponsable(JComboBox cmbAreaResponsable){
         ArrayList lstAreaResponsable=new ArrayList();
   
         try {
             lstAreaResponsable=DBSucesos.lstCmbAreaResponsable();
             VariablesSucesos.lstAreaResponsable=lstAreaResponsable;
            
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
            cmbAreaResponsable.removeAllItems();
            cmbAreaResponsable.addItem(new BeanAreaResponsable("000","Seleccionar"));
            for (int i=0;i<lstAreaResponsable.size();i++){
             String cod=((ArrayList)lstAreaResponsable.get(i)).get(0).toString();
             String nom=((ArrayList)lstAreaResponsable.get(i)).get(1).toString(); 
             cmbAreaResponsable.addItem(new BeanAreaResponsable(cod,nom));
            }
        
    } 
     public void lstCmbMovPublico(JComboBox cmbMovPublico){
           ArrayList lstMovPublico=new ArrayList();
     
         try {
             lstMovPublico=DBSucesos.lstCmbMovPublico();
             VariablesSucesos.lstMovPublico=lstMovPublico;
            
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
            cmbMovPublico.removeAllItems();
             cmbMovPublico.addItem(new BeanMovimientoPublico("000","Seleccionar"));
            for (int i=0;i<lstMovPublico.size();i++){
             String cod=((ArrayList)lstMovPublico.get(i)).get(0).toString();
             String nom=((ArrayList)lstMovPublico.get(i)).get(1).toString(); 
             cmbMovPublico.addItem(new BeanMovimientoPublico(cod,nom));
            }
       
    }
     public void lstCmbClaseSuceso(JComboBox cmbClaseSuceso){
         ArrayList lstClaseSuceso=new ArrayList();
     
         try {
             lstClaseSuceso=DBSucesos.lstCmbClaseSuceso();
             VariablesSucesos.lstClaseSuceso=lstClaseSuceso;
           
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
            cmbClaseSuceso.removeAllItems();
            cmbClaseSuceso.addItem(new BeanClaseSuceso("000","Seleccionar"));
            for (int i=0;i<lstClaseSuceso.size();i++){
             String cod=((ArrayList)lstClaseSuceso.get(i)).get(0).toString();
             String nom=((ArrayList)lstClaseSuceso.get(i)).get(1).toString(); 
             cmbClaseSuceso.addItem(new BeanClaseSuceso(cod,nom));
            }
       
    } 
    public void lstCmbCategoria(JComboBox cmbCategoria){
        ArrayList lstCategoriaSuceso=new ArrayList();
    
         try {
             lstCategoriaSuceso=DBSucesos.lstCmbCategoriaSuceso();
              VariablesSucesos.lstCategoriaSuceso=lstCategoriaSuceso;
            
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
            cmbCategoria.removeAllItems();
             cmbCategoria.addItem(new BeanCategoria("000","Seleccionar"));
            for (int i=0;i<lstCategoriaSuceso.size();i++){
             String cod=((ArrayList)lstCategoriaSuceso.get(i)).get(0).toString();
             String nom=((ArrayList)lstCategoriaSuceso.get(i)).get(1).toString(); 
             cmbCategoria.addItem(new BeanCategoria(cod,nom));
            }
        
    } 
     public void lstCmbEvento(JComboBox cmbEvento){
          ArrayList lstEventoSuceso=new ArrayList();
     
         try {
             lstEventoSuceso=DBSucesos.lstCmbEventoSuceso();
             VariablesSucesos.lstEventoSuceso=lstEventoSuceso;
           
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
           
    }
     public void lstCmbPlataforma(JComboBox cmbPlataforma){
         ArrayList lstPlataformaSuceso=new ArrayList();
      
         try {
             lstPlataformaSuceso=DBSucesos.lstCmbPlataforma();
              VariablesSucesos.lstPlataformaSuceso=lstPlataformaSuceso;
           
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
            cmbPlataforma.removeAllItems();
            cmbPlataforma.addItem(new BeanPlataforma("000","Seleccionar"));
            for (int i=0;i<lstPlataformaSuceso.size();i++){
             String cod=((ArrayList)lstPlataformaSuceso.get(i)).get(0).toString();
             String nom=((ArrayList)lstPlataformaSuceso.get(i)).get(1).toString(); 
             cmbPlataforma.addItem(new BeanPlataforma(cod,nom));
            }
        
    }
     public void lstCmbAeronave(JComboBox cmbAeronave){
         ArrayList lstAeronave=new ArrayList();
         try {
             lstAeronave=DBSucesos.lstCmbAeronave();
              VariablesSucesos.lstAeronave=lstAeronave;
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
            cmbAeronave.removeAllItems();
             cmbAeronave.addItem(new BeanAeronave("000","Seleccionar"));
            for (int i=0;i<lstAeronave.size();i++){
             String cod=((ArrayList)lstAeronave.get(i)).get(0).toString();
             String nom=((ArrayList)lstAeronave.get(i)).get(1).toString(); 
             cmbAeronave.addItem(new BeanAeronave(cod,nom));
            }
        
    }
     
     public boolean grabaSuceso(String pFecSuceso ,String pDesSuceso ,int pCodAeronave ,String pCodRep ,String pCodPro ,String
pClaseSuc ,String pCategoria ,String pCodEvento ,String pCodPla ,String pCodFase ,String pCodAreaResp ,
String pCodMov ,String pCodOr ,String pCodDes ,String pCodLug ,String pUsuCrea){
        boolean flag=true;
         String resultado="";
         
        try {
             
                 resultado=DBSucesos.grabaSuceso(pFecSuceso, pDesSuceso, pCodAeronave, pCodRep, pCodPro, pClaseSuc, pCategoria, pCodEvento, pCodPla, pCodFase, pCodAreaResp, pCodMov, pCodOr, pCodDes, pCodLug,pUsuCrea ).trim();    
                 System.out.println("Resultado"+resultado);
                 if(resultado.equalsIgnoreCase("N")){
                    flag=false; 
                      

                 }    
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
              flag=false; 
         }
         return flag;
     }
     public static ArrayList lstDatosSucesos(){
        ArrayList lstSucesos=new ArrayList();
         try {
             lstSucesos=DBSucesos.lstGrillaSucesos();
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
         return lstSucesos; 
     }
     public static Object[][] data(){
         ArrayList lstSucesos=lstDatosSucesos();
         int cantFila=lstSucesos.size();
         int cantColu=ConstantesSucesos.colNamesSuceso.length;
         Object[][] data=new Object[cantFila][cantColu];
         for(int f=0;f<cantFila;f++){
             for(int c=0;c<cantColu;c++){
                 String celda=((ArrayList)lstSucesos.get(f)).get(c).toString();
                 data[f][c]=celda;
             }
         }
         return data;
     }
     public boolean eliminaSuceso(String pCodSuceso,String pEstado){
      boolean flag=true;
      String resultado="";
         try {
             resultado=DBSucesos.eliminaSuceso(pCodSuceso, pEstado).trim();
             if(resultado.equalsIgnoreCase("N")){
             flag=false;
            }
         } catch (SQLException ex) {
             flag=false;
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
      
         return flag;   
     }
public boolean actualizaSuceso(String pCodSuceso,String pFecSuceso ,String pDesSuceso ,int pCodAeronave ,String pCodRep ,String pCodPro ,String
pClaseSuc ,String pCategoria ,String pCodEvento ,String pCodPla ,String pCodFase ,String pCodAreaResp ,
String pCodMov ,String pCodOr ,String pCodDes ,String pCodLug ,String pUsuCrea){
        boolean flag=true;
         String resultado="";
         
        try {
             
                 resultado=DBSucesos.actualizaSuceso(pCodSuceso,pFecSuceso, pDesSuceso, pCodAeronave, pCodRep, pCodPro, pClaseSuc, pCategoria, pCodEvento, pCodPla, pCodFase, pCodAreaResp, pCodMov, pCodOr, pCodDes, pCodLug,pUsuCrea ).trim();    
                 System.out.println("Resultado"+resultado);
                 if(resultado.equalsIgnoreCase("N")){
                    flag=false; 
                     
                 }    
         } catch (SQLException ex) {
              flag=false; 
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
             
         }
         return flag;
     }

 public static  ArrayList lstDatosSucesos(String pCodSuceso){
        ArrayList lstSucesos=new ArrayList();
         try {
             lstSucesos=DBSucesos.lstGrillaSucesos(pCodSuceso);
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
         return lstSucesos; 
     }

}
