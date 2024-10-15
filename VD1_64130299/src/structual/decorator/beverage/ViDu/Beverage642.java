package structual.decorator.beverage.ViDu;

public abstract class Beverage642 {
    String description;

    public Beverage642(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
