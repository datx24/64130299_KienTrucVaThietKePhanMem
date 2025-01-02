package behavioral.observer.atm;

public class TaiKhoan implements Observer{
    private String name;
    private float soDu;

    public TaiKhoan(String name, float soDu) {
        this.name = name;
        this.soDu = soDu;
    }

    @Override
    public void kiemTraSoDu(float soTienRut) {
        if (soTienRut <= soDu && soTienRut > 0) {
            soDu -= soTienRut;
            nhanThongBao("Giao dịch thành công ! Số tiền rút: " + soTienRut + "VNĐ. " + " Số dư còn lại: " + soDu);
        }
        else {
            nhanThongBao("Giao dịch không thành công ! Số tiền rút không được vượt qua số dư !");
        }
    }

    @Override
    public void nhanThongBao(String thongBao) {
        System.out.println("Chủ tài khoản: " + name + ": " + thongBao);
    }
}
