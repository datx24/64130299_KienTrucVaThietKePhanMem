package behavioral.stratery.btCC1;

public class main {
    public static void main(String[] args) {
        Context c = new Context(new Cong());
        System.out.println(c.tinh(1,2));
        c.setTinhToan(new Tru());
        System.out.println(c.tinh(1,2));
        c.setTinhToan(new Chia());
        System.out.println(c.tinh(4,2));
    }
}
