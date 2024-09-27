package behavioral.stratery.ShippingStratery;

public class StandardShippingStratery  implements IShippingStratery{
    @Override
    public double calculateShippingCost(double weight, String destination) {
        return 5 + weight;
    }
}
