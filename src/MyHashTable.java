import java.util.LinkedList;

public class MyHashTable<K, V> {
    private final int numBuckets;
    private final LinkedList<MyMapNode<K, V>>[] bucketArray;

    @SuppressWarnings("unchecked")
    public MyHashTable(int capacity) {
        this.numBuckets = capacity;
        this.bucketArray = new LinkedList[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            bucketArray[i] = new LinkedList<>();
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % numBuckets);
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        for (MyMapNode<K, V> node : bucketArray[index]) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        for (MyMapNode<K, V> node : bucketArray[index]) {
            if (node.getKey().equals(key)) {
                node.setValue(value);
                return;
            }
        }
        bucketArray[index].add(new MyMapNode<>(key, value));
    }

    public void display() {
        for (LinkedList<MyMapNode<K, V>> bucket : bucketArray) {
            for (MyMapNode<K, V> node : bucket) {
                System.out.println(node.getKey() + ": " + node.getValue());
            }
        }
    }
}
