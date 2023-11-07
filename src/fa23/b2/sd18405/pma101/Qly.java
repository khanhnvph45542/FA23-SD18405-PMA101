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
        listsp.add(new sanpham1("1","Ip",3,555,"Da Thanh Toan"));
        listsp.add(new sanpham1("2","Keo",3,3000,"Chua Thanh Toan"));
        listsp.add(new sanpham1("1","Banh",3,950,"Da Thanh Toan"));
    }
     public ArrayList<sanpham1> getlist(){
       return listsp;
       }
     public Boolean add(sanpham1 sp){
     listsp.add(sp);
     return true;
     }
      public Boolean delete(int row){
      listsp.remove(row);
      return true;    
      }
      public ArrayList<sanpham1> tim(int gia){
         ArrayList<sanpham1> ketqua = new ArrayList<>();
          for (sanpham1 object : listsp) {
              if (object.getGia()<gia) {
                  ketqua.add(object);
              }
          }
          return ketqua;
      }
      Boolean update(int row, sanpham1 sp){
      listsp.set(row, sp);
      return true;
          
      }
}
