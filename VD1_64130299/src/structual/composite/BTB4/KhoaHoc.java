package structual.composite.BTB4;

import java.util.ArrayList;
import java.util.List;

public class KhoaHoc extends MonHoc {
    protected String tenKhoa;
    protected List<NamHoc> danhSachNamHoc;

    public KhoaHoc(String tenKhoa) {
        this.tenKhoa = tenKhoa;
        this.danhSachNamHoc = new ArrayList<>();
    }

    public void themNam(NamHoc nam) {
        danhSachNamHoc.add(nam);
    }

    public void xoaNam(NamHoc nam) {
        danhSachNamHoc.remove(nam);
    }

    @Override
    public String getTenMonHoc() {
        return tenKhoa;
    }

    @Override
    public int getTinChi() {
        int tongTinChi = 0;
        for(NamHoc nam: danhSachNamHoc){
            tongTinChi += nam.getTinChi();
        }
        return tongTinChi;
    }

    @Override
    public double getHocPhi() {
        double tongHocPhi = 0;
        for(NamHoc nam: danhSachNamHoc){
            tongHocPhi += nam.getHocPhi();
        }
        return tongHocPhi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Khóa học: ").append(getTenMonHoc()).append("\n");
        for(NamHoc nam: danhSachNamHoc) {
            sb.append(nam).append("\n");
        }
        sb.append("Tổng tín chỉ toàn khóa: ").append(getTinChi()).append("\n");
        sb.append("Tổng học phí toàn khóa: ").append(getHocPhi()).append("\n");
        return sb.toString();
    }
}
