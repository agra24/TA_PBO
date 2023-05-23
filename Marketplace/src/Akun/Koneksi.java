/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Akun;
import java.sql.*;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import java.sql.Statement;
/**
 *
 * @author User
 */
public class Koneksi {
static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/jokiboy";
    static final String USER = "root";
    static final String PASS = ""; 
    public java.sql.Connection konek;
    public Statement statement;
    
    public Koneksi(){
        try{
            Class.forName(JDBC_DRIVER);
            konek = (java.sql.Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            statement = konek.createStatement();
            System.out.println("Koneksi Berhasil");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public java.sql.Connection getConnection(){
        return konek;
    }   
}
