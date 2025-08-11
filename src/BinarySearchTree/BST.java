package BinarySearchTree;

public class BST {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();

        bst.add(56); // root
        bst.add(30); // left
        bst.add(70); // right

        System.out.print("BST In-order Traversal: ");
        bst.printTree();
    }
}
class MyBinarySearchTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public void add(K key) {
        this.root = addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null) {
            return new MyBinaryNode<>(key);
        }
        int compareResult = key.compareTo(current.key);
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else if (compareResult > 0) {
            current.right = addRecursively(current.right, key);
        }
        return current; // duplicate values not added
    }

    public void printTree() {
        printInOrder(root);
    }

    private void printInOrder(MyBinaryNode<K> node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.key + " ");
            printInOrder(node.right);
        }
    }
}
class MyBinaryNode<K extends Comparable<K>> implements INode<K> {
    K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }
}
interface INode<K extends Comparable<K>> {
    K getKey();
    void setKey(K key);
}

