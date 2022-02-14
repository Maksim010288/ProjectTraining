package linked;

import java.util.LinkedList;

public class MyMap<K, V> implements MyMapInterface<K, V> {
    LinkedList<Basket> baskets = new LinkedList<>();
    int size = 0;

    @Override
    public void put(K k, V v) {
        size++;
        baskets.add(new Basket(k, v));
    }

    @Override
    public V get(int index) {
        int count = 0;
        for (Basket basket : baskets) {
            if (count == index) {
                return basket.getValue();
            }
            count++;
        }
        return null;
    }

    @Override
    public String toString() {
        for (Basket basket : baskets){
            System.out.println(basket.getKey() + " " + basket.getValue());
        }
        return null;
    }

    class Basket{
        private final K key;
        private final V value;

        public Basket(K key, V value) {
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
