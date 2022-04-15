/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapuk;

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Narahubung {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
    try {       
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver Loaded");
    mysqlconfig = DriverManager.getConnection("jdbc:mysql://localhost:3306/jual_pupuk","root","");
    System.out.println("Terhubung...");         
} catch(ClassNotFoundException e) {
    throw new IllegalStateException(null, e); 
}
    return mysqlconfig; 
}    
}
