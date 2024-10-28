package creational.prototype.BTA8_gk;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HoaDon_64130299 implements IPrototype_64130299,Serializable {
    private String tenKhachHang, soDienThoai, ngayBan;
    private List<SanPham_64130299> danhSachSanPham;

    public HoaDon_64130299(String tenKhachHang, String soDienThoai, String ngayBan) {
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.ngayBan = ngayBan;
        this.danhSachSanPham = new ArrayList<>();
    }

    public void themSanPham(SanPham_64130299 sanPham) {
        danhSachSanPham.add(sanPham);
    }

    @Override
    public Object clone() {
        HoaDon_64130299 hoaDonClone = new HoaDon_64130299(this.tenKhachHang, this.soDienThoai, this.ngayBan);
        // Shallow copy: chỉ sao chép tham chiếu đến danh sách sản phẩm
        hoaDonClone.danhSachSanPham = this.danhSachSanPham;
        return hoaDonClone;
    }

    @Override
    public Serializable copy() {
        return PrototypeHelper_64130299.copy(this);
    }

    @Override
    public String toString() {
        return "HoaDon_64130299{" +
                "tenKhachHang='" + tenKhachHang + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", ngayBan='" + ngayBan + '\'' +
                ", danhSachSanPham=" + danhSachSanPham +
                '}';
    }
}
