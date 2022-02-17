package collections;

import java.util.LinkedList;
import java.util.Objects;

public class MyMap<K, V> implements MyMapInterface<K, V> {
    LinkedList<Entry> entries = new LinkedList<>();
    Entry entrySize = new Entry();

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

    public Integer size() {
        return entries.size();
    }

    @Override
    public String toString() {
        return entries.toString();
    }

    class Entry {
        private K key;
        private V value;
        int size = 0;


        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Entry() {
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
}
