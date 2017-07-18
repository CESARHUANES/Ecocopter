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
public class Detalle {

    
  private String idArchivo="";
  private String refArchivo="";
  private String fecha;
  private String discrepancia="";
  private String accion="";
  private String codAta="";
    
    public Detalle(){
        
    }
    public Detalle( String idArchivo,
  String refArchivo,
  String fecha,
  String discrepancia,
  String accion,
  String codAta){
   this.idArchivo=idArchivo;
   this.refArchivo=refArchivo;
   this.fecha=fecha;
   this.discrepancia=discrepancia;
   this.accion=accion;
   this.codAta=codAta;
   
    }
    
    public Detalle( 
  String refArchivo,
  String fecha,
  String discrepancia,
  String accion,
  String codAta){
  
   this.refArchivo=refArchivo;
   this.fecha=fecha;
   this.discrepancia=discrepancia;
   this.accion=accion;
   this.codAta=codAta;
   
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
     * @return the refArchivo
     */
    public String getRefArchivo() {
        return refArchivo;
    }

    /**
     * @param refArchivo the refArchivo to set
     */
    public void setRefArchivo(String refArchivo) {
        this.refArchivo = refArchivo;
    }

   

   

    /**
     * @return the discrepancia
     */
    public String getDiscrepancia() {
        return discrepancia;
    }

    /**
     * @param discrepancia the discrepancia to set
     */
    public void setDiscrepancia(String discrepancia) {
        this.discrepancia = discrepancia;
    }

    /**
     * @return the accion
     */
    public String getAccion() {
        return accion;
    }

    /**
     * @param accion the accion to set
     */
    public void setAccion(String accion) {
        this.accion = accion;
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
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String  fecha) {
        this.fecha = fecha;
    }
    
    
}
