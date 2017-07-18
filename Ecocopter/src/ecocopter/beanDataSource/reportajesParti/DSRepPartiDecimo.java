
package ecocopter.beanDataSource.reportajesParti;


public class DSRepPartiDecimo {
private String nomNave="";
private int cantFallas=0;
private int cantHoras=0;
private double indice=0;
public DSRepPartiDecimo(){
    
}
public DSRepPartiDecimo(String nomNave,int cantFallas,int cantHoras,double indice){
 this.nomNave=nomNave;
 this.cantFallas=cantFallas;
 this.cantHoras=cantHoras;
 this.indice=indice;
 
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
