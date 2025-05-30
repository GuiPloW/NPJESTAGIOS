package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    
    public static Connection getConnection(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/npjestagios?user=root&password=1234";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "conexaoDAO" + e.getMessage());
        }
        return conn;
    }
    
}
