package behavioral.iterator.BTCE1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TapHopIterator implements Iterator<Integer> {
    private TapHop tapHop;
    private int currentIndex = 0;

    public TapHopIterator(TapHop tapHop) {
        this.tapHop = tapHop;
    }

    //Kiểm tra xem còn phần tử nào tiếp theo không
    @Override
    public boolean hasNext() {
        return currentIndex < tapHop.count();
    }

    @Override
    public Integer next() {
        if(!hasNext()) {
            throw new NoSuchElementException("Không còn phần tử nào");
        }
        return tapHop.getItem(currentIndex++);
    }
}
