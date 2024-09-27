package behavioral.stratery.btCC2;


import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
    public static void main(String[] args) {

        QLSV qlsv = new QLSV();
        SinhVien sv1 = new SinhVien("Nguyễn Xuân Đạt",new Date(2002,2,4),10);
        SinhVien sv2 = new SinhVien("Trần Tiến Phúc",new Date(2003,3,2), 10);
        SinhVien sv3 = new SinhVien("Quang Ngu",new Date(2012,5,2), 1000);
        qlsv.themSV(sv1);
        qlsv.themSV(sv2);
        qlsv.themSV(sv3);
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        System.out.println("***** So sánh theo tên *****");
        qlsv.inDanhSach();
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        System.out.println("****** So sánh theo điểm ******");
        qlsv.inDanhSach();
    }
}
