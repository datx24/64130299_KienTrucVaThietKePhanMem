package behavioral.chain_of_responsibility.btvidu;

public class NhanVien extends NhanVienF88{
    NhanVienF88 capTren;
    public NhanVien(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    @Override
    public void duyetKhoanVay(int soTienVay) {
        if(soTienVay <= getHanMucDuyetVay()) {
            System.out.println("Nhân viên " + getTen() + " chức vụ " + getChucVu() + " duyệt khoản vay " + soTienVay + " đồng.");
        }
        else {
            capTren.duyetKhoanVay(soTienVay);
        }

    }


    @Override
    public NhanVienF88 capTren(NhanVienF88 nv) {
        capTren = nv;
        return capTren;
    }
}
