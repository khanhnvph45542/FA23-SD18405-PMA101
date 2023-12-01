/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fa23.b2.sd18405.pma101;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author KhanhCT
 */
public class QuanLyDangNhap {

    ArrayList<sanpham1> list = new ArrayList<>();

    public ArrayList<sanpham1> getAll() {
        list.clear();
        try {
            String sql = "select name ,pass from DangNhap";
            Connection con = DBConnect.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString(1);
                String pass = rs.getString(2);
                list.add(new sanpham1(name, pass));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean insert(String name, String pass) {
        try {
            String sql = "insert into DangNhap(name,pass) values(?,?);";
            Connection con = DBConnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, pass);
            ps.executeUpdate();
            con.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
