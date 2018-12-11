package stacksandqueues;

public class Node<T> {
    public T data;
    public Node next;
    //constructor
    public  Node (T data){
        this.next = null;
        this.data = data;
    }
}
