package behavioral.stratery.ShippingStratery;

public class ShippingContext {
    private IShippingStratery stratery;

    public ShippingContext(IShippingStratery stratery) {
        this.stratery = stratery;
    }

    public double calculateCost(double weight, String destination) {
        return stratery.calculateShippingCost(weight,destination);
    }
}
