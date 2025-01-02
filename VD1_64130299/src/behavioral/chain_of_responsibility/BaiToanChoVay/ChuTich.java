package behavioral.chain_of_responsibility.BaiToanChoVay;

public class ChuTich extends NhanVienAlibaba{
    public ChuTich(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    @Override
    public void duyetKhoanVay(int soTienVay) {
        if (soTienVay <= getHanMucDuyetVay()) {
            System.out.println(getChucVu() + " " + getTen() + " duyệt khoản vay " + soTienVay + " !");
        } else {
            System.out.println("Ra VietComBank vay nha !");
        }
    }
}
