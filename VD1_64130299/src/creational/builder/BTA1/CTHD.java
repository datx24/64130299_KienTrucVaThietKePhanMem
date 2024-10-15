package creational.builder.BTA1;

public class CTHD {
    String sanPham;
    int soLuong;
    float donGia,chietKhau;

    public CTHD(String sanPham, int soLuong, float donGia, float chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "sanPham='" + sanPham + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", chietKhau=" + chietKhau +
                '}';
    }
}
