/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fa23.b2.sd18405.pma101;

/**
 *
 * @author Admin
 */
public class sanpham1 {

    private String ma, ten;
    private int sl;
    private float gia;
    private String mauSac;
    private String trangThai;

    public sanpham1(String ma, String ten, int sl, float gia, String mauSac, String trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.gia = gia;
        this.mauSac = mauSac;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Float thanhtien() {
        return this.sl * this.gia;
    }

}
