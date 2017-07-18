/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.bean;

/**
 *
 * @author Cesar
 */
public class ReportesParticulares {
  public double indice=0.00;
  public int cantHoras=0;
  private int cantAta=0;
  private String ata="";
  private String mes="";
  
  public ReportesParticulares(){
      
  }
  public ReportesParticulares(int cantAta,String ata,String mes ){
  this.cantAta=cantAta;
  this.ata=ata;
  this.mes=mes;
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
     * @return the ata
     */
    public String getAta() {
        return ata;
    }

    /**
     * @param ata the ata to set
     */
    public void setAta(String ata) {
        this.ata = ata;
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
     * @return the indice
     */
    public double getIndice() {
        return indice;
    }

    /**
     * @param indice the indice to set
     */
    public void setIndice(double indice) {
        this.indice = indice;
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
