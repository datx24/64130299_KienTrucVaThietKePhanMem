package behavioral.mediator.BTK2;

public class EcommerceTest {
    public static void main(String[] args) {
        EcommerceMediator mediator = new EcommerceMediator();
        Customer customer = new Customer(mediator);
        Shop shop = new Shop(mediator);
        DeliveryService deliveryService = new DeliveryService(mediator);

        mediator.setCustomer(customer);
        mediator.setShop(shop);
        mediator.setDeliveryService(deliveryService);

        customer.placeOrder("Laptop","FastExpress");
        System.out.println("---------------------");
        shop.processOrder();
        System.out.println("---------------------");
        deliveryService.deliverOrder();
        System.out.println("---------------------");
        deliveryService.confirmDelivery();
    }
}
