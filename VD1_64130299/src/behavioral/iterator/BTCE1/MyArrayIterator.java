package behavioral.iterator.BTCE1;

public class MyArrayIterator implements MyIterator{
    MyArray arrayAggregate;
    int index = 0;

    public MyArrayIterator(MyArray arrayAggregate) {
        this.arrayAggregate = arrayAggregate;
    }

    @Override
    public Object first() {
        return arrayAggregate.getItem(0);
    }

    @Override
    public Object next() {
        if(!isDone())
            return arrayAggregate.getItem(++index);
        return null;
    }

    @Override
    public boolean isDone() {
        return !(index < arrayAggregate.count()-1);
    }

    @Override
    public Object currentItem() {
        return arrayAggregate.getItem(index);
    }
}
