package behavioral.chain_of_responsibility.BTCB1;


public abstract class ATM_TheoMenhGia {
    protected int menhGia;
    protected ATM_TheoMenhGia keTiep;

    public abstract ATM_TheoMenhGia menhGiaKeTiep(ATM_TheoMenhGia m);

    public abstract void rutTien(int soTien);
}
