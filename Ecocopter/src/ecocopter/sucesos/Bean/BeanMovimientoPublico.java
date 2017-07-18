
package ecocopter.sucesos.Bean;

public class BeanMovimientoPublico {
private String codMovPublico="";
 private String nomMovPublico="";
 public BeanMovimientoPublico(String codMovPublico,String nomMovPublico){
 this.codMovPublico=codMovPublico;
 this.nomMovPublico=nomMovPublico;
 }

    public String getCodMovPublico() {
        return codMovPublico;
    }

    public String getNomMovPublico() {
        return nomMovPublico;
    }
    
    @Override
    public String toString(){ 
        return getNomMovPublico();
    }         
}
