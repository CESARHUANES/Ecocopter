
package ecocopter.util;

import javax.swing.text.AttributeSet;


public class LengthText extends javax.swing.text.PlainDocument {

    /** Almacena la longitud máxima del contenido del Objeto JTextField */
    int maxLength;

    /**
     *Constructor : Inicializa la longitud del Objeto JTextField.
     *@param pMaxLength Longitud máxima del contenido del Objeto.
     */
    public LengthText(int pMaxLength) {
        super();
        this.maxLength = pMaxLength;
    }

    /** 
     *Permite el ingreso de caracteres controlando no sobrepasar la longitud
     *máxima del contenido del Objeto.
     *@param pOffSet
     *@param pStr
     *@param pAttribute
     */
    public void insertString(int pOffSet, String pStr, 
                             AttributeSet pAttribute) {
        if (getLength() < maxLength)
            try {
                super.insertString(pOffSet, pStr, pAttribute);
            } catch (Exception e) {
            }
    }
}
