package behavioral.iterator.BTCE1;

public class TapHop {
    private int [] item;
    private int size;

    public TapHop(int[] item) {
        this.item = item;
        this.size = item.length;
    }

    public int getItem(int i) {
        if(i >= 0 && i < size) {
            return item[i];
        }
        else {
            throw new IndexOutOfBoundsException("Chỉ số không hợp lệ.");
        }
    }

    public int count () {
        return size;
    }
}
