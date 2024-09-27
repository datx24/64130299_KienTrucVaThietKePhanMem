package behavioral.stratery.btj3;

public abstract class SinhVienNTU {
    private String hoTen;
    private String nganh;

    public SinhVienNTU(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public abstract float getDiemTB();
    public String getHocLuc() {
        if(getDiemTB() >= 8){
            return "Giỏi";
        } else if (getDiemTB() >= 6.5) {
            return "Khá";
        } else if (getDiemTB() >= 5) {
            return "Trung bình";
        }
        return "Yếu";
    }
    public void inThongTin(){
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngành học " +nganh);
    }
}
