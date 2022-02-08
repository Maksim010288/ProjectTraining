package linked;

import java.util.List;

public class MyLinkedSet<E> implements MyCollection<E> {
    public E[] values;

    public MyLinkedSet(){
        values = (E[]) new Object[0];
    }

    @Override
    public E add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
        }catch (ClassCastException ex){
            System.err.println("Exception");
        }
        return null;
    }


    public void getAll(List list){
        for (Object elem : list){
            System.out.println(elem.toString());
        }
    }

    @Override
    public E get(int e) {
        return values[e];
    }

}
