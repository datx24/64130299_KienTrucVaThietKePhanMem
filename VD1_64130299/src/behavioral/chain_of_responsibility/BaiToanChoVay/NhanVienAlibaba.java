package behavioral.chain_of_responsibility.BaiToanChoVay;

public abstract class NhanVienAlibaba {
    private String ten,chucVu;
    private int hanMucDuyetVay;
    protected NhanVienAlibaba capTren;

    public NhanVienAlibaba(String ten, String chucVu, int hanMucDuyetVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucDuyetVay = hanMucDuyetVay;
    }

    public void setCapTren(NhanVienAlibaba capTren) {
        this.capTren = capTren;
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
}
