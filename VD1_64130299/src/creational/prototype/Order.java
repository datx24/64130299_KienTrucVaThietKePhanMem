package creational.prototype;

import java.util.List;

public class Order extends Prototype{
    String id, tenKH;
    List<Product> products;


    public Order(String id, String tenKH, List<Product> products) {
        this.id = id;
        this.tenKH = tenKH;
        this.products = products;
    }

    @Override
    public Order copy(){
        return (Order)super.copy();
    }

    public Order clone(){
        return (Order)super.clone();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", products=" + products +
                '}';
    }
    public void display(){
        System.out.println(id+" : "+tenKH);
        for(var p: products){
            System.out.println(p.toString());
        }
    }
}
