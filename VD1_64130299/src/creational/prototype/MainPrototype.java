package creational.prototype;

import java.util.Arrays;

public class MainPrototype {
    public static void main(String[] args) {
        Product p1 = new Product("001","Chuối",2);
        Product p2 = new Product("002","Táo",3);
        Product p3 = new Product("003","Mít",5);

        Order o1 = new Order("1","Dat", Arrays.asList(p1,p2,p3));
        Order orderCopy = o1.copy();
        Order orderClone = o1.clone();

        System.out.println("Order:");
        o1.display();

        Product p4 = new Product("004","Ổi",1);
        orderCopy = new Order("1","Quang", Arrays.asList(p4,p1,p2));

        System.out.println("Order:");
        o1.display();
        System.out.println("Order copy:");
        orderCopy.display();

        orderClone = new Order("004","Quang",Arrays.asList(p4,p1,p2));
        System.out.println("Order:");
        o1.display();
        System.out.println("Order clone:");
        orderClone.display();

    }
}
