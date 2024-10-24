package behavioral.observer.atm;

public class ATM {
    TaiKhoanATM theATM;
    void nhanThe(TaiKhoanATM atm){
        this.theATM = atm;
    }
    void traThe(){
        this.theATM = null;
    }
    public void rutTien(int soTien) {
        if(theATM != null){
            if(theATM.kiemTraSoDu(soTien)==true){
                theATM.nhanThongBao(soTien,true);
            }
            else {
                theATM.nhanThongBao(soTien,false);
            }
        }
        System.out.println("Xin đưa thẻ vào ATM");
    }
}
