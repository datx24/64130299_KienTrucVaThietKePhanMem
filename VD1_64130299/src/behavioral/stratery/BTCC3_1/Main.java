package behavioral.stratery.BTCC3_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GioHang gioHang = new GioHang();
        gioHang.themMonAn("Cơm chiên",2,10000);
        gioHang.themMonAn("Mì xào",2,15000);
        gioHang.themMonAn("Bún bò",1,30000);
        gioHang.themMonAn("Phở bò",1,50000);

        //chọn phương thức khuyến mãi, giảm 10% tối đa 50000
        gioHang.setHinhThucKhuyenMai(new GiamToiDaYTongTien(50000));

        //chọn phương thức giao hàng
        gioHang.setPhuongThucGiaoHang(new GiaoHangTietKiem());

        //thanh toán hóa đơn
        gioHang.thanhToan();
    }
}
