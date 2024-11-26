package behavioral.iterator.BTCE1;

public class MyArray {
    private int[] mang = {1,2,3,4,5,6,7,8,9,10};

    public MyArray(int i) {
    }

    public int count() {
        return mang.length;
    }

    public Object getItem(int i) {
        return mang[i];
    }
    public MyIterator createIterator() {
        return new MyArrayIterator(this);
    }
}
