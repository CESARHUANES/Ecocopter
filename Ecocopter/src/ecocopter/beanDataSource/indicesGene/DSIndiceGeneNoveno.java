
package ecocopter.beanDataSource.indicesGene;

public class DSIndiceGeneNoveno {
 private String nomNave="";
    private int totalFallas=0;
    private int totalHoras=0;
    private double indice=0;
    public  DSIndiceGeneNoveno(){
        
    }
    public  DSIndiceGeneNoveno(    String nomNave,
    int totalFallas,
    int totalHoras,
    double indice){
        this.nomNave=nomNave;
        this.totalFallas=totalFallas;
        this.totalHoras=totalHoras;
        this.indice=indice;
        
    }

    public String getNomNave() {
        return nomNave;
    }

    public void setNomNave(String nomNave) {
        this.nomNave = nomNave;
    }

    public int getTotalFallas() {
        return totalFallas;
    }

    public void setTotalFallas(int totalFallas) {
        this.totalFallas = totalFallas;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public double getIndice() {
        return indice;
    }

    public void setIndice(double indice) {
        this.indice = indice;
    }    
}
