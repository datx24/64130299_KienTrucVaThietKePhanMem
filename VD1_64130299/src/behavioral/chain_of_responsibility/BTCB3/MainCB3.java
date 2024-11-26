package behavioral.chain_of_responsibility.BTCB3;

public class MainCB3 {
    public static void main(String[] args) {
        BacDien bac1 = new BacDienThuong(1806,0,50);
        BacDien bac2 = new BacDienThuong(1866,51,100);
        BacDien bac3 = new BacDienThuong(2167,101,200);
        BacDien bac4 = new BacDienThuong(2729,201,300);
        BacDien bac5 = new BacDienThuong(3050,301,400);
        BacDien bacCaoNhat = new BacDienCaoNhat(3151);

        bac1.bacKeTiep(bac2).
                bacKeTiep(bac3).
                    bacKeTiep(bac4).
                        bacKeTiep(bac5).
                            bacKeTiep(bacCaoNhat);

        //Tính tình điện
        int sokWh = 450;
        double[] tongTien = {0}; // lưu tổng tiền dưới dạng mảng
        System.out.println("Số kWh sử dụng: " + sokWh);
        bac1.tinhTien(sokWh,tongTien);
    }
}
