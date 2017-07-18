
package ecocopter.usuarios.Facade;

import ecocopter.sucesos.Facade.FacadeSucesos;
import ecocopter.usuarios.Bean.BeanRol;
import ecocopter.usuarios.Dao.DBUsuarios;
import ecocopter.util.EcocopterVariables;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class FacadeUsuarios {
    
     public void lstCmbRol(JComboBox cmbRol){
          ArrayList lstRoles =new ArrayList();   
    
        try {
              
             lstRoles=DBUsuarios.lstCmbRoles();            
           
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
            cmbRol.removeAllItems();
            cmbRol.addItem(new BeanRol("000","Seleccionar"));
            for (int i=0;i<lstRoles.size();i++){
             String cod=((ArrayList)lstRoles.get(i)).get(0).toString();
             String nom=((ArrayList)lstRoles.get(i)).get(1).toString(); 
             cmbRol.addItem(new BeanRol(cod,nom));
            }
        
    }
      public boolean grabaUsuario(String pDni,String pPaterno,String pMaterno,String pNombres,
             String pUsuario,String pPassword,String pEstado,String pUsuCreacion){
        boolean flag=true;
        String resultado="";
         
        try {
             
                 resultado=DBUsuarios.grabaUsuario(pDni, pPaterno, pMaterno, pNombres, pUsuario, pPassword, pEstado, pUsuCreacion).trim();    
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
      
      public boolean isDni(String pDni){
       boolean flag=true;
         String resultado="";
         
        try {
             
                 resultado=DBUsuarios.isExisteDni(pDni).trim();    
                 System.out.println("Resultado"+resultado);
                 if(resultado.equalsIgnoreCase("S")){
                    flag=false; 
                      

                 }    
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
              flag=false; 
         }
         return flag;
      }
      public ArrayList lstUsuarioRol(){
           ArrayList lstUsuRol=new ArrayList();
         try {
             lstUsuRol=DBUsuarios.lstUsuarioRoles();
         } catch (SQLException ex) {
             Logger.getLogger(FacadeUsuarios.class.getName()).log(Level.SEVERE, null, ex);
         }
         return lstUsuRol;
      }
       public boolean isUsuario(String pUsuario){
       boolean flag=true;
         String resultado="";
         
        try {
             
                 resultado=DBUsuarios.isExisteUsuario(pUsuario).trim();    
                 System.out.println("Resultado"+resultado);
                 if(resultado.equalsIgnoreCase("S")){
                    flag=false; 
                      

                 }    
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
              flag=false; 
         }
         return flag;
      }
       public boolean isAsignaRolUsuario(String pDni,String pRol,String pRol2,String pFechaCad,String pUsuCrea){
        boolean flag=false;
        String resultado="";
        try {
             
                 resultado=DBUsuarios.isAsignaRolUsuario(pDni, pRol,pRol2, 
                         pFechaCad, pUsuCrea).trim();    
                 System.out.println("Resultado"+resultado);
                 if(resultado.equalsIgnoreCase("S")){
                    flag=true; 
                      

                 }    
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
              flag=false; 
         }
        return flag;
       }
        public boolean actualizaUsuario(String pDni,String pPaterno,String pMaterno,String pNombres,
             String pUsuario,String pPassword,String pEstado,String pUsuCreacion){
        boolean flag=true;
        String resultado="";
         
        try {
             
                 resultado=DBUsuarios.actualizaUsuario(pDni, pPaterno, pMaterno, pNombres, pUsuario, pPassword, pEstado, pUsuCreacion).trim();    
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
        public boolean autentificaUsuario(String pUsuario,String pContrasena){
         boolean flag=true;
         String resultado="";
         try{
             resultado=DBUsuarios.autentificaUsuario(pUsuario, pContrasena).trim();
             if(resultado.equalsIgnoreCase("N")){
                 flag=false;
             }
             if(resultado.equalsIgnoreCase("S")){
                 EcocopterVariables.vUsuario=pUsuario;
                 System.out.println("Usuario"+EcocopterVariables.vUsuario);
                 flag=true;
             }
             
         }catch(SQLException ex){
              Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
              flag=false; 
         }
         return flag;
     }
}
