public class HashTable<V, K> {

    private int maxSize;
    private DataItem[] array;
    private int size;

    public HashTable(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        array = (DataItem[]) new Object[maxSize];
    }

    public void insert(DataItem dataItem) {
        size++;
    }

    public void delete() {
        size--;
    }

    public int size() {
        return size;
    }

    public V getItem(K key) {
        return null;
    }


}
