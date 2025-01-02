package behavioral.observer.BTCA3;

public class DichVuTiGia {
    public static void main(String[] args) {
        TiGia tiGia = new TiGia();

        NhaDauTu nhaDauTuA = new NhaDauTu("Nguyễn Xuân Đạt");
        NhaDauTu nhaDauTuB = new NhaDauTu("Trần Tiến Phúc");
        NhaDauTu nhaDauTuC = new NhaDauTu("Phạm Phước Tài");

        tiGia.addObserver(nhaDauTuA);
        tiGia.addObserver(nhaDauTuB);
        tiGia.addObserver(nhaDauTuC);

        tiGia.setExchangeRate(10);
        System.out.println("--------------------");
        tiGia.setExchangeRate(40);
        System.out.println("--------------------");
        tiGia.setExchangeRate(21);
        System.out.println("--------------------");
        tiGia.removeObserver(nhaDauTuC);
        System.out.println("Sau khi xóa nhà đầu tư C");
        tiGia.setExchangeRate(50);
    }
}
