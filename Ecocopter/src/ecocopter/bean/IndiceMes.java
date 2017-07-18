/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.bean;

/**
 *
 * @author Cesar
 */
public class IndiceMes {
  private int totalHoras=0;
  private double indice=0;
  private String nomNave="";
  public int totalFallas=0;
  public IndiceMes(){
      
  }
  public IndiceMes(int totalHoras,int indice,String nomNave){
   this.totalHoras=totalHoras;
   this.indice=indice;
   this.nomNave=nomNave;
  }

    /**
     * @return the totalHoras
     */
    public int getTotalHoras() {
        return totalHoras;
    }

    /**
     * @param totalHoras the totalHoras to set
     */
    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
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
     * @return the totalFallas
     */
    public int getTotalFallas() {
        return totalFallas;
    }

    /**
     * @param totalFallas the totalFallas to set
     */
    public void setTotalFallas(int totalFallas) {
        this.totalFallas = totalFallas;
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
}
