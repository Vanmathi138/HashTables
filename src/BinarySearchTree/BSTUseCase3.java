package BinarySearchTree;

public class BSTUseCase3 {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();

        // Adding nodes (same as UC2)
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

        boolean found = bst.search(63);
        System.out.println("Is 63 present in the tree? " + found);
    }
}

