package linked;

import java.util.LinkedList;
import java.util.Objects;

public class MyMap<K, V> implements MyMapInterface<K, V> {
    LinkedList<Entry> entries = new LinkedList<>();


    @Override
    public void put(K k, V v) {
        for (Entry entry : entries) {
            if (entry.key.hashCode() == k.hashCode()) {
                if(entry.key.equals(k)){
                    entries.remove(entry);
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

    @Override
    public String toString() {
        return entries + "";
    }

    class Entry {
        private K key;
        private V value;

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

        private K setKey(K k) {
            return key = k;
        }

        public V setValue(V v) {
            return value = v;
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
}
