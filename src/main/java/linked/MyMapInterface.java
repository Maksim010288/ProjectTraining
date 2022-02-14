package linked;

public interface MyMapInterface<K, V> {
    int size = 0;
    public void put(K k, V v);
    public V get(int index);
}
