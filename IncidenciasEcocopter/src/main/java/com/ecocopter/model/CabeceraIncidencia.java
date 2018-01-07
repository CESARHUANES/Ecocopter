package com.ecocopter.model;

import java.io.Serializable;
import java.util.Date;


public class CabeceraIncidencia implements Serializable{
private int idArchivo;
private int idAeronave;
private String nomArchivo;
private int cantRegistros;
private int estado;
private double pesoArchivo;
private Date fecCarga;
    /**
     * @return the idArchivo
     */
    public int getIdArchivo() {
        return idArchivo;
    }

    /**
     * @param idArchivo the idArchivo to set
     */
    public void setIdArchivo(int idArchivo) {
        this.idArchivo = idArchivo;
    }

    /**
     * @return the idAeronave
     */
    public int getIdAeronave() {
        return idAeronave;
    }

    /**
     * @param idAeronave the idAeronave to set
     */
    public void setIdAeronave(int idAeronave) {
        this.idAeronave = idAeronave;
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
     * @return the cantRegistros
     */
    public int getCantRegistros() {
        return cantRegistros;
    }

    /**
     * @param cantRegistros the cantRegistros to set
     */
    public void setCantRegistros(int cantRegistros) {
        this.cantRegistros = cantRegistros;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the pesoArchivo
     */
    public double getPesoArchivo() {
        return pesoArchivo;
    }

    /**
     * @param pesoArchivo the pesoArchivo to set
     */
    public void setPesoArchivo(double pesoArchivo) {
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



}
