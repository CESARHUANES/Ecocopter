/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.bean;

/**
 *
 * @author Cesar
 */
public class Historial {

    private String idArchivo="";
    private String idNave="";
    private String  refArchivo=""; 
    private String fecha="";
    private String fecProces="";
    private String  codAta="";
    public Historial(){
        
    }
    public Historial(String idArchivo,String idNave,String refArchivo,String fecha,String fecProces,String  codAta){
      this.idArchivo=idArchivo;
      this.idNave=idNave;
      this.refArchivo=refArchivo;
      this.fecha=fecha;
      this.fecProces=fecProces;
      this.codAta=codAta;
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
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    

    /**
     * @return the fecProces
     */
    public String getFecProces() {
        return fecProces;
    }

    /**
     * @param fecProces the fecProces to set
     */
    public void setFecProces(String fecProces) {
        this.fecProces = fecProces;
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
    
    
}
