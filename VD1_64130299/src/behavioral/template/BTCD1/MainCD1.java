package behavioral.template.BTCD1;

import java.util.Arrays;

public class MainCD1 {
    public static void main(String[] args) {
        var dsHangHoa1 = Arrays.asList(
                new MatHang("Dụng cụ lau nhà",1,359000),
                new MatHang("Nước rửa chén",5,100000),
                new MatHang("Chổi quét nhà",2,67000)
        );

        var dsHangHoa2 = Arrays.asList(
                new MatHang("Dụng cụ lau nhà",10,359000),
                new MatHang("Nước rửa chén",5,100000),
                new MatHang("Chổi quét nhà",7,67000)
        );
        HoaDon hdThanThiet = new KhachHangThanThiet(dsHangHoa1);
        HoaDon hdVang = new KhachHangVang(dsHangHoa2);
        HoaDon hdKimCuong = new KhachHangKimCuong(dsHangHoa2);

        System.out.println("Hóa đơn khách hàng thân thiết: ");
        hdThanThiet.templateMethod();
        System.out.println("Hóa đơn khách hàng vàng: ");
        hdVang.templateMethod();
        System.out.println("Hóa đơn khách hàng kim cương: ");
        hdKimCuong.templateMethod();
    }
}
