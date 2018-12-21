/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomixJahe.Koneksi;
import java.sql.*;
/**
 *
 * @author ASUS 10.1
 */
public class Koneksi {
    private static Connection koneksi;
    public static void bukaKoneksi() {
        if(koneksi == null)
        {
            try
            {
                String url = "jdbc:mysql://localhost:3306/db_panti";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            }
            catch (SQLException t)
            {
                System.out.println("Error koneksi!");
            }
        }
    }
    
}
