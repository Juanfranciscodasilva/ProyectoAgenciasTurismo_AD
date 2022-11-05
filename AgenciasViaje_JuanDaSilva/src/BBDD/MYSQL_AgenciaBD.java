package BBDD;

import java.sql.*;

public class MYSQL_AgenciaBD {
    
    public String url = "jdbc:mysql://localhost:3306/ad_agenciasturismo";
    public String username = "root";
    public String password = "12345Abcde";
    
    public MYSQL_AgenciaBD() throws Exception{
        Connection conexion = DriverManager.getConnection(url,username,password);
        String sql = "SELECT * FROM AGENCIA";
        Statement state = conexion.createStatement();
        ResultSet result = state.executeQuery(sql);
        while(result.next()){
            System.out.println(result.getString("nombre"));
            System.out.println(result.getString("fecha_apertura"));
            System.out.println(result.getString("id"));
        }
        result.close();
        state.close();
        conexion.close();
    }
}
