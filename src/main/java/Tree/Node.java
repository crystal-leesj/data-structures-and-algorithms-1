package Tree;
public class Node<T> {
    //Create a Node class that has properties for the value stored in
    // the node, the left child node, and the right child node

    public T data;
    public Node right;
    public Node left;

    //constructor
    public Node (T data){
        this.right = null;
        this.left = null;
        this.data = data;
    }
}

