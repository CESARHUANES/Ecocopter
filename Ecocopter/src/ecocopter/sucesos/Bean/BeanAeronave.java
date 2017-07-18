
package ecocopter.sucesos.Bean;

public class BeanAeronave {
  private String codAeronave="";
 private String nomAeronave="";
 public BeanAeronave(String codAeronave,String nomAeronave){
 this.codAeronave=codAeronave;
 this.nomAeronave=nomAeronave;
 }

    @Override
    public String toString(){ 
        return getNomAeronave();
    }            

    
    public String getCodAeronave() {
        return codAeronave;
    }

   
    public String getNomAeronave() {
        return nomAeronave;
    }

  
  
}
