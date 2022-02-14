package linked;

import java.util.LinkedList;

public class MyMap<K, V> implements MyMapInterface<K, V> {
    LinkedList<Entry> baskets = new LinkedList<>();
    Entry entry;

    @Override
    public void put(K k, V v) {
        baskets.add(new Entry(k, v));
    }

    @Override
    public V get(K key) {
        for (Entry entry : baskets) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        for (Entry basket : baskets) {
            System.out.println(basket.getKey() + " " + basket.getValue());
        }
        return null;
    }

    class Entry {
        private final K key;
        private final V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
