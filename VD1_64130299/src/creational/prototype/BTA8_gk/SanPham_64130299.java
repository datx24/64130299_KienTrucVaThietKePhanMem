package creational.prototype.BTA8_gk;

import java.io.Serializable;

public class SanPham_64130299 implements IPrototype_64130299,Serializable {
    private String tenSanPham;
    private int soLuong;
    private double donGia;

    public SanPham_64130299(String tenSanPham, int soLuong, double donGia) {
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
        return "SanPham_64130299{" +
                "tenSanPham='" + tenSanPham + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }

    @Override
    public Object clone() {
        return new SanPham_64130299(this.tenSanPham, this.soLuong, this.donGia);
    }

    @Override
    public Serializable copy() {
        return PrototypeHelper_64130299.copy(this);
    }
}
