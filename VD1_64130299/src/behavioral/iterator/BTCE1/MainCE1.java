package behavioral.iterator.BTCE1;

import java.util.Arrays;

public class MainCE1 {
    public static void main(String[] args) {
        MyArray myArray = (MyArray) Arrays.asList(
                new MyArray(1),
                new MyArray(2)
        );
        System.out.println(myArray.count());
    }
}
