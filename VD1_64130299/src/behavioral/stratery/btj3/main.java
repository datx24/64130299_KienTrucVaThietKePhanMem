package behavioral.stratery.btj3;

public class main {
    public static void main(String[] args) {
        SinhVienNTU svNTU1 = new SinhVienIT("Nguyễn Xuân Đạt","Công nghệ thông tin",8,8,8);
        SinhVienNTU svNTU2 = new SinhVienBiz("Trần Kim Quang","Kế toán",7,1);
        svNTU1.inThongTin();
        System.out.println("Điểm trung bình: " + svNTU1.getDiemTB());
        System.out.println("Học lực: " + svNTU1.getHocLuc());
        System.out.println("==================");
        svNTU2.inThongTin();
        System.out.println("Điểm trung bình: " + svNTU2.getDiemTB());
        System.out.println("Học lực: " + svNTU2.getHocLuc());
    }
}
