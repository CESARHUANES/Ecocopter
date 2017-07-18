/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ecocopter.bean;

import java.util.Date;

/**
 *
 * @author desarrollo2
 */
public class Horas {
 public int idHoras=0;   
 public int codNave=0;
 public String nomNave="";
 public String mes="";
 public String ano="";
 public int horas=0;
 public Date fecha;
 public Horas(){
     
 }
 public Horas(int idHoras,int codNave,String mes,String ano,int horas,Date fecha){
 this.idHoras=idHoras;
 this.codNave=codNave;
 this.mes=mes;
 this.ano=ano;
 this.horas=horas;
 this.fecha=fecha;
 }
  public Horas(int idHoras,String  nomNave,String mes,String ano,int horas,Date fecha){
 this.idHoras=idHoras;
 this.nomNave=nomNave;
 this.mes=mes;
 this.ano=ano;
 this.horas=horas;
 this.fecha=fecha;
 }
  public Horas(int codNave,String mes,String ano,int horas){
  this.codNave=codNave;
 this.mes=mes;
 this.ano=ano;
 this.horas=horas;
 }

    /**
     * @return the codNave
     */
    public int getCodNave() {
        return codNave;
    }

    /**
     * @param codNave the codNave to set
     */
    public void setCodNave(int codNave) {
        this.codNave = codNave;
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
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the idHoras
     */
    public int getIdHoras() {
        return idHoras;
    }

    /**
     * @param idHoras the idHoras to set
     */
    public void setIdHoras(int idHoras) {
        this.idHoras = idHoras;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
