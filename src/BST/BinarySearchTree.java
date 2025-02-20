package BST;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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

    public int diameterOfTree(){
        Map<Node, Integer> heightMap= new HashMap<>();
        Stack<Node> stack= new Stack<>();
        stack.push(rootNode);
        int diameter=0;
        int count=1;
        while(!stack.isEmpty()){
            System.out.println("count==>"+count);
            Node temp=stack.peek();
            System.out.println("Peeked==>"+temp.data);
            if(temp.left!=null && !heightMap.containsKey(temp.left)){
                System.out.println("Left Data\t"+temp.left.data);
                stack.push(temp.left);
            } else if (temp.right != null && !heightMap.containsKey(temp.right)) {
                System.out.println("Right Data\t"+temp.right.data);
                stack.push(temp.right);
            }else{
                stack.pop();

                int leftheight= heightMap.getOrDefault(temp.left, 0);
                System.out.println("Left height\t @Node\t"+leftheight);

                int rightheight = heightMap.getOrDefault(temp.right, 0);
                System.out.println("Right height\t @ Node\t"+ rightheight);

                heightMap.put(temp, 1+ Math.max(leftheight, rightheight));
                diameter=  Math.max(diameter, leftheight+rightheight);
            }

            count++;
        }
        return diameter;
    }
}
