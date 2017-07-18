/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.bean;

import java.util.Date;

/**
 *
 * @author Cesar
 */
public class Cabecera {
    private String idArchivo="";
    private String idNave="";
    private String nomNave="";
    private String nomArchivo="";
    private int cantReg=0;
    private String estado="";
    private String pesoArchivo="";
    private Date fecCarga;
  
    public Cabecera(String idArchivo,String  estado){
    this.idArchivo=idArchivo;
    this.estado=estado;
    }
    public Cabecera(){
        
    }
    public Cabecera( String idArchivo,String idNave,
    String nomArchivo,
    int cantReg,
    String  estado,
    String pesoArchivo,
    Date fecCarga){
    this.idArchivo=  idArchivo;
    this.idNave=idNave;
    this.nomArchivo=nomArchivo;
    this.cantReg=cantReg;
    this.estado=estado;
    this.fecCarga=fecCarga;
    }
    
    public Cabecera( String idArchivo,String idNave,String nomNave,
    String nomArchivo,
    int cantReg,
    String  estado,
    String pesoArchivo,
    Date fecCarga){
    this.idArchivo=  idArchivo;
    this.idNave=idNave;
    this.nomNave=nomNave;
    this.nomArchivo=nomArchivo;
    this.cantReg=cantReg;
    this.estado=estado;
    this.fecCarga=fecCarga;
    }

    /**
     * @return the idArchivo
     */
    public String getIdArchivo() {
        return idArchivo;
    }

    /**
     * @param idArchivo the idArchivo to set
     */
    public void setIdArchivo(String idArchivo) {
        this.idArchivo = idArchivo;
    }

    /**
     * @return the nomArchivo
     */
    public String getNomArchivo() {
        return nomArchivo;
    }

    /**
     * @param nomArchivo the nomArchivo to set
     */
    public void setNomArchivo(String nomArchivo) {
        this.nomArchivo = nomArchivo;
    }

    /**
     * @return the cantReg
     */
    public int getCantReg() {
        return cantReg;
    }

    /**
     * @param cantReg the cantReg to set
     */
    public void setCantReg(int cantReg) {
        this.cantReg = cantReg;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the pesoArchivo
     */
    public String getPesoArchivo() {
        return pesoArchivo;
    }

    /**
     * @param pesoArchivo the pesoArchivo to set
     */
    public void setPesoArchivo(String pesoArchivo) {
        this.pesoArchivo = pesoArchivo;
    }

    /**
     * @return the fecCarga
     */
    public Date getFecCarga() {
        return fecCarga;
    }

    /**
     * @param fecCarga the fecCarga to set
     */
    public void setFecCarga(Date fecCarga) {
        this.fecCarga = fecCarga;
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
