
package ecocopter.usuarios.Bean;


public class BeanRol {
private String codRol="";
private String nomRol="";
public BeanRol(String codRol,String nomRol){
 this.codRol=codRol;
 this.nomRol=nomRol;
}
@Override
    public String toString(){ 
        return getNomRol();
    }    

    /**
     * @return the codRol
     */
    public String getCodRol() {
        return codRol;
    }

    /**
     * @return the nomRol
     */
    public String getNomRol() {
        return nomRol;
    }

  
   
}
