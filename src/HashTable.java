public class HashTable<K, V> {

    private int maxSize;
    private DataItem[] array;
    private int size;

    public HashTable(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        array = new DataItem[maxSize];
    }

    public void insert(K key, V value) {
        if (isFull()) {
            System.out.println("HashTable is full, insert() isn't possible");
        } else {
            DataItem<K, V> dataItem = new DataItem<K, V>(key, value);
            int index = Math.abs(key.hashCode()) % maxSize;
            while (array[index] != null) {
                index = Math.abs(key.hashCode() + 1) % maxSize;
            }
            array[index] = dataItem;
            size++;
        }
    }

    public void delete(K key) {
        int index = Math.abs(key.hashCode()) % maxSize;
        while (!array[index].getKey().equals(key)) {
            index = Math.abs(key.hashCode() + 1) % maxSize;
        }
        array[index] = null;
        size--;
    }

    public V getItem(K key) {
        int index = Math.abs(key.hashCode()) % maxSize;
        while (!array[index].getKey().equals(key)) {
            index = Math.abs(key.hashCode() + 1) % maxSize;
        }
        return (V) array[index].getValue();
    }

    public boolean isFull() {
        System.out.println("XSIII" + size);
        System.out.println("MMAAA" + maxSize);
        return size == maxSize;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public int size() {
        return size;
    }


}
