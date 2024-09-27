package behavioral.stratery.btCC2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    List<SinhVien> svs = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;

    public void sapXep() {
       svs.sort((o1, o2) -> soSanh.soSanh(o1,o2));//Comparator so sánh 2 điểm
    }

    public void inDanhSach() {
        for(SinhVien sv: svs){
            System.out.println(sv.toString());
        }
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public void themSV(SinhVien sv) {
        svs.add(sv);
    }
}
