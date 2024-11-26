package behavioral.chain_of_responsibility.BTCB3;

public class BacDienCaoNhat extends BacDien{
    public BacDienCaoNhat(double gia) {
        super(gia, 401, Double.MAX_VALUE);
    }

    @Override
    public BacDien bacKeTiep(BacDien bac) {
        return null;
    }

    @Override
    public void tinhTien(int sokWh, double[] tongTien) {

    }
}
