package creational.factory.pizza.transportation;

public class VN_TransportationFactory extends TransportationFactory {
    @Override
    protected Transportation createTransportation(VehicleType type,int capacity) {
        switch (type) {
            case CAR:
                return new VN_Car(capacity);
            case BUS:
                return new VN_Bus(capacity);
        }
        return null;
    }
}
