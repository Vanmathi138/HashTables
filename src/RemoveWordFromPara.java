public class RemoveWordFromPara{
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = paragraph.toLowerCase().split(" ");

        MyHashTable<String, Integer> hashTable = new MyHashTable<>(20);

        for (String word : words) {
            Integer count = hashTable.get(word);
            if (count == null) {
                hashTable.put(word, 1);
            } else {
                hashTable.put(word, count + 1);
            }
        }
        hashTable.remove("avoidable");

        System.out.println("\nUpdated Word Frequencies:");
        for (String word : words) {
            Integer freq = hashTable.get(word);
            if (freq != null) {
                System.out.println(word + ": " + freq);
            }
        }
    }
}
