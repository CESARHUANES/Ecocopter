/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.beanDataSource.indicesParti;

/**
 *
 * @author Cesar
 */
public class DSIndicePartiCuarto {
    
    private String nomMes="";
    private int totalFallas=0;
    private int totalHoras=0;
    private double indice=0;
    public DSIndicePartiCuarto(){
        
    }
     public DSIndicePartiCuarto( String nomMes,
    int totalFallas,
    int totalHoras,
    double indice){
     this.nomMes=nomMes;
     this.totalFallas=totalFallas;
     this.totalHoras=totalHoras;
     this.indice=indice;
        
    }

    /**
     * @return the nomMes
     */
    public String getNomMes() {
        return nomMes;
    }

    /**
     * @param nomMes the nomMes to set
     */
    public void setNomMes(String nomMes) {
        this.nomMes = nomMes;
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
