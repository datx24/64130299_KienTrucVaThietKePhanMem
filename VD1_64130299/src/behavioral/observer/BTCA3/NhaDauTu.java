package behavioral.observer.BTCA3;

public class NhaDauTu implements Listener{
    private String name;

    public NhaDauTu(String name) {
        this.name = name;
    }

    @Override
    public void update(float exchangeRate) {
        System.out.println("Nhà đầu tư " + name + " nhận được tỉ giá " + exchangeRate);
        decideAction(exchangeRate);
    }

    private void decideAction(float exchangeRate) {
        if (exchangeRate > 23.5) {
            System.out.println(name + " quyết định bán USD.");
        }
        else if(exchangeRate < 23) {
            System.out.println(name + " quyết định mua USD.");
        }
        else {
            System.out.println(name + " quyết định giữ USD.");
        }
    }
}
