package collections;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private int index = 0;
    private double num = 0.4d;
    E[] values;

    public ArrayIterator(E[] values){
        this.values = values;
    }

    public boolean hasNext() {
        return index < values.length ;
    }

    public E next() {
        return values[index++];
    }
}