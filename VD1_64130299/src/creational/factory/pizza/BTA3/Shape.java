package creational.factory.pizza.BTA3;

public abstract class Shape {
    protected StringBuilder shape = new StringBuilder();
    private String brush, paper,frame;

    public abstract String draw();
    @Override
    public String toString() {
        return shape.toString();
    }
}
