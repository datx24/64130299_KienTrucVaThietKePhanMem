package creational.prototype.BTA8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoaDon implements IPrototype,Serializable{
    private String tenKhachHang,soDienThoai;
    private String ngayBan;
    List<SanPham> danhSachSanPham;
    public void themSanPham(SanPham sanPham) {
        danhSachSanPham.add(sanPham);
    }

    public HoaDon(String tenKhachHang, String soDienThoai, String ngayBan) {
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.ngayBan = ngayBan;
        this.danhSachSanPham = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "tenKhachHang='" + tenKhachHang + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", ngayBan=" + ngayBan +
                ", danhSachSanPham=" + danhSachSanPham +
                '}';
    }

    @Override
    public Serializable copy() {
        return PrototypeHelper.copy(this);
    }

    @Override
    public HoaDon clone() {
        HoaDon clone = new HoaDon(this.tenKhachHang, this.soDienThoai, this.ngayBan);
        clone.danhSachSanPham = this.danhSachSanPham; // Tham chiếu đến danh sách sản phẩm của hóa đơn gốc
        return clone;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public void setDanhSachSanPham(List<SanPham> danhSachSanPham) {
        this.danhSachSanPham = danhSachSanPham;
    }
}
