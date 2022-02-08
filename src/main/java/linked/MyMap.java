package linked;

public class MyMap<K, V> {
    Basket basket;

    public void put(K k , V v){
        basket = new Basket(k, v);
    }

    @Override
    public String toString() {
        return  basket.key + " - " + basket.value + "\n";
    }

    class Basket{
        K key;
        V value;

        Basket(K k, V v) {
            this.key = k;
            this.value = v;
        }

    }

    public static void main(String[] args) {
        MyMap<Integer, String> myMap = new MyMap<>();
        myMap.put(123, "Вино");
        myMap.put(223, "Шампанське");
        System.out.println(myMap);
    }
}
