/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.beanDataSource.reportajesParti;

/**
 *
 * @author Cesar
 */
public class DSRepPartiTercero {
 private String mes="";
    private int cantFallas=0;
    public  DSRepPartiTercero() {
    }

    public  DSRepPartiTercero(String mes,int cantFallas) {
    this.mes=mes;
    this.cantFallas=cantFallas;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
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
