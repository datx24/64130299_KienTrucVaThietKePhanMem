package behavioral.chain_of_responsibility.BTCB3;

public class BacDienThuong extends BacDien{
    public BacDienThuong(double gia, double min, double max) {
        super(gia, min, max);
    }

    @Override
    public BacDien bacKeTiep(BacDien bac) {
        this.bacKeTiep = bac;
        return bac;
    }

    @Override
    public void tinhTien(int sokWh, double[] tongTien) {

    }
}
