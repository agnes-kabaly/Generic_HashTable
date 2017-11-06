public class HashTable<K, V> {

    private int maxSize;
    private DataItem[] array;
    private int size;

    public HashTable(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        array = (DataItem[]) new Object[maxSize];
    }

    public void insert(K key, V value) {
        DataItem<K, V> dataItem = new DataItem<K, V>(key, value);
        int index = key.hashCode() % maxSize;
        while (array[index] != null) {
            index = key.hashCode()+1 % maxSize;
        }
        array[index] = dataItem;
        size++;
    }

    public void delete(K key) {
        int index = key.hashCode() % maxSize;
        while (array[index].getKey().equals(key)) {
            index = key.hashCode() + 1 % maxSize;
        }
        array[index] = null;
        size--;
    }

    public V getItem(K key) {
        int index = key.hashCode() % maxSize;
        while (array[index].getKey().equals(key)) {
            index = key.hashCode() + 1 % maxSize;
        }
        return (V) array[index].getValue();
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public int size() {
        return size;
    }


}
