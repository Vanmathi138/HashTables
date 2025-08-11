import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split("\\s+");

        MyHashTable<String, Integer> hashTable = new MyHashTable<>(10);
        for (String word : words) {
            Integer count = hashTable.get(word);
            if (count == null) {
                hashTable.put(word, 1);
            } else {
                hashTable.put(word, count + 1);
            }
        }

        System.out.println("Word Frequencies:");
        hashTable.display();
    }
}
 