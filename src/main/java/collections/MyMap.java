package collections;

import java.util.LinkedList;
import java.util.Objects;

public class MyMap<K, V> implements MyMapInterface<K, V> {
    LinkedList<Entry> entries = new LinkedList<>();
    MyMap.Entry[] arrays = new MyMap.Entry[16];
    int counter = 0;

    public void numberOnTopOfTheParkingByCarNumber() {
        for (Entry entry : entries) {
            int remainderFromDivision = entry.key.hashCode() % 16;
            arrays[remainderFromDivision] = new Entry(entry.key, entry.value);
            System.out.println(arrays[remainderFromDivision] + " поверх - " + remainderFromDivision);
        }
    }


    @Override
    public void put(K k, V v) {
        for (Entry entry : entries) {
            if (entry.key.hashCode() == k.hashCode()) {
                if (entry.key.equals(k)) {
                    entries.remove(entry);
                    entries.size();
                }
            }
        }
        entries.add(new Entry(k, v));
    }

    @Override
    public V get(K key) {
        for (Entry entry : entries) {
            if (entry.key.hashCode() == key.hashCode()) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public void addValueByKeyToCart(K key) {
        int outHash = key.hashCode() % 16;
        for (Entry entry : entries) {
            if (entry.key.hashCode() == key.hashCode()) {
            }
        }
    }


    public void getKey(K key) {
        int outKey = key.hashCode() % 16;
        System.out.println(outKey);
    }

    public Integer size() {
        return entries.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyMap<?, ?> myMap = (MyMap<?, ?>) o;
        return Objects.equals(entries, myMap.entries);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(entries);
        result = 31 * result;
        return result;
    }

    @Override
    public String toString() {
        return entries.toString();
    }

    class Entry {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Entry(K k) {
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return key + "-" + value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry entry = (Entry) o;
            return Objects.equals(key, entry.key) && Objects.equals(value, entry.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

    public static void main(String[] args) {
        MyMap<Integer, String> myMap = new MyMap<>();

    }
}
