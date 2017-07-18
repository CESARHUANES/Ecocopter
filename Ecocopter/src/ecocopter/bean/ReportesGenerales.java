/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.bean;

/**
 *
 * @author Cesar
 */
public class ReportesGenerales {
   private int cantAta=0;
   private String codAta="";
   private String fecha="";
   private String nomNave="";
   public ReportesGenerales(){
       
   }
   public ReportesGenerales(int cantAta,String codAta){
   this.cantAta=cantAta;
   this.codAta=codAta;
   }

    /**
     * @return the cantAta
     */
    public int getCantAta() {
        return cantAta;
    }

    /**
     * @param cantAta the cantAta to set
     */
    public void setCantAta(int cantAta) {
        this.cantAta = cantAta;
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
