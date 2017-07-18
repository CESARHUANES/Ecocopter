
package ecocopter.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import oracle.jdbc.OracleTypes;


public class DBUtility {
   public static void executeSQLStoredProcedureArrayList(ArrayList pArrayList, 
                                                          String pStoredProcedure, 
                                                          ArrayList pParameters) throws SQLException {
        if (pStoredProcedure == null || pStoredProcedure.trim().length() == 0)
            throw new SQLException("Expresion del Stored Procedure no Definido", 
                                   "FarmaError", 9002);
        int numeroParametro = 2;
        CallableStatement stmt;
        stmt = 
        ((Connection)Conexion.GetConnection()).prepareCall("{ call ? := " + 
                                                          pStoredProcedure + 
                                                          " }");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);
        for (int i = 0; i < pParameters.size(); i++) {
            if (pParameters.get(i) instanceof String)
                stmt.setString(numeroParametro, (String)pParameters.get(i));
            if (pParameters.get(i) instanceof Integer)
                stmt.setInt(numeroParametro, 
                            Integer.parseInt(((Integer)pParameters.get(i)).toString()));
            if (pParameters.get(i) instanceof Double)
                stmt.setDouble(numeroParametro, 
                               Double.parseDouble(((Double)pParameters.get(i)).toString()));
            numeroParametro += 1;
        }
        stmt.execute();
        ResultSet results = (ResultSet)stmt.getObject(1);
        ArrayList myArray = null;
        String myRow = "";
        StringTokenizer st = null;
        while (results.next()) {
            myRow = results.getString(1);
            myArray = new ArrayList();
            
            if (myRow != null) {
                st = new StringTokenizer(myRow, "Ã");
                while (st.hasMoreTokens())
                    myArray.add(st.nextToken());
                pArrayList.add(myArray);
            }
        }
        results.close();
        stmt.close();
    } 
   
    public static String executeSQLStoredProcedureStr(String pStoredProcedure, 
                                                      ArrayList pParameters) throws SQLException {
      
        if (pStoredProcedure == null || pStoredProcedure.trim().length() == 0)
            throw new SQLException("Expresion del Stored Procedure no Definido", 
                                   "FarmaError", 9002);
        String valorRetorno = null;
        int numeroParametro = 2;
        CallableStatement stmt = 
            ((Connection)Conexion.GetConnection()).prepareCall("{ call ? := " + 
                                                                      pStoredProcedure + 
                                                                      " }");
       
        stmt.registerOutParameter(1, OracleTypes.VARCHAR);
      
        for (int i = 0; i < pParameters.size(); i++) {
            if (pParameters.get(i) instanceof String)
                stmt.setString(numeroParametro, (String)pParameters.get(i));
            if (pParameters.get(i) instanceof Integer)
                stmt.setInt(numeroParametro, 
                            Integer.parseInt(((Integer)pParameters.get(i)).toString()));
            if (pParameters.get(i) instanceof Double)
                stmt.setDouble(numeroParametro, 
                               Double.parseDouble(((Double)pParameters.get(i)).toString()));
           
            numeroParametro += 1;
        }
        stmt.execute();
        valorRetorno = (String)stmt.getObject(1);
        stmt.close();
        return valorRetorno;
    }
}
