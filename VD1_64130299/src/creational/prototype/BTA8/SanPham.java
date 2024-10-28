package creational.prototype.BTA8;


import java.io.Serializable;

public class SanPham implements IPrototype, Serializable {
    private String tenSanPham;
    private int soLuong;
    private double donGia;

    public SanPham(String tenSanPham, int soLuong, double donGia) {
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "tenSanPham='" + tenSanPham + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }

    @Override
    public Serializable copy() {
        return PrototypeHelper.copy(this);
    }

    @Override
    public SanPham clone() {
        return new SanPham(this.tenSanPham, this.soLuong, this.donGia);
    }
}
