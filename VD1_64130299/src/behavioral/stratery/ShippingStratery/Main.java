package behavioral.stratery.ShippingStratery;

public class Main {
    public static void main(String[] args) {
        //tính phí theo phương thức epresss
        ShippingContext shippingContext = new ShippingContext(new ExpressShippingStratery());
        double cost = shippingContext.calculateCost(5,"New York");
        System.out.println("Phí vận chuyển Epresss: " + cost);

        //tính phí theo phương thức standard
        shippingContext = new ShippingContext(new StandardShippingStratery());
        cost = shippingContext.calculateCost(20,"Hồ Chí Minh");
        System.out.println("Phí vận chuyển Standard: " + cost);

        //tính phí vận chuyển theo phương thức quốc tế
        shippingContext = new ShippingContext(new InternationalShippingStratery());
        cost = shippingContext.calculateCost(13,"Paris");
        System.out.println("Phí vận chuyển International: " + cost);
        System.out.println("hello");
    }
}
