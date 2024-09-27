package behavioral.stratery.ShippingStratery;

public class ExpressShippingStratery implements IShippingStratery{

    @Override
    public double calculateShippingCost(double weight, String destination) {
        return 10 + weight * 1.5;
    }
}
