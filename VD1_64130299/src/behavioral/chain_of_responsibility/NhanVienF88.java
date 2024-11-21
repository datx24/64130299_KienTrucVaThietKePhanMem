package behavioral.chain_of_responsibility;

public abstract class NhanVienF88 {
    private String ten, chucVu;
    private int hanMucDuyetVay;

    public NhanVienF88(String ten, String chucVu, int hanMucDuyetVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucDuyetVay = hanMucDuyetVay;
    }

    public String getTen() {
        return ten;
    }

    public String getChucVu() {
        return chucVu;
    }

    public int getHanMucDuyetVay() {
        return hanMucDuyetVay;
    }

    public abstract void duyetKhoanVay(int soTienVay);
    public abstract NhanVienF88 capTren(NhanVienF88 nv);
}
