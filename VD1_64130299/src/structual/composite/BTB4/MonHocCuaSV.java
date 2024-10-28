package structual.composite.BTB4;

public class MonHocCuaSV extends MonHoc{
    protected String tenMon;
    protected int tinChi;
    protected double hocPhi;

    public MonHocCuaSV(String tenMon, int tinChi, double hocPhi) {
        this.tenMon = tenMon;
        this.tinChi = tinChi;
        this.hocPhi = hocPhi;
    }

    @Override
    public String getTenMonHoc() {
        return tenMon;
    }

    @Override
    public int getTinChi() {
        return tinChi;
    }

    @Override
    public double getHocPhi() {
        return hocPhi;
    }

    @Override
    public String toString() {
        return "Môn học: " + tenMon + ", Tín chỉ: " + tinChi + ", Học phí: " + hocPhi;
    }
}
