package creational.factory.pizza;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore vnPizzaFactory = new VN_PizzaFactory();
        Pizza pizza = vnPizzaFactory.orderPizza(PizzaType.HAI_SAN);
        System.out.println(pizza);

        pizza = vnPizzaFactory.orderPizza(PizzaType.MAM);
        System.out.println(pizza);

        PizzaStore krPizzaFactory = new OppaPizza();
        pizza = krPizzaFactory.orderPizza(PizzaType.HAI_SAN);
        System.out.println(pizza);

        pizza = krPizzaFactory.orderPizza(PizzaType.MAM);
        System.out.println(pizza);
    }
}
