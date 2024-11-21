package behavioral.chain_of_responsibility;

public class ChuTich extends NhanVienF88{

    public ChuTich(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    @Override
    public void duyetKhoanVay(int soTienVay) {
        if(soTienVay <= getHanMucDuyetVay()) {
            System.out.println("Chủ tịch " + getTen() + " chức vụ" + getChucVu() + " duyệt mức vay số tiền vay " + soTienVay + " !");
        }
        else {
            System.out.println("Ra Eximbank vay.");
        }
    }

    @Override
    public NhanVienF88 capTren(NhanVienF88 nv) {
        return null;
    }
}
