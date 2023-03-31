/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemasinfo2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Dell
 */
public class SistemasInfo2 {
public static Connection getConnection(){
         Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }catch(Exception e1){
            System.out.println("Error: " + e1.getMessage());
        }
    return  cn;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
