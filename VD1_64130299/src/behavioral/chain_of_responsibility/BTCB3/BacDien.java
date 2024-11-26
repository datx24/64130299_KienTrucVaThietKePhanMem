package behavioral.chain_of_responsibility.BTCB3;

public abstract class BacDien {
    protected double gia,min,max;
    protected BacDien bacKeTiep;

    public BacDien(double gia, double min, double max) {
        this.gia = gia;
        this.min = min;
        this.max = max;
    }

    public abstract BacDien bacKeTiep(BacDien bac);

    public abstract void tinhTien(int sokWh, double[] tongTien);
}
