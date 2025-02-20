package BST;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst= new BinarySearchTree();
        bst.insert(1);
        bst.insert(4);
        bst.insert(2);
        bst.insert(5);
        bst.insert(6);
        bst.insert(3);
        bst.insert(8);
        bst.insert(7);
        bst.insert(9);
        bst.insert(10);

//        System.out.println("In Order Traversal");
//        bst.inOrderTraversal();

        System.out.println("Diameter of a tree\t"+bst.diameterOfTree());

    }
}
