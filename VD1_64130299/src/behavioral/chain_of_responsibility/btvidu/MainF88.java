package behavioral.chain_of_responsibility.btvidu;

public class MainF88 {
    public static void main(String[] args) {
        NhanVienF88 nhanVien = new NhanVien("Nguyễn Văn A","Nhân viên",120_000);
        NhanVienF88 chuTich = new ChuTich("Trần Tiến Phúc","Chủ tịch",500_000);
        nhanVien.capTren(chuTich);
        nhanVien.duyetKhoanVay(100_000);
        nhanVien.duyetKhoanVay(200_000);
        chuTich.duyetKhoanVay(400_000);
        chuTich.duyetKhoanVay(600_000);
    }
}
