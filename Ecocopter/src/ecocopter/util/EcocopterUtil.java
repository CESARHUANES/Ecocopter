
package ecocopter.util;

import ecocopter.dao.Conexion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class EcocopterUtil {
    public EcocopterUtil(){
        
    }
   public void verificaConexion(){
   Connection miConexion;
        miConexion=Conexion.GetConnection();
      
        if(miConexion!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexión  Correcta con Base de Datos","Información",JOptionPane.INFORMATION_MESSAGE);
        }else{
         JOptionPane.showMessageDialog( null,"No hay Conexión con la Base de Datos.!","Error",JOptionPane.WARNING_MESSAGE);   
   
        }  
  }
   //fecha,discrepancia,ACCIONT TOMADA,ATA,REFERENCIA
    public boolean validarInPut(String refArchivo,String fecha,String discrepancia,String accion,String codAta, int fila){
   boolean flag=true;
   if( fecha==null || fecha.length()==0){
    JOptionPane.showMessageDialog( null,"Dato no valido en la fila: "+fila+" columna: 1\n La longitud de caracteres debe ser igual a 10 o no nullo.","Error de contenido de archivo."+fecha,JOptionPane.WARNING_MESSAGE);   

     flag= false;  
   }
   if(validaFecha(fecha,"dd/mm/yyyy")){
        JOptionPane.showMessageDialog( null,"Formato de Fecha no valido en la fila: "+fila+" columna: 1\n La longitud de caracteres debe ser igual a 10 o no nullo.","Error de contenido de archivo."+fecha,JOptionPane.WARNING_MESSAGE);   

       flag= false;   
   }
   if(discrepancia.length()>500 || discrepancia==null || discrepancia.length()==0){
    JOptionPane.showMessageDialog( null,"Dato no valido en la fila: "+fila+" columna: 2\n La longitud de caracteres debe ser menor a 225 o no nullo.","Error de contenido de archivo.",JOptionPane.WARNING_MESSAGE);   

     flag= false;  
   }
   if(accion.length()>500 || accion==null || accion.length()==0){
    JOptionPane.showMessageDialog( null,"Dato no valido en la fila: "+fila+" columna: 3\n La longitud de caracteres debe ser menor a 225 o no nullo.","Error de contenido de archivo.",JOptionPane.WARNING_MESSAGE);   

     flag= false;  
   }
   if(codAta.length()>4 || codAta==null ||codAta.length()==0){
    JOptionPane.showMessageDialog( null,"Dato no valido en la fila: "+fila+" columna: 4\n La longitud de caracteres debe ser menor a 3 o no nullo.","Error de contenido de archivo.",JOptionPane.WARNING_MESSAGE);   

    flag= false;  
   }
   if(refArchivo.length()>10 || refArchivo==null || refArchivo.length()==0){
    JOptionPane.showMessageDialog( null,"Dato no valido en la fila: "+fila+" columna: 5\n La longitud de caracteres debe ser menor a 10 o no nullo.","Error de contenido de archivo.",JOptionPane.WARNING_MESSAGE);   
    
    flag= false; 
   }
   
   
   
  
    
   return flag;
   }
    
     public String getMes(int mes){
    String meses="";
    switch(mes) {        
        case 1:
        meses="enero";
        break;
        case 2:
        meses="febrero";
        break;
        case 3:
        meses="marzo";
        break;
        case 4:
        meses="abril";
        break;
        case 5:
        meses="mayo";
        break;
        case 6:
        meses="junio";
        break;
        case 7:
        meses="julio";
        break;
        case 8:
        meses="agosto";
        break;
        case 9:
        meses="setiembre";
        break;
        case 10:
        meses="octubre";
        break;
        case 11:
        meses="noviembre";
        break;
        case 12:
        meses="diciembre";
        break; 

        }
    return meses.trim();  
    }
     public static boolean validaFecha(String pValue, String pDateFormat) {
        try {
            if (!pValue.equals("")) {
                int contaSlash = 0;
                char[] fecha = pValue.toCharArray();
                for (int i = 0; i < fecha.length; i++) {
                    if (fecha[i] == '/')
                        contaSlash += 1;
                }
                if (contaSlash > 2)
                    return false;
                else {
                    SimpleDateFormat formatter =   new SimpleDateFormat(pDateFormat);
                      
                    formatter.setLenient(false);
                    String dateString = 
                        formatter.format(formatter.parse(pValue));
                    return true;
                }
            } else {
                return false;
            }
        } catch (ParseException e) {
            return false;
        }
    }
 public static void moveFocus(Object pObject) {
        if (pObject instanceof JTextField) {
            ((JTextField)pObject).selectAll();
            ((JTextField)pObject).requestFocus();
        } else if (pObject instanceof JComboBox)
            ((JComboBox)pObject).requestFocus();
        else if (pObject instanceof JList)
            ((JList)pObject).requestFocus();
        else if (pObject instanceof JRadioButton)
            ((JRadioButton)pObject).requestFocus();
        else if (pObject instanceof JTable)
            ((JTable)pObject).requestFocus();
        else if (pObject instanceof JRadioButton)
            ((JRadioButton)pObject).requestFocus();
        else if (pObject instanceof JTextArea)
            ((JTextArea)pObject).requestFocus();
        else if (pObject instanceof JCheckBox)
            ((JCheckBox)pObject).requestFocus();
        else if (pObject instanceof JButton)
            ((JButton)pObject).requestFocus();
    }
 public static void dateComplete(JTextField pJTextField, KeyEvent e) {
        try {
            String anhoBD = 
                getFechaHoraBD(1).trim().substring(6, 10);
            char keyChar = e.getKeyChar();
            if (Character.isDigit(keyChar)) {
                if ((pJTextField.getText().trim().length() == 2) || 
                    (pJTextField.getText().trim().length() == 5)) {
                    pJTextField.setText(pJTextField.getText().trim() + "/");
                    if (pJTextField.getText().trim().length() == 6)
                        pJTextField.setText(pJTextField.getText().trim() + 
                                            anhoBD);
                }
            }
        } catch (SQLException errAnhoBD) {
            errAnhoBD.printStackTrace();
        }
    }
 public static String getFechaHoraBD(int pTipo) throws SQLException {
        String fechahora = "";
        String query = 
            "SELECT TO_CHAR(SYSDATE,'dd/mm/yyyy hh24:mi:ss') FROM DUAL";
        Statement stmt = 
            ((Connection)Conexion.GetConnection()).createStatement();
        // Ejecutar el query haciendo uso de la conexión por default
        ResultSet results = stmt.executeQuery(query);
        if (results.next())
            fechahora = results.getString(1);
        results.close();
        stmt.close();
       
        if (fechahora.trim().length() > 0 && 
            pTipo == 3)
            fechahora = fechahora.substring(0, 10);

        if (fechahora.trim().length() > 0 && 
            pTipo == 3)
            fechahora = fechahora.substring(11, 19);

        return fechahora;
    }
 
  public static void setValueCmb(JComboBox cmb,ArrayList lstValue,String codigo){
        
    for(int i=0;i<lstValue.size();i++){
      if(codigo.trim().equalsIgnoreCase(((ArrayList)lstValue.get(i)).get(0).toString().trim())){
          cmb.setSelectedIndex(i+1);
          break;
      }  
    }   
   
}
}
