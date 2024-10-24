package creational.factory.pizza.transportation;

public class US_Car extends Transportation{

    public US_Car(int capacity) {
        super(capacity);
    }

    @Override
    protected void drive() {
        System.out.println("Driving a US car with capacity: "+ capacity);
    }
}
