
package ecocopter.util;

import javax.swing.JTextField;


public class JTextFieldUtil {
    public JTextFieldUtil(){
        
    }
    public void JTexttoUpper(JTextField jTextField){
      String cadena=(jTextField.getText()).toUpperCase();
      jTextField.setText(""); 
     jTextField.setText(cadena);  
    }
}
