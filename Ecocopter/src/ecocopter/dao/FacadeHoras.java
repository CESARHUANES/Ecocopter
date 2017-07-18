/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ecocopter.dao;

import ecocopter.bean.Horas;
import ecocopter.bean.HorasResumen;
import ecocopter.sucesos.Dao.DBSucesos;
import ecocopter.sucesos.Facade.FacadeSucesos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author desarrollo2
 */
public class FacadeHoras {
public void registraHoras(Horas horas){
        DateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date fecha = null;
        java.sql.Date fecha2 = null;
        String sql="INSERT INTO HIST_HORAS VALUES(?,?,?,?,?,?)";
        try{
        PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
        st.setInt(1,this.getIdHoras() );
        st.setInt(2,horas.getCodNave());
        st.setString(3,horas.getMes());
        st.setString(4,horas.getAno());
        st.setInt(5, horas.getHoras());
        fecha = ft.parse(this.getFecha());
        fecha2 = new java.sql.Date(fecha.getTime());
        st.setDate(6, fecha2);
        st.executeUpdate();
        }catch(SQLException ex){
         ex.printStackTrace();
        } catch (ParseException ex) {
        Logger.getLogger(FacadeHoras.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }
   public String getFecha(){
    String  fechaJava="";
    Calendar  fec=new GregorianCalendar(); 
    int ano=fec.get(Calendar.YEAR);
    int mes=fec.get(Calendar.MONTH)+1;
    int dia=fec.get(Calendar.DAY_OF_MONTH);
    fechaJava = dia+"-"+mes+"-"+ano; 
    return fechaJava;
    }
    public int getIdHoras(){
        int secuen=0;
         String sql="SELECT  SEC_COD_HORAS.NEXTVAL FROM DUAL";
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
         return secuen;
    }
    
      public static ArrayList listaHistorialHoras(){
        ArrayList lstHistorial=new ArrayList();
         try {
             lstHistorial=DBHorasVuelo.lstHistorialHoras();
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
         return lstHistorial; 
     }
  
     public static ArrayList listaResumenHoras(){
        ArrayList lstResumenHoras=new ArrayList();
         try {
             lstResumenHoras=DBHorasVuelo.lstResumenHoras();
         } catch (SQLException ex) {
             Logger.getLogger(FacadeSucesos.class.getName()).log(Level.SEVERE, null, ex);
         }
         return lstResumenHoras; 
     }
   
    
     public boolean deleteHistHora(String  idArchivo){//anular un registro pasando la cuenta
        boolean flag=true; 
        String sql="DELETE FROM HIST_HORAS WHERE COD_REGIS=?";
        try{
        PreparedStatement st= Conexion.GetConnection().prepareStatement(sql);
        st.setString(1, idArchivo);
        st.executeUpdate();
        }
         
        catch(SQLException e){
        e.getStackTrace();
        JOptionPane.showMessageDialog( null,"No se puede eliminar el Historial de Horas.","Error",JOptionPane.ERROR_MESSAGE);   
        flag=false;
        }
        return flag;
    }
     public int getCantHoras(String mes,String ano){//obtiene la cantidad de horas por mes y por año
           
     int cantHoras=0;
         String sql="SELECT SUM(H.NUM_HORAS)  FROM  HIST_HORAS H WHERE  TRIM(H.NOM_MES)='"+mes+"' and H.nom_ano='"+ano+"'";
         try{
        PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
           cantHoras=rs.getInt(1);
             }
         rs.close();
         Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
         return cantHoras;
     }
     public int getCantHorasAno(String ano){
     int cantHoras=0;
         String sql="SELECT SUM(H.NUM_HORAS)  FROM  HIST_HORAS H WHERE   H.nom_ano="+ano+"";
         try{
        PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
           cantHoras=rs.getInt(1);
             }
         rs.close();
         Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return cantHoras;    
     }
     
     public int getCantHorasMesNaveAno(String mes,String nave,String ano){
     int cantHoras=0;
     String sql=" SELECT nvl(SUM(HIST.NUM_HORAS),0) FROM HIST_HORAS HIST,ECO_NAVE NA WHERE HIST.IDNAVE=NA.IDNAVE AND TRIM(HIST.NOM_MES)='"+mes+"' AND NA.NOMNAVE='"+nave+"' AND TRIM(HIST.NOM_ANO)='"+ano+"'  ";
     try{
        PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
           cantHoras=rs.getInt(1);
             }
         rs.close();
         Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
     return cantHoras;
     }
     public int getCantHorasNaveAno(String codNave,String ano){
     int cantHoras=0;
         String sql="SELECT SUM(H.NUM_HORAS)  FROM  HIST_HORAS H WHERE  TRIM(H.IDNAVE)='"+codNave+"' and H.nom_ano='"+ano+"'";
         try{
        PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        while(rs.next()){
           cantHoras=rs.getInt(1);
             }
         rs.close();
         Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
         return cantHoras; 
     }
     
     
    
}
