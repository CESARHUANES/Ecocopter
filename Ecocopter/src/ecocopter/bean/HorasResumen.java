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
public class HorasResumen {
    public String nomNave="";
    public String mes="";
    public String ano="";
    public int cantHoras=0;
    public HorasResumen(){
        
    }
    public HorasResumen(String nomNave,String mes,String ano,int cantHoras){
    this.nomNave=nomNave;    
    this.mes=mes;
    this.ano=ano;
    this.cantHoras=cantHoras;   
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
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the cantHoras
     */
    public int getCantHoras() {
        return cantHoras;
    }

    /**
     * @param cantHoras the cantHoras to set
     */
    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }
    
}
