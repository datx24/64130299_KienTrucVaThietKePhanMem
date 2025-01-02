package behavioral.chain_of_responsibility.BaiToanChoVay;

public class NhanVien extends NhanVienAlibaba{
    public NhanVien(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    @Override
    public void duyetKhoanVay(int soTienVay) {
        if(soTienVay <= getHanMucDuyetVay()) {
            System.out.println(getChucVu() + " " + getTen() + " duyệt khoản vay " + soTienVay + " !");
        } else {
            capTren.duyetKhoanVay(soTienVay);
        }
    }

}
