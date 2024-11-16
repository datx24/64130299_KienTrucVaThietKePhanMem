package behavioral.template.online;

public class SinhVien_64130299 {
    private int maSinhVien;
    private String tenSV,ngaySinh,queQuan;

    public SinhVien_64130299(int maSinhVien, String tenSV, String ngaySinh, String queQuan) {
        this.maSinhVien = maSinhVien;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}
