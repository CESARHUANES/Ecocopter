
package ecocopter.dao;

import ecocopter.bean.Atas;
import ecocopter.bean.IndiceMes;
import ecocopter.bean.ReportesParticulares;
import ecocopter.bean.ReportesGenerales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class FacadeReportes {
   public List<ReportesParticulares> ListReporte(String mes,String ano){
        ArrayList<ReportesParticulares> Lista=new ArrayList();
        String sql="select  count(codAta) ,codata  from HIST_PROCESAMIENTO where TO_CHAR(fecha,'MM')="+mes+"and TO_CHAR(fecha,'YYYY')="+ano+"group by codAta ";
        try{
            PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                ReportesParticulares rep=new ReportesParticulares();
                rep.setCantAta(rs.getInt(1));
                rep.setAta(rs.getString(2));
                Lista.add(rep);
            }
             rs.close();
            Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return Lista;
    } 
   
     public List<ReportesParticulares> ListReporte2(String ata,String ano){
        ArrayList<ReportesParticulares> Lista=new ArrayList();
       String sql=" SELECT   COUNT(codAta) ,TO_CHAR(fecha,'Month') from HIST_PROCESAMIENTO where codAta="+ata+" and TO_CHAR(fecha,'YYYY')="+ano+" group by TO_CHAR(fecha,'Month')";

        try{
            PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                ReportesParticulares rep=new ReportesParticulares();
                rep.setCantAta(rs.getInt(1));
                rep.setMes(rs.getString(2));
                Lista.add(rep);
            }
              rs.close();
              Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }



        return Lista;
    } 
     
      public List<ReportesParticulares> ListReporte3(String nave,String ano){
        ArrayList<ReportesParticulares> Lista=new ArrayList();
       String sql=" SELECT   COUNT(codAta) ,TO_CHAR(fecha,'Month') from HIST_PROCESAMIENTO H,ECO_NAVE N where H.IDNAVE=N.IDNAVE\n" +
            "AND  TRIM(N.NOMNAVE)="+nave+" and TO_CHAR(fecha,'YYYY')="+ano+" group by TO_CHAR(fecha,'Month')";
          try{
            PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);

            ResultSet rs=st.executeQuery();
            while(rs.next()){
                ReportesParticulares rep=new ReportesParticulares();
                rep.setCantAta(rs.getInt(1));
                rep.setMes(rs.getString(2));
                Lista.add(rep);
            }
             rs.close();
             Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return Lista;
    } 
    public List<ReportesParticulares> ListReporte4(String codNave ,String ata,String ano){
        ArrayList<ReportesParticulares> Lista=new ArrayList();
       String sql=" SELECT   COUNT(codAta) ,TO_CHAR(FECHA,'Month') from HIST_PROCESAMIENTO where codAta="+ata+" and TO_CHAR(fecha,'YYYY')="+ano+" and idnave="+codNave+" group by TO_CHAR(FECHA,'Month')";

        try{
            PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                ReportesParticulares rep=new ReportesParticulares();
                rep.setCantAta(rs.getInt(1));
                rep.setMes(rs.getString(2));
                Lista.add(rep);
            }
              rs.close();
              Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return Lista;
    }
    public List<ReportesGenerales> ListReporte5(String nomMes ,String ata,String ano){
        ArrayList<ReportesGenerales> Lista=new ArrayList();
       String sql=" SELECT COUNT(HIST.CODATA),EC.NOMNAVE FROM HIST_PROCESAMIENTO HIST  ,ECO_NAVE EC\n" +
       " WHERE HIST.Idnave=EC.IDNAVE AND TO_CHAR(HIST.FECHA,'YYYY')="+ano+"AND LOWER(TRIM(TO_CHAR(HIST.FECHA,'Month')))='"+nomMes+"'AND HIST.CODATA="+ata+"GROUP BY EC.NOMNAVE";

        try{
            PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                ReportesGenerales rep=new ReportesGenerales();
                rep.setCantAta(rs.getInt(1));
                rep.setNomNave(rs.getString(2));
                Lista.add(rep);
            }
              rs.close();
              Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }



        return Lista;
    }
    public List<ReportesParticulares> ListIndiceReporte3(String nave,String ano){
      ArrayList<ReportesParticulares> Lista=new ArrayList();
   
      String sql="SELECT   COUNT(COD_ATA),FECHA  FROM (SELECT   codAta AS COD_ATA,LOWER(TO_CHAR(fecha,'Month')) AS FECHA \n" +
"from HIST_PROCESAMIENTO H,ECO_NAVE N  where  H.IDNAVE=N.IDNAVE\n" +
"AND  TRIM(N.NOMNAVE)='"+nave+"' and TO_CHAR(H.fecha,'YYYY')='"+ano+"') group by FECHA ORDER BY TO_DATE(FECHA,'MM') ASC";
      
      
      try{
      PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
      ResultSet rs=st.executeQuery();
      while(rs.next()){
          ReportesParticulares rep=new ReportesParticulares();
          //rep.setIndice(rs.getDouble(1));
          rep.setCantAta(rs.getInt(1));
         // rep.setCantHoras(rs.getInt(3));
          rep.setMes(rs.getString(2));
          Lista.add(rep);
          }
         rs.close();
         Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return Lista;
    } 
    public List<IndiceMes> ListIndiceNave(String mes,String ano){
    ArrayList<IndiceMes> Lista=new ArrayList();
     String sql="SELECT (COUNT( HIST.CODATA)/SUM(HO.NUM_HORAS)) AS INDICE,NA.NOMNAVE AS NOMBRE,SUM(HO.NUM_HORAS),COUNT(HIST.CODATA) FROM HIST_PROCESAMIENTO HIST, ECO_NAVE NA,HIST_HORAS HO\n" +
     "WHERE HIST.IDNAVE=NA.IDNAVE AND  HIST.IDNAVE=HO.IDNAVE AND TRIM(LOWER(TO_CHAR(HIST.FECHA,'Month')))='"+mes+"' AND HO.NOM_MES='"+mes+"'AND TRIM(HO.NOM_ANO)='"+ano+"' AND TO_CHAR(HIST.FECHA,'YYYY')='"+ano+"' GROUP BY NA.NOMNAVE,TO_CHAR(HIST.FECHA,'MM')" ;   
       try{
      PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
      ResultSet rs=st.executeQuery();
      while(rs.next()){
          IndiceMes rep=new IndiceMes();
          rep.setIndice(rs.getDouble(1));
          rep.setNomNave(rs.getString(2));
          rep.setTotalHoras(rs.getInt(3));
          rep.setTotalFallas(rs.getInt(4));
          Lista.add(rep);
          }
         rs.close();
         Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return Lista;     
    } 
    
     
     public static ArrayList<Atas> ListAtas(){
        Connection cn;
        ArrayList lista=new ArrayList();
        try{
        cn= Conexion.GetConnection();
        Statement cmd=cn.createStatement();
        ResultSet rs=cmd.executeQuery("SELECT CODATA,NOMATA FROM ATAS");

        while(rs.next()){
        Atas ata=new Atas();
        ata.setCodAta(rs.getString(1));
        ata.setNomAta(rs.getString(2));
        lista.add(ata);
        }
        
        }catch(SQLException ex){
        ex.printStackTrace();

    }
    return lista;
     }
      public static  Atas  LeerAta(int pos){
   
      return (Atas)ListAtas().get(pos);
    }
      /************REPORTES GENERALES************/
  public List<ReportesGenerales> ListReporteNaveMesT(String mes,String ano){
        ArrayList<ReportesGenerales> Lista=new ArrayList();
       
        String sql="SELECT COUNT(HIST.CODATA), NA.NOMNAVE FROM HIST_PROCESAMIENTO HIST,ECO_NAVE NA WHERE HIST.IDNAVE=NA.IDNAVE and TO_CHAR(HIST.FECHA,'MM')="+mes+" AND TO_CHAR(HIST.FECHA,'YYYY')="+ano+"\n" +
                  "GROUP BY NA.NOMNAVE ";
        try{
            PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                ReportesGenerales repTot=new ReportesGenerales();
                repTot.setCantAta(rs.getInt(1));
                repTot.setNomNave(rs.getString(2));
                Lista.add(repTot);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return Lista;
    }      
    public   List<ReportesGenerales> ListReporteAtaNaveMes(String codNave ,String mes,String ano){
    ArrayList<ReportesGenerales> Lista=new ArrayList();

          String sql="SELECT COUNT(HIST.CODATA),HIST.CODATA FROM HIST_PROCESAMIENTO HIST,ECO_NAVE NA WHERE "
                  + "HIST.IDNAVE=NA.IDNAVE  AND TO_CHAR(HIST.FECHA,'YYYY')="+ano+" and na.idnave="+codNave+" and TO_CHAR(HIST.FECHA,'MM')="+mes+"\n" +
         " GROUP BY HIST.CODATA ORDER BY HIST.CODATA ASC";
            try{
                PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
                ResultSet rs=st.executeQuery();
                while(rs.next()){
                    ReportesGenerales repTot=new ReportesGenerales();
                    repTot.setCantAta(rs.getInt(1));
                    repTot.setCodAta(rs.getString(2));
                    Lista.add(repTot);
                }
                rs.close();
                Conexion.GetConnection().close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
            return Lista;    
    }
     public List<ReportesGenerales> ListReporteAtaT(String ano){
           ArrayList<ReportesGenerales> Lista=new ArrayList();

           String sql=" SELECT COUNT(HIST.CODATA),HIST.CODATA FROM HIST_PROCESAMIENTO HIST WHERE  TO_CHAR(HIST.FECHA,'YYYY')="+ano+"  GROUP BY HIST.CODATA ORDER BY HIST.CODATA ASC";
              
           try{
               PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
               ResultSet rs=st.executeQuery();
               while(rs.next()){
                   ReportesGenerales repTot=new ReportesGenerales();
                   repTot.setCantAta(rs.getInt(1));
                   repTot.setCodAta(rs.getString(2));
                   Lista.add(repTot);
               }
               rs.close();
               Conexion.GetConnection().close();
           }catch(SQLException ex){
               ex.printStackTrace();
           }
           return Lista;
       } 
    public List<ReportesGenerales> ListReporteAtaNaveT(String codNave ,String ano){
           ArrayList<ReportesGenerales> Lista=new ArrayList();

           String sql="SELECT COUNT(HIST.CODATA),HIST.CODATA FROM HIST_PROCESAMIENTO HIST,ECO_NAVE NA WHERE HIST.IDNAVE=NA.IDNAVE  AND TO_CHAR(HIST.FECHA,'YYYY')="+ano+" and na.idnave="+codNave+"\n" +
   "                GROUP BY HIST.CODATA ORDER BY HIST.CODATA ASC";
           try{
               PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
               ResultSet rs=st.executeQuery();
               while(rs.next()){
                   ReportesGenerales repTot=new ReportesGenerales();
                   repTot.setCantAta(rs.getInt(1));
                   repTot.setCodAta(rs.getString(2));
                   Lista.add(repTot);
               }
               rs.close();
               Conexion.GetConnection().close();
           }catch(SQLException ex){
               ex.printStackTrace();
           }
           return Lista;
       } 
    public List<ReportesGenerales> ListReporteMesAtasT(String ata,String ano){
        ArrayList<ReportesGenerales> Lista=new ArrayList();
        String sql="SELECT COUNT(HIST.CODATA),TO_CHAR(HIST.FECHA,'Month') FROM HIST_PROCESAMIENTO HIST WHERE HIST.CODATA="+ata+" AND TO_CHAR(HIST.FECHA,'YYYY')="+ano+" GROUP BY TO_CHAR(HIST.FECHA,'Month')";
        try{
            PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                ReportesGenerales repTot=new ReportesGenerales();
                repTot.setCantAta(rs.getInt(1));
                repTot.setFecha(rs.getString(2));
                Lista.add(repTot);
            }
             rs.close();
             Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return Lista;
    }  
    public List<ReportesGenerales> ListReporteNaveAno(String ano){
        ArrayList<ReportesGenerales> Lista=new ArrayList();
        String sql="SELECT  COUNT(HIST.CODATA),EC.NOMNAVE FROM HIST_PROCESAMIENTO HIST ,ECO_NAVE EC WHERE HIST.IDNAVE=EC.IDNAVE AND  TO_CHAR(HIST.FECHA,'YYYY')="+ano+" GROUP BY EC.NOMNAVE ORDER  BY EC.NOMNAVE ASC";
                try{
            PreparedStatement st=Conexion.GetConnection().prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                ReportesGenerales repTot=new ReportesGenerales();
                repTot.setCantAta(rs.getInt(1));
                repTot.setNomNave(rs.getString(2));
                Lista.add(repTot);
            }
             rs.close();
             Conexion.GetConnection().close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return Lista;
    }
    
   
}
