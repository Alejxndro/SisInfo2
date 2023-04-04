
package dba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class MySQL {
    public static String url = "jdbc:mysql://127.0.0.1/sisinformacion";
    public static String usuario = "root";
    public static String contraseña = "";
    public static String clase = "com.mysql.cj.jdbc.Driver";
    
    public static Connection getConnection(){
         Connection conexion = null;
        try {
            Class.forName(clase);
            conexion = DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("Conexion establecida");
        }catch (SQLException | ClassNotFoundException e) {
            System.out.println("Falla en la conexion: " + e.getMessage());
        }
    return  conexion;
    }
    
    public static void main(String[] args) {
        MySQL.getConnection();
    }

    
}

