
package ecocopter.sucesos.Bean;

public class BeanDepartamento {
private String codDepartamento="";
 private String nomDepartamento="";
 public BeanDepartamento(String codDepartamento,String nomDepartamento){
 this.codDepartamento=codDepartamento;
 this.nomDepartamento=nomDepartamento;
 }

    public String getCodDepartamento() {
        return codDepartamento;
    }

    public String getNomDepartamento() {
        return nomDepartamento;
    }
    
    @Override
    public String toString(){ 
        return getNomDepartamento();
    }       
}
