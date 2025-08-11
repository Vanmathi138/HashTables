package BinarySearchTree;

public class BSTUseCase2 {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();

        // Adding nodes according to figure
        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(65);
        bst.add(3);
        bst.add(16);
        bst.add(63);
        bst.add(67);

        // Check size
        System.out.println("Size of BST: " + bst.size()); // should be 13
    }
}

