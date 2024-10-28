package creational.prototype.BTA8;

public class HoaDonTest {
    public static void main(String[] args) {
        // Tạo sản phẩm
        SanPham sanPham1 = new SanPham("Sản phẩm 1", 2, 150.0);
        SanPham sanPham2 = new SanPham("Sản phẩm 2", 3, 200.0);

        // Tạo hóa đơn
        HoaDon hoaDon = new HoaDon("Nguyễn Văn A", "0123456789", "12/12/2024");
        hoaDon.themSanPham(sanPham1); // Tham chiếu đến cùng một đối tượng sản phẩm
        hoaDon.themSanPham(sanPham2); // Tham chiếu đến cùng một đối tượng sản phẩm

        // In hóa đơn gốc
        System.out.println("Hóa đơn gốc:");
        System.out.println(hoaDon);

        // Clone hóa đơn (sử dụng clone mà không sao chép sản phẩm)
        HoaDon hoaDonClone = hoaDon.clone();
        System.out.println("Hóa đơn clone (có thể bị ảnh hưởng nếu sản phẩm được chia sẻ):");
        System.out.println(hoaDonClone);
        HoaDon hoaDonCopy = (HoaDon) hoaDon.copy();
        System.out.println("Hóa Đơn copy:");
        System.out.println(hoaDonCopy);

        // Thay đổi thuộc tính sản phẩm trong hóa đơn gốc
        sanPham1.setSoLuong(5);
        sanPham1.setTenSanPham("Sản phẩm 3");// Cập nhật số lượng sản phẩm
        hoaDon.setTenKhachHang("Người mới");
        System.out.println("Hóa đơn gốc sau khi chỉnh sửa số lượng sản phẩm 1:");
        System.out.println(hoaDon); // Hóa đơn gốc sẽ hiển thị số lượng đã chỉnh sửa

        // Kiểm tra hóa đơn clone
        System.out.println("Hóa đơn clone sau khi hóa đơn gốc bị thay đổi:");
        System.out.println(hoaDonClone); // Hóa đơn clone cũng có thể bị ảnh hưởng
        // Kiểm tra hóa đơn copy
        System.out.println("Hóa đơn copy sau khi hóa đơn gốc bị thay đổi:");
        System.out.println(hoaDonCopy); // Hóa đơn clone cũng có thể bị ảnh hưởng
    }
}
