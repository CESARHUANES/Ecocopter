
package ecocopter.sucesos.Bean;

public class BeanReportador {
 private String codReportador="";
 private String nomReportador="";
 public BeanReportador(String codReportador,String nomReportador){
 this.codReportador=codReportador;
 this.nomReportador=nomReportador;
 }

    public String getCodReportador() {
        return codReportador;
    }

    public String getNomReportador() {
        return nomReportador;
    }
    
    @Override
    public String toString(){ 
        return getNomReportador();
    }   
}
