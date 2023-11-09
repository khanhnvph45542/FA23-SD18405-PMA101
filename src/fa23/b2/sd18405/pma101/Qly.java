/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fa23.b2.sd18405.pma101;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Qly {

    ArrayList<sanpham1> listsp = new ArrayList<>();

    public Qly() {
        listsp.add(new sanpham1("DT01", "IPhone", 3, 20000, "Màu Đỏ", "Đã Thanh Toán"));
        listsp.add(new sanpham1("DT02", "SamSung", 2, 3000, "Màu Xanh", "Chưa Thanh Toán"));
        listsp.add(new sanpham1("DT03", "ViVo", 5, 950, "Màu Xám", "Đã Thanh Toán"));
    }

    public ArrayList<sanpham1> getlist() {
        return listsp;
    }

    public Boolean add(sanpham1 sp) {
        listsp.add(sp);
        return true;
    }

    public Boolean delete(int row) {
        listsp.remove(row);
        return true;
    }

    public ArrayList<sanpham1> tim(String ma) {
        ArrayList<sanpham1> ketqua = new ArrayList<>();
        for (sanpham1 object : listsp) {
            if (object.getMa().equals(ma)) {
                ketqua.add(object);
            }
        }
        return ketqua;
    }

    Boolean update(int row, sanpham1 sp) {
        listsp.set(row, sp);
        return true;

    }

    public ArrayList<sanpham1> xoa(String ma) {
        for (int i = 0; i < listsp.size(); i++) {
            if (listsp.get(i).getMa().equals(ma)) {
                listsp.remove(listsp.get(i));
            }
        }
        return listsp;
    }
}
