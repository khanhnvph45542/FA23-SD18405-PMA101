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
    private String ma,ten;
    private int sl,gia;
    private String trangTahi;

    public sanpham1(String ma, String ten, int sl, int gia, String trangTahi) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.gia = gia;
        this.trangTahi = trangTahi;
    }

    public sanpham1() {
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getTrangTahi() {
        return trangTahi;
    }

    public void setTrangTahi(String trangTahi) {
        this.trangTahi = trangTahi;
    }

  public Integer thanhtien(){
  return this.sl*this.gia;
  }
}
