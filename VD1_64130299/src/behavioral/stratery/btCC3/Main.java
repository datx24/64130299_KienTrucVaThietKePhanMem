package behavioral.stratery.btCC3;

public class Main {
    public static void main(String[] args) {
        GioHang gioHang = new GioHang();

        //thêm mặt hàng vào giỏ
        gioHang.themMatHang("Màn hình",3,3000000);
        gioHang.themMatHang("Chuột",1,100000);
        gioHang.themMatHang("Tai nghe",2,239000);

        //chọn phương thức khuyến mãi
        gioHang.setKhuyenMaiStratery(new GiamXPhanTramStratery(10));

        //chọn phương thức thanh toán
        gioHang.setThanhToanStratery(new CODStratery());

        //Thanh toán
        gioHang.thanhToan();
    }
}
