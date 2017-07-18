/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.beanDataSource.reportajesParti;

/**
 *
 * @author Cesar
 */
public class DSRepPartiCuarto {
private String nomNave="";
private int cantFallas=0;
public DSRepPartiCuarto(){
    
}
public DSRepPartiCuarto(String nomNave,int cantFallas){
 this.nomNave=nomNave;
 this.cantFallas=cantFallas;
 
}

    /**
     * @return the nomNave
     */
    public String getNomNave() {
        return nomNave;
    }

    /**
     * @param nomNave the nomNave to set
     */
    public void setNomNave(String nomNave) {
        this.nomNave = nomNave;
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
