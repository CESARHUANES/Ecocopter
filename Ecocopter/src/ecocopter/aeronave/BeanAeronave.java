
package ecocopter.aeronave;


public class BeanAeronave {
 private int codigo=0;
  private String descripcion="";
  private String fecCreacion="";
  private String fecModif="";
  private String estado="";
  
  public BeanAeronave(){
      
  }
  public BeanAeronave(int codigo,String descripcion,String fecCreacion,String fecModif,String estado){
       this.codigo=codigo;
       this.descripcion=descripcion;
       this.fecCreacion=fecCreacion;
       this.fecModif=fecModif;
       this.estado=estado;
  }
 public BeanAeronave(int codigo,String descripcion,String estado){
       this.codigo=codigo;
       this.descripcion=descripcion;
       this.estado=estado;
  } 
 public BeanAeronave(String descripcion,String estado){  
       this.descripcion=descripcion;
       this.estado=estado;
  } 
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fecCreacion
     */
    public String getFecCreacion() {
        return fecCreacion;
    }

    /**
     * @param fecCreacion the fecCreacion to set
     */
    public void setFecCreacion(String fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    /**
     * @return the fecModif
     */
    public String getFecModif() {
        return fecModif;
    }

    /**
     * @param fecModif the fecModif to set
     */
    public void setFecModif(String fecModif) {
        this.fecModif = fecModif;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
