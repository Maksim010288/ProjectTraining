package linked;

import java.util.Iterator;

public class ListIterator<E> implements Iterator<E> {
    private int index = 0;
    E[] values;

    public ListIterator(E[] values){
        this.values = values;
    }

    public boolean hasNext() {
        return index < values.length ;
    }

    public E next() {
        return values[index++];
    }
}