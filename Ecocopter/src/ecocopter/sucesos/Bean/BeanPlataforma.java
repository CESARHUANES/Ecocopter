
package ecocopter.sucesos.Bean;

public class BeanPlataforma {
  private String codPlataforma="";
 private String nomPlataforma="";
 public BeanPlataforma(String codPlataforma,String nomPlataforma){
 this.codPlataforma=codPlataforma;
 this.nomPlataforma=nomPlataforma;
 }

    @Override
    public String toString(){ 
        return getNomPlataforma();
    }            


    public String getCodPlataforma() {
        return codPlataforma;
    }

  
    public String getNomPlataforma() {
        return nomPlataforma;
    }

  
   
}
