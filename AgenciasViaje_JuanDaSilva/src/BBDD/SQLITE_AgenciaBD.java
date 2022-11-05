package BBDD;

import java.sql.*;

public class SQLITE_AgenciaBD {
    
    final static String url = "jdbc:sqlite:C:/sqlite/ad_agenciasTurismo.db";
    
    public SQLITE_AgenciaBD(){
        Connection conn = null;
        try {
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            String sql = "INSERT INTO agencia VALUES(null,?,?,?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "Viajes Araba");
            java.util.Date utilDate = new java.util.Date();
            Date date = new Date(utilDate.getTime());
            pstmt.setDate(2, date);
            pstmt.setString(3, "C/ ejemplo araba 7");
            pstmt.executeUpdate();
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
