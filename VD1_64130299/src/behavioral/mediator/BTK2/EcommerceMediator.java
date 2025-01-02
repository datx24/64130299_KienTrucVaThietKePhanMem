package behavioral.mediator.BTK2;

public class EcommerceMediator implements OrderMediator{
    private Customer customer;
    private Shop shop;
    private DeliveryService deliveryService;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void setDeliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }


    @Override
    public void sendMessage(String message, Participant sender) {
        if(sender == customer) {
            System.out.println("Mediator: Customer placed an order.");
            shop.receive(message);
        }
        else if(sender == shop){
            System.out.println("Mediator: Shop confirmed the order.");
            deliveryService.receive(message);
            customer.receive("Your order has been confirmed");
        }
        else if(sender == deliveryService) {
            System.out.println("Mediator: Delivery service updated status");
            shop.receive("Delivery update: " + message);
            customer.receive("Delivery update: "+ message);
        }
    }
}
