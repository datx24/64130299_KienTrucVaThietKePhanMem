package creational.factory.pizza.BTA3;

public class ShapeFactory {

    public Shape createShape(ShapeType type) {
        switch (type) {
            case HINH_CHU_NHAT:
                return new Rectangle();
            case HINH_TAM_GIAC:
                return new Triangle();
            case HINH_TRON:
                return new Cirle();
            default:
                return null;
        }
    }
}
