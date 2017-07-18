/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.bean;

/**
 *
 * @author Cesar
 */
public class Nave {
    private String idNave="";
    private String nomNave="";
    public Nave(){
        
    }
    
    public Nave(String idNave,String nomNave){
     this.idNave=idNave;
     this.nomNave=nomNave;
    }

    /**
     * @return the idNave
     */
    public String getIdNave() {
        return idNave;
    }

    /**
     * @param idNave the idNave to set
     */
    public void setIdNave(String idNave) {
        this.idNave = idNave;
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

    
    
}
