package creational.factory.pizza.transportation;

public class VN_Car extends Transportation{
    public VN_Car(int capacity) {
        super(capacity);
    }

    @Override
    protected void drive() {
        System.out.println("Driving a VN car with capacity: " + capacity);
    }
}
