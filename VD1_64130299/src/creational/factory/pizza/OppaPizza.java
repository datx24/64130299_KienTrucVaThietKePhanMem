package creational.factory.pizza;

public class OppaPizza extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type){
            case HAI_SAN -> {
                return new PizzaHS();
            }
            case MAM -> {
                return new PizzaM();
            }
        }
        return null;
    }
}
