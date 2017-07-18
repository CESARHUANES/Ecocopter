
package ecocopter.sucesos.Bean;

public class BeanFaseVuelo {
 private String codFaseVuelo="";
 private String nomFaseVuelo="";
 public BeanFaseVuelo(String codFaseVuelo,String nomFaseVuelo){
 this.codFaseVuelo=codFaseVuelo;
 this.nomFaseVuelo=nomFaseVuelo;
 }

    public String getCodFaseVuelo() {
        return codFaseVuelo;
    }

    public String getNomFaseVuelo() {
        return nomFaseVuelo;
    }
    
    @Override
    public String toString(){ 
        return getNomFaseVuelo();
    }         
}
