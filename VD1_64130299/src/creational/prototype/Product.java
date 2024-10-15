package creational.prototype;

import java.io.Serializable;

public class Product implements Cloneable, Serializable{
    String id;
    String name;
    int quantity;

    public Product(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }


    public Product copy() {
        return PrototypeHelper.copy(this);
    }

    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e.toString());
            return null;
        }
    }

}
