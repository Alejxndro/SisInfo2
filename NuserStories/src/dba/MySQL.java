
package dba;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class MySQL {
    public static String url = "jdbc:mysql://localhost/sisInfo";
    public static String usuario = "root";
    public static String contraseña = "";
    public static String clase = "com.mysql.jdbc.Driver";
    
    public static Connection getConnection(){
         Connection conexion = null;
        try {
            Class.forName(clase);
            conexion = DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("Conexion establecida");
        }catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }catch(Exception e1){
            System.out.println("Error: " + e1.getMessage());
        }
    return  conexion;
    }
}
