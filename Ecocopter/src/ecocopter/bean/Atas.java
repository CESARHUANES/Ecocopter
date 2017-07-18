/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ecocopter.bean;

/**
 *
 * @author desarrollo2
 */
public class Atas {
    public String codAta="";
    public String nomAta="";
    public Atas(){
        
    }
    public Atas(String codAta,String nomAta){
    this.codAta=codAta;
    this.nomAta=nomAta;
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
     * @return the nomAta
     */
    public String getNomAta() {
        return nomAta;
    }

    /**
     * @param nomAta the nomAta to set
     */
    public void setNomAta(String nomAta) {
        this.nomAta = nomAta;
    }
    
    
}
