public class DataItem<K, V> {

    private V value;

    private K key;

    public DataItem(K key, V value) {
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
