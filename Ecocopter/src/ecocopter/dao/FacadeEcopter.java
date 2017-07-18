/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.dao;



import ecocopter.bean.Cabecera;
import ecocopter.bean.Detalle;
import ecocopter.bean.Historial;
import ecocopter.bean.Nave;
import ecocopter.bean.VariablesEcocopter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;





/**
 *
 * @author Cesar
 */
public class FacadeEcopter {
    
    public void nuevoDetalle(Detalle det){

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String sql="insert into DET_CARGA values(?,?,?,?,?,?)";
         java.sql.Date fecha2 = null;
         java.util.Date fecha = null;
        try{
        PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
        st.setInt(1,Integer.parseInt(det.getIdArchivo()));
        st.setString(2, det.getRefArchivo());
        Date date = formatter.parse(det.getFecha());
        System.out.println(date);
        System.out.println(formatter.format(date));
        Date dat;
        dat = formatter.parse(formatter.format(date));
        System.out.println(dat);
        System.out.println(forma.format(dat));
        fecha=formato.parse(forma.format(dat));
	fecha2 = new java.sql.Date(fecha.getTime());	
        st.setDate(3,fecha2);
        st.setString(4,det.getDiscrepancia());
        st.setString(5, det.getAccion());
        st.setString(6, det.getCodAta());
        st.executeUpdate();
        }catch(SQLException ex){
        ex.printStackTrace();
        }catch(Exception e){
        e.printStackTrace();
        }
       
    }
    public List<Cabecera> Listcabecera(){
        ArrayList<Cabecera> Lista=new ArrayList();
        String sql="SELECT CAB.IDARCHIVO,CAB.IDNAVE,NAVE.NOMNAVE,CAB.NOMBREARCHIVO,CAB.CANTREGISTRO,CAB.ESTADO,CAB.PESOARCHIVO,CAB.FEC_CARGA FROM CAB_CARGA CAB,ECO_NAVE NAVE WHERE CAB.IDNAVE=NAVE.IDNAVE ORDER BY CAB.IDARCHIVO DESC ";
      
        try{
            PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);

            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Cabecera cab=new Cabecera();
                cab.setIdArchivo(rs.getString(1));
                cab.setIdNave(rs.getString(2));
                cab.setNomNave(rs.getString(3));
                cab.setNomArchivo(rs.getString(4));
                cab.setCantReg(rs.getInt(5));
                cab.setEstado(rs.getString(6));
                cab.setPesoArchivo(rs.getString(7));
                cab.setFecCarga(rs.getDate(8));
                Lista.add(cab);

            }
             rs.close();
            Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }



        return Lista;
    }
    
     public List<Detalle> ListDetalle(String codArchivo){
        ArrayList<Detalle> Lista=new ArrayList();
        String sql="SELECT  IDARCHIVO,REFARCHIVO,TO_CHAR(FECHA,'yyyy-MM-dd'),DISCREPANCIA,ACCION,CODATA FROM DET_CARGA WHERE IDARCHIVO=?";
        try{

            PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
            st.setString(1, codArchivo);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Detalle det=new Detalle();
                det.setIdArchivo(rs.getString(1));
                det.setRefArchivo(rs.getString(2));
                det.setFecha(rs.getString(3));
                det.setDiscrepancia(rs.getString(4));
                det.setAccion(rs.getString(5));
                det.setCodAta(rs.getString(6));
                Lista.add(det);

            }
             rs.close();

        }catch(SQLException ex){
            ex.printStackTrace();
        }



        return Lista;
    }
     
     
    public boolean eliminarDetalle(String  idArchivo){//anular un registro pasando la cuenta
    boolean flag=true; 
    String sql="DELETE FROM DET_CARGA WHERE IDARCHIVO=?";
    try{
    PreparedStatement st= Conexion.GetConnection().prepareStatement(sql);
    st.setString(1, idArchivo);
    st.executeUpdate();
    }
    catch(SQLException e){
    e.getStackTrace();
    JOptionPane.showMessageDialog( null,"No se puede eliminar el detalle del archivo.","Error",JOptionPane.ERROR_MESSAGE);   
    flag=false;
    }
    return flag;
    }
    
    public boolean eliminarCabecera(String  idArchivo){
    boolean flag=true;
    String sql="DELETE FROM CAB_CARGA WHERE IDARCHIVO=?";
    try{
    PreparedStatement st= Conexion.GetConnection().prepareStatement(sql);
    st.setString(1, idArchivo);
    st.executeUpdate();
    
    }
    
    catch(SQLException e){
    e.getStackTrace();
    JOptionPane.showMessageDialog( null,"No se puede eliminar el archivo.","Error",JOptionPane.ERROR_MESSAGE);   
    flag=false;
    }
    return flag;
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
    public void grabaArchivo(Cabecera cab){
     
   
    DateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
    java.util.Date fecha = null;
    java.sql.Date fecha2 = null;
    String sql="INSERT INTO CAB_CARGA VALUES(?,?,?,?,?,?,?)";
    try{
    PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
    st.setInt(1, Integer.parseInt(cab.getIdArchivo()));
    st.setInt(2,Integer.parseInt( cab.getIdNave()));
    st.setString(3,cab.getNomArchivo());
    st.setInt(4,cab.getCantReg());
    st.setString(5,cab.getEstado());
    
    st.setString(6, VariablesEcocopter.vPesoArchivo);
    fecha = ft.parse(this.getFecha());
    fecha2 = new java.sql.Date(fecha.getTime());
    st.setDate(7, fecha2);
    st.executeUpdate();
    }catch(SQLException ex){
    ex.printStackTrace();
   
    }catch(Exception e){
    e.printStackTrace();
   
    }
   
    }
    
    public int getIdArchivo(){
       int secuen=0;
        String sql="SELECT  SEC_CODIGO.NEXTVAL FROM DUAL";
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
    
    public static ArrayList<Nave> ListaNave(){

        Connection cn;
        ArrayList lista=new ArrayList();
        try{
        cn= Conexion.GetConnection();
        Statement cmd=cn.createStatement();
        ResultSet rs=cmd.executeQuery("select idNave,nomNave from ECO_NAVE");

        while(rs.next()){
        Nave nave=new Nave();
        nave.setIdNave(rs.getString(1));
        nave.setNomNave(rs.getString(2));
        lista.add(nave);
        }
         rs.close();
         Conexion.GetConnection().close();
        }catch(SQLException ex){
        ex.printStackTrace();

    }
    return lista;

}
    
 public static  Nave  LeerNave(int pos){
   
    return (Nave)ListaNave().get(pos);
}   
    
 public void grabaHistorial(Historial hist){
     DateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
     DateFormat form = new SimpleDateFormat("dd-MM-yyyy");
    java.util.Date fecha = null;
    java.sql.Date fecha2 = null;
    java.util.Date date1 = null;
    java.sql.Date date2 = null;
    String sql="INSERT INTO HIST_PROCESAMIENTO VALUES(?,?,?,?,?,?)";
    try{
    PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
    st.setInt(1,Integer.parseInt(hist.getIdArchivo()));
    st.setInt(2,Integer.parseInt(hist.getIdNave()));
    st.setString(3, hist.getRefArchivo());
    fecha = ft.parse(hist.getFecha());
    fecha2 = new java.sql.Date(fecha.getTime());
    st.setDate(4,fecha2);
    date1 = form.parse(hist.getFecProces());
    date2 = new java.sql.Date(date1.getTime());
    st.setDate(5,date2);
    st.setInt(6,Integer.parseInt(hist.getCodAta()));
     st.executeUpdate();
    }catch(SQLException ex){
    ex.printStackTrace();
   
    }catch(Exception e){
    e.printStackTrace();
   
    }
    
  
    }
 
public void UpDateEstado(Cabecera cab){
    String sql=" update CAB_CARGA set estado=? where idArchivo=?";
    try{
        PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
        st.setString(1,cab.getEstado());
        st.setString(2,cab.getIdArchivo());
        st.executeUpdate();
        }catch(SQLException e){
        e.printStackTrace();
    }
}
}
