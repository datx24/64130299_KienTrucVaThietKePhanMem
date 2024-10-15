package structual.decorator.beverage.BTB1;

public class BieuThucTest {
    public static void main(String[] args) {
        BieuThuc b = new BieuThucDonGian(10);
        b = new Cong(b,5); // (10 + 5)
        b = new Tru(b,4);
        System.out.println(b.toString());
    }
}
