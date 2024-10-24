package behavioral.observer.atm;

public class TaiKhoan implements TaiKhoanATM{
    int soDu;
    String tenTK;
    ATM atm;

    public TaiKhoan(int soDu, String tenTK, ATM atm) {
        this.soDu = soDu;
        this.tenTK = tenTK;
        this.atm = atm;
    }

    public void duaTheVaoATM() {
        atm.nhanThe(this);
    }
    public void rutThe(){
        atm.traThe();
    }


    @Override
    public boolean kiemTraSoDu(int soTien) {
        return soDu - soTien >= 50;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if(thanhCong){
            System.out.println("Bạn đang rút tiền...");
            System.out.println("Số dư ban đầu");
            System.out.println("Số tiền rút: " + soTienRut);
            soDu = soDu - soTienRut;
            System.out.println("Số dư cuối: " + soDu);
        }
        else{
            System.out.println("Bạn đang rút tiền: ");
            System.out.println("Số dư ban đầu");
            System.out.println("Số tiền rút: " + soTienRut);
            System.out.println("Không đủ tiền để rút");
        }
    }
}
