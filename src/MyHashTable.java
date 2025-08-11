class MyHashTable<K, V> {
    private MyMapNode<K, V>[] buckets;
    private int size;

    public MyHashTable(int size) {
        this.size = size;
        buckets = new MyMapNode[size];
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % size;
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        MyMapNode<K, V> head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        MyMapNode<K, V> newNode = new MyMapNode<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        MyMapNode<K, V> head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        MyMapNode<K, V> head = buckets[index];
        MyMapNode<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    // First node in the list
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                System.out.println("Removed: " + key);
                return;
            }
            prev = head;
            head = head.next;
        }
        System.out.println("Word not found: " + key);
    }

    public void display() {
    }
}
