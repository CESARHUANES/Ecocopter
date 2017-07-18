
package ecocopter.sucesos.Bean;


public class BeanCategoria {
 private String codCategoria="";
 private String nomCategoria="";
 public BeanCategoria(String codCategoria,String nomCategoria){
 this.codCategoria=codCategoria;
 this.nomCategoria=nomCategoria;
 }

    @Override
    public String toString(){ 
        return getNomCategoria();
    }            


    public String getCodCategoria() {
        return codCategoria;
    }

  
    public String getNomCategoria() {
        return nomCategoria;
    }

 
   
}
