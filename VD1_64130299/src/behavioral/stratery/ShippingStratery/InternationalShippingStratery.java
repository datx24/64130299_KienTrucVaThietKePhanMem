package behavioral.stratery.ShippingStratery;

public class InternationalShippingStratery implements IShippingStratery{
    @Override
    public double calculateShippingCost(double weight, String destination) {
        return 20 + weight * 3;
    }
}
