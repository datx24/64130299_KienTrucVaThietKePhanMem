package creational.factory.pizza.transportation;

public class VN_Bus extends Transportation{
    public VN_Bus(int capacity) {
        super(capacity);
    }

    @Override
    protected void drive() {
        System.out.println("Driving a VN bus with capacity: " + capacity);
    }
}
