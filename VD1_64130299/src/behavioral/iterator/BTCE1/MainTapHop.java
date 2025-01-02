package behavioral.iterator.BTCE1;

public class MainTapHop {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6};
        TapHop tapHop = new TapHop(numbers);
        TapHopIterator iterator = new TapHopIterator(tapHop);


        System.out.println("Duyệt qua các phần tử trong tập hợp");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Tổng số phần tử có trong mảng");
        System.out.println(tapHop.count());
        System.out.println("Giá trị của phần tử thứ 2");
        System.out.println(tapHop.getItem(2));
    }
}
