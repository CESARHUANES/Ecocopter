
package ecocopter.sucesos.Bean;


public class BeanClaseSuceso {
 private String codClaseSucesos="";
 private String nomClaseSuceso="";
 public BeanClaseSuceso(String codClaseSucesos,String nomClaseSuceso){
 this.codClaseSucesos=codClaseSucesos;
 this.nomClaseSuceso=nomClaseSuceso;
 }

    @Override
    public String toString(){ 
        return getNomClaseSuceso();
    }            

  
    public String getNomClaseSuceso() {
        return nomClaseSuceso;
    }

   
    public String getCodClaseSucesos() {
        return codClaseSucesos;
    }

   
}
