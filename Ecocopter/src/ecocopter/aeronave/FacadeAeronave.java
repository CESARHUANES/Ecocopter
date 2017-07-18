
package ecocopter.aeronave;

import ecocopter.dao.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.slf4j.LoggerFactory;


public class FacadeAeronave {
      private static final org.slf4j.Logger log = LoggerFactory.getLogger(FacadeAeronave.class);
 public List<BeanAeronave> ListAeronave(){
        ArrayList<BeanAeronave> Lista=new ArrayList();
        String sql="SELECT IDNAVE,NOMNAVE,TO_CHAR(FEC_CREACION,'dd/mm/YYYY HH24:MI:SS'),TO_CHAR(FEC_MODIFICACION,'dd/mm/YYYY HH24:MI:SS'),ESTADO FROM ECO_NAVE ORDER BY IDNAVE DESC ";
      
        try{
            PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);

            ResultSet rs=st.executeQuery();
            while(rs.next()){
                BeanAeronave cab=new BeanAeronave();
                cab.setCodigo(rs.getInt(1));
                cab.setDescripcion(rs.getString(2));
                cab.setFecCreacion(rs.getString(3));
                cab.setFecModif(rs.getString(4));
                cab.setEstado(rs.getString(5));
               
                Lista.add(cab);

            }
             rs.close();
            Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }



        return Lista;
    }
  public int getNextCodigo(){
        int secuen=0;
         String sql="SELECT nvl(max(idnave)+1,0) FROM  ECO_NAVE";
         try{
        PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
           secuen=rs.getInt(1);
             }
         rs.close();
         Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        if(secuen==0){
         secuen=1;   
        } 
         return secuen;
    }
  public boolean grabaAeronave(BeanAeronave nave){
    boolean flag=true;
    String sql="INSERT INTO ECO_NAVE(IDNAVE,NOMNAVE,ESTADO) VALUES(?,?,?)";
    try{
    PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
    st.setInt(1,nave.getCodigo());
    st.setString(2,nave.getDescripcion());
    st.setString(3,nave.getEstado());
    st.executeUpdate();
    JOptionPane.showMessageDialog(null,"Registro grabado","Información de Sistema",JOptionPane.INFORMATION_MESSAGE);
    }catch(SQLException ex){
    flag=false;
    JOptionPane.showMessageDialog(null,"No se pudo grabar el registro!\nNombre de Aeronave Duplicado","Error de Sistema",JOptionPane.WARNING_MESSAGE);

    System.out.println(ex.getMessage()+"");
    
    }
    
  return flag;
    }
  
  public boolean  UpDateAeronave(BeanAeronave nave){
    boolean flag=true;
      String sql="UPDATE ECO_NAVE SET NOMNAVE=?,ESTADO=?,FEC_MODIFICACION=SYSDATE WHERE IDNAVE=?";
    try{
        PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
        st.setString(1,nave.getDescripcion());
        st.setString(2,nave.getEstado());
        st.setInt(3,nave.getCodigo());
        st.executeUpdate();
        JOptionPane.showMessageDialog(null,"Registro actualizado.!","Información de Sistema",JOptionPane.INFORMATION_MESSAGE);

        }catch(SQLException e){
         System.out.println(e.getMessage()+"");
        flag=false;
        JOptionPane.showMessageDialog(null,"No se pudo actualizar el registro!","Error de Sistema",JOptionPane.WARNING_MESSAGE);

    }
    return flag;
}
  
  
  public static boolean validarActualizacion(String pcodAeronave){
      boolean flag=false;
     try {
         
         String resultado="";
         resultado=DBAeronave.validarActualizacion(pcodAeronave).trim();
         log.info("resultado"+resultado);
         if(resultado.equalsIgnoreCase("S")){
            flag=true; 
             JOptionPane.showMessageDialog(null,"No se puede actualizar la aeronave seleccionada,\nya que se cargo un archivo con los datos de esta.","Mensaje del  Sistema",JOptionPane.INFORMATION_MESSAGE);

         }
         
       
       } catch (SQLException ex) {
         Logger.getLogger(FacadeAeronave.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     return flag;
  }
}
