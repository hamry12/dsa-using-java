package BST;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst= new BinarySearchTree();
        bst.insert(45);
        bst.insert(29);
        bst.insert(72);
        bst.insert(33);
        bst.insert(53);
        bst.insert(55);

        System.out.println("In Order Traversal");
        bst.inOrderTraversal();

    }
}
