package com.ecocopter.util;

import com.ecocopter.model.CabeceraIncidencia;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class Test {
   
public static void main(String args[]){
       SqlSession session=new MyBatisUtil().getSession();
       
       List<CabeceraIncidencia> cabIncidencia=session.selectList("CabIncidencia.selectCabecera");
     for(CabeceraIncidencia x:cabIncidencia){
         System.out.println("Codigo"+x.getNomArchivo());
     }
}
}
