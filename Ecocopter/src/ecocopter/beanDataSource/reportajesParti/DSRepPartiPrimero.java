/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.beanDataSource.reportajesParti;

/**
 *
 * @author Cesar
 */
public class DSRepPartiPrimero {
 private String codAta="";   
 private int cantFallas=0;

 public  DSRepPartiPrimero(){
     
 }
 public  DSRepPartiPrimero( String codAta,   
 int cantFallas){
 this.codAta=codAta;

 this.cantFallas=cantFallas;

 }

    /**
     * @return the codAta
     */
    public String getCodAta() {
        return codAta;
    }

    /**
     * @param codAta the codAta to set
     */
    public void setCodAta(String codAta) {
        this.codAta = codAta;
    }

    /**
     * @return the cantFallas
     */
    public int getCantFallas() {
        return cantFallas;
    }

    /**
     * @param cantFallas the cantFallas to set
     */
    public void setCantFallas(int cantFallas) {
        this.cantFallas = cantFallas;
    }
 
}
