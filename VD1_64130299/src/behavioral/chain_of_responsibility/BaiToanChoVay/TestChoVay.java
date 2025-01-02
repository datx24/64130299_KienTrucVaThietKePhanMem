package behavioral.chain_of_responsibility.BaiToanChoVay;


public class TestChoVay {
    public static void main(String[] args) {
        NhanVienAlibaba nhanVienAlibaba = new NhanVien("Nguyễn Xuân Đạt", "Nhân viên", 100_000);
        NhanVienAlibaba truongPhongAlibaba = new NhanVien("Trần Kim Quang", "Trưởng phòng",200_000);
        NhanVienAlibaba chuTichAlibaba = new ChuTich("Trần Tiến Phúc", "Chủ tịch", 300_000);

        nhanVienAlibaba.setCapTren(truongPhongAlibaba);
        truongPhongAlibaba.setCapTren(chuTichAlibaba);

        nhanVienAlibaba.duyetKhoanVay(50_000);
        nhanVienAlibaba.duyetKhoanVay(150_000);
        nhanVienAlibaba.duyetKhoanVay(250_000);
        nhanVienAlibaba.duyetKhoanVay(350_000);
    }
}
