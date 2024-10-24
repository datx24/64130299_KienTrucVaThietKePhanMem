package creational.factory.pizza.transportation;

public class TransportationTest {
    public static void main(String[] args) {
        TransportationFactory vnTransportationFactory = new VN_TransportationFactory();
        Transportation transportation = vnTransportationFactory.bookTransportation(VehicleType.CAR,4);
        System.out.println(transportation);
    }
}
