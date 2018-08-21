package proyecto;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class conexion {
    private final String bd = "restaurante01";
    private final String user = "root";
    private final String password = ""; 
    private final String url = "jdbc:mysql//localhost:3306/" + bd;
    
    private Connection con = null;
    
    public Connection getConexion() throws ClassNotFoundException {
        
        try {
            Class.forName("com.mmysql.jdbc.Driver");
            
            con = DriverManager.getConnection(url, user, password);
            
        }catch ( SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 000 " + ex.getMessage());
        }
        
        return con; 
        
    }
}
