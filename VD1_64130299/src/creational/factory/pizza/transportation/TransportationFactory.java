package creational.factory.pizza.transportation;

public abstract class TransportationFactory {
    protected abstract Transportation createTransportation(VehicleType type,int capacity);
    public Transportation bookTransportation(VehicleType type,int capacity){
        Transportation transportation = createTransportation(type,capacity);
        transportation.drive();
        return transportation;
    }
}
