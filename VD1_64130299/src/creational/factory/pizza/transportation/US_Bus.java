package creational.factory.pizza.transportation;

public class US_Bus extends Transportation{
    public US_Bus(int capacity) {
        super(capacity);
    }

    @Override
    protected void drive() {
        System.out.println("Driving a US bus  with capacity: " + capacity);
    }
}
