
package ecocopter.sucesos.Bean;

public class BeanAreaResponsable {
private String codAreaResponsable="";
 private String nomAreaResponsable="";
 public BeanAreaResponsable(String codAreaResponsable,String nomAreaResponsable){
 this.codAreaResponsable=codAreaResponsable;
 this.nomAreaResponsable=nomAreaResponsable;
 }

    public String getCodAreaResponsable() {
        return codAreaResponsable;
    }

    public String getNomAreaResponsable() {
        return nomAreaResponsable;
    }
    
    @Override
    public String toString(){ 
        return getNomAreaResponsable();
    }
    
}
