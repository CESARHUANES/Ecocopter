
package ecocopter.sucesos.Bean;

public class BeanProveedor {
 private String codProveedor="";
 private String nomProveedor="";
 public BeanProveedor(String codProveedor,String nomProveedor){
 this.codProveedor=codProveedor;
 this.nomProveedor=nomProveedor;
 }

    public String getCodProveedor() {
        return codProveedor;
    }

    public String getNomProveedor() {
        return nomProveedor;
    }
    
    @Override
    public String toString(){ 
        return getNomProveedor();
    }
 
}
