package com.ecocopter.util;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class MyBatisUtil {
    private String resource="com/ecocopter/data/SqlMapConfig.xml";
    private SqlSession session=null;
  
  public SqlSession getSession(){
      try{
          Reader reader=Resources.getResourceAsReader(resource);
          SqlSessionFactory  sqlMapper=new SqlSessionFactoryBuilder().build(reader);
          session=sqlMapper.openSession();
      }catch(IOException ex){
          ex.printStackTrace();
      }
  return session;
  }
    
}
