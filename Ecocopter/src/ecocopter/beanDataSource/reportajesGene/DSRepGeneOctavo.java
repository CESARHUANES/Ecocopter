
package ecocopter.beanDataSource.reportajesGene;

/**
 *
 * @author Cesar
 */
public class DSRepGeneOctavo {
 private String meses="";
private int cantFallas=0;
public DSRepGeneOctavo(){
    
}
public DSRepGeneOctavo(String meses,
int cantFallas){
 this.meses=meses;
 this.cantFallas=cantFallas;
}

    /**
     * @return the meses
     */
    public String getMeses() {
        return meses;
    }

    /**
     * @param meses the meses to set
     */
    public void setMeses(String meses) {
        this.meses = meses;
    }

    /**
     * @return the cantFallas
     */
    public int getCantFallas() {
        return cantFallas;
    }

    /**
     * @param cantFallas the cantFallas to set
     */
    public void setCantFallas(int cantFallas) {
        this.cantFallas = cantFallas;
    }

   
}
