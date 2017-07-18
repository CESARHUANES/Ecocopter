
package ecocopter.sucesos.Bean;

public class BeanEvento {
 private String codEvento="";
 private String nomEvento="";
 public BeanEvento(String codEvento,String nomEvento){
 this.codEvento=codEvento;
 this.nomEvento=nomEvento;
 }

    @Override
    public String toString(){ 
        return getNomEvento();
    }            

    public String getCodEvento() {
        return codEvento;
    }

    public String getNomEvento() {
        return nomEvento;
    }


    
}
