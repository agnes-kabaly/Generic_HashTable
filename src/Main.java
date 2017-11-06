public class Main {

    public static void main(String[] args) {

        HashTable<String, Integer> hashTable = new HashTable<>(128);
        System.out.println(hashTable.isEmpty());
        System.out.println(hashTable.isFull());
        System.out.println(hashTable.size());

        hashTable.insert("Süti", 100);
        hashTable.insert("Ági", 12);
        hashTable.insert("Béla", 43);
        hashTable.insert("Józsi", 99);
        hashTable.insert("Nina", 78);
        hashTable.insert("Dani", 1);
        System.out.println("Nina".hashCode() % 16);
        System.out.println(hashTable.isEmpty());
        System.out.println(hashTable.isFull());
        System.out.println(hashTable.size());

        hashTable.delete("Dani");
        System.out.println(hashTable.size());

        for (DataItem<String, Integer> i : hashTable.getArray()) {
            if (i != null) {
                System.out.println(i.getKey() + ": " + i.getValue());
            }
        }

    }


}
