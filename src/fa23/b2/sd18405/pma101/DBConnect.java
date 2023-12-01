/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fa23.b2.sd18405.pma101;

import java.sql.*;

/**
 *
 * @author KhanhCT
 */
public class DBConnect {

    static String url = "jdbc:sqlserver://;serverName=localhost;databaseName=Java_3;encrypt=true;trustServerCertificate=true";
    static String name = "sa";
    static String pass = "Khanh2601";

    public static Connection getConnection() {
            try {
            return DriverManager.getConnection(url, name, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        getConnection();
    }
}
