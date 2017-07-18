
package ecocopter.usuarios.Interface;




import javax.swing.JDialog;

import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UtilValidaDatos {
     private static final Logger log = LoggerFactory.getLogger(UtilValidaDatos.class);
  public static boolean isDniCorrecto(String dni){
    boolean flag=true;  
     if(dni.length()==8){
          char[] documento=dni.toCharArray();
         for(int i=0;i<documento.length;i++){
            
             System.out.print("Digito 1 :"+documento[i]);
             if(!Character.isDigit(documento[i])){
            System.out.print("Digito 2"+documento[i]);
          flag=false;
          break;
             }
           }
                 
     } else{
         
         flag=false;
         
     }
      return flag;
  }  
  public static boolean isContrasenaIgual(String pPassword,String pRepeatPassword){
      if(pPassword.equals(pRepeatPassword)){
       return true;   
      }else{
          return false;
      }
  }
 public static   boolean isConstrasenaValida(String pPassword){
         int cantNumero=0;
         int cantMinuscula=0;
         int cantMayuscula=0;
         boolean flag=false;
     
         char[] cadena=pPassword.toCharArray();
        
         for(int i=0;i<cadena.length;i++){
             if(Character.isDigit(cadena[i])){
                 cantNumero++;
             }
             if(Character.isLowerCase(cadena[i])){
                 cantMinuscula++;
             }
             if(Character.isUpperCase(cadena[i])){
                 cantMayuscula++;
             }
             
         }
         log.info("Cantidad de numeros"+cantNumero);
         log.info("cantidad de minusculas"+cantMinuscula);
         log.info("cantidad de mayusculas"+cantMayuscula);
         if(cantNumero==0){
             JOptionPane.showMessageDialog(new JDialog(),"El password debe contener al menos un numero.", "Información",JOptionPane.INFORMATION_MESSAGE);
                      
           flag=false;  
         
         }
         if(cantMinuscula==0){
             JOptionPane.showMessageDialog(new JDialog(),"El password debe contener al menos una letra minuscula.",
                     "Información",JOptionPane.INFORMATION_MESSAGE); 
           flag=false;  
         }
         if(cantMayuscula==0){
             JOptionPane.showMessageDialog(new JDialog(),"El password debe contener al menos una letra mayuscula.",
                     "Información",JOptionPane.INFORMATION_MESSAGE); 
           flag=false;  
         }
         if(cantNumero>0 && cantMinuscula>0 && cantMayuscula>0 ){
             flag= true;
         }
     
     return flag;
 }
}
