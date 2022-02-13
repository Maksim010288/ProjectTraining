package linked;

import java.util.ArrayList;

public class MyMap<K, V> {
    ArrayList<K> listInteger = new ArrayList<>();
    ArrayList<V> listString = new ArrayList<>();

    public void put(K k, V v) {
        listInteger.add(k);
        listString.add(v);
    }

    public V get(int key) {
        if (key <= listInteger.size()-1) {
            return listString.get(key);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(7865, "Honda");
        System.out.println(myMap.get(0));
    }
}
