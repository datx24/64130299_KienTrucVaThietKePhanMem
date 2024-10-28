package structual.composite.BTB4;

import java.util.ArrayList;
import java.util.List;

public class NamHoc extends MonHoc{
    protected String tenNam;
    protected List<KyHoc> danhSachKy;

    public NamHoc(String tenNam) {
        this.tenNam = tenNam;
        this.danhSachKy = new ArrayList<>();
    }

    public void themKy(KyHoc ky) {
        danhSachKy.add(ky);
    }

    public void xoaKy(KyHoc ky) {
        danhSachKy.add(ky);
    }

    @Override
    public String getTenMonHoc() {
        return tenNam;
    }

    @Override
    public int getTinChi() {
        int tongTinChi = 0;
        for(KyHoc ky: danhSachKy) {
            tongTinChi += ky.getTinChi();
        }
        return tongTinChi;
    }

    @Override
    public double getHocPhi() {
        double tongHocPhi = 0;
        for(KyHoc ky: danhSachKy) {
            tongHocPhi += ky.getHocPhi();
        }
        return tongHocPhi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Năm học: " + getTenMonHoc() + "\n");
        for(KyHoc ki: danhSachKy) {
            sb.append(" ").append(ki).append('\n');
        }
        return sb.toString();
    }
}
