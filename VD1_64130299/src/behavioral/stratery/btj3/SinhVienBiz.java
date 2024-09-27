package behavioral.stratery.btj3;

public class SinhVienBiz extends SinhVienNTU{
    private float diemMarketing, diemSale;

    public SinhVienBiz(String hoTen, String nganh, float diemMarketing, float diemSale) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }


    public float getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(float diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public float getDiemSale() {
        return diemSale;
    }

    public void setDiemSale(float diemSale) {
        this.diemSale = diemSale;
    }

    @Override
    public float getDiemTB() {
        return (diemMarketing * 2 + diemSale) / 3;
    }
}
