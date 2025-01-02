package behavioral.observer.BTCA3;

public class NhaDauTu implements Observer{
    private String name;

    public NhaDauTu(String name) {
        this.name = name;
    }

    @Override
    public void update(float exchangeRate) {
        if (exchangeRate < 20.5) {
            System.out.println("Nhà đầu tư " + name + " quyết định bán !");
        }
        else if (exchangeRate > 30.5) {
            System.out.println("Nhà đầu tư " + name + " quyết định mua !");
        }
        else {
            System.out.println("Nhà đầu tư " + name + " quyết định giữ !");
        }
    }
}
