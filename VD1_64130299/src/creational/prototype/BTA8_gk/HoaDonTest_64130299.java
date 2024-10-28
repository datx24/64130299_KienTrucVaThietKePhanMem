package creational.prototype.BTA8_gk;

import java.io.Serializable;

public class HoaDonTest_64130299 {
    public static void main(String[] args) {
        //Tạo sản phẩm
        SanPham_64130299 sp1 = new SanPham_64130299("Chuối",5,10000);
        SanPham_64130299 sp2 = new SanPham_64130299("Táo",10,5000);
        //Tạo 1 hóa đơn
        HoaDon_64130299 hd1 = new HoaDon_64130299("Nguyễn Xuân Đạt","0706191487","28/10/2024");
        hd1.themSanPham(sp1);
        hd1.themSanPham(sp2);

        //In hóa đơn gốc
        System.out.println("Hóa đơn gốc:");
        System.out.println(hd1);
        //In hóa đơn clone
        Object hoaDonClone =  hd1.clone();
        System.out.println("Hóa đơn clone:");
        System.out.println(hoaDonClone);
        //In hóa đơn gốc
        Serializable hoaDonCopy =  hd1.copy();
        System.out.println("Hóa đơn copy:");
        System.out.println(hoaDonCopy);

        //Thay đổi sản phẩm
        sp1.setTenSanPham("Xoài");

        //In hóa đơn gốc sau khi bị đổi tên sản phẩm
        System.out.println("Hóa đơn gốc sau khi bị đổi:");
        System.out.println(hd1);
        //In hóa đơn clone
        System.out.println("Hóa đơn clone sau khi hóa đơn gốc thay đổi:");
        System.out.println(hoaDonClone);
        //In hóa đơn copy sau khi bị đổi tên sản phẩm
        System.out.println("Hóa đơn copy sau khi hóa đơn gốc thay đổi::");
        System.out.println(hoaDonCopy);
    }
}
