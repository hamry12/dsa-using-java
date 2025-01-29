package BST;

public class BinarySearchTree {
    private Node rootNode;

    /**
     * @param data
     * inserts data in tree node
     */

    public boolean insert(int data){
        Node node= new Node(data);

        // check if root node is empty
        if(rootNode == null){
            rootNode=node;
            return true;
        }
        // create temp node for traversal
        Node temp=rootNode;
        while(true){
            if(temp.data == data){
                return false;
            }
            if(data > temp.data){
                if(temp.right == null){
                    temp.right=node;
                    return false;
                }
                temp=temp.right;
            } else {
                if(temp.left == null){
                    temp.left=node;
                    return false;
                }
                temp=temp.left;
            }
        }
    }

    /**
     * @param data
     * verify if exists in Tree
     */
    public boolean contains(int data){
        if(rootNode == null){
            throw new RuntimeException("Empty Tree!!!");
        }
        Node temp=rootNode;
        while(true){
            if(data == temp.data){
                return true;
            }
            if(data > temp.data){
                if(temp.right == null){
                    return false;
                }
                temp=temp.right;
            }else{
                if(temp.left == null){
                    return false;
                }
                temp=temp.left;
            }
        }
    }

    public void inOrderTraversal() {
        inOrderTraversal(rootNode);
        System.out.println();
    }

    private void inOrderTraversal(Node rootNode) {
        if(rootNode == null){
            return;
        }
        inOrderTraversal(rootNode.left);
        System.out.print(rootNode.data+"->");
        inOrderTraversal(rootNode.right);
    }
}
