package structual.composite.BTB4;

import java.util.ArrayList;
import java.util.List;

public class KyHoc extends MonHoc{
    protected String tenKy;
    protected List<MonHoc> danhSachMon;

    public KyHoc(String tenKy) {
        this.tenKy = tenKy;
        this.danhSachMon = new ArrayList<>();
    }


    public void themMon(MonHoc mon) {
        danhSachMon.add(mon);
    }

    public void xoaMon(MonHoc mon) {
        danhSachMon.add(mon);
    }


    @Override
    public String getTenMonHoc() {
        return tenKy;
    }

    @Override
    public int getTinChi() {
        int tongTinChi = 0;
        for(MonHoc mon : danhSachMon){
            tongTinChi += mon.getTinChi();
        }
        return tongTinChi;
    }

    @Override
    public double getHocPhi() {
        double tongHocPhi = 0;
        for(MonHoc mon: danhSachMon){
            tongHocPhi += mon.getHocPhi();
        }
        return tongHocPhi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Kì học: " + getTenMonHoc() + "\n");
        for(MonHoc mon: danhSachMon) {
            sb.append("  ").append(mon).append("\n");
        }
        return sb.toString();
    }

}
