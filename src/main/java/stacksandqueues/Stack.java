package stacksandqueues;

public class Stack <T> {
    public Node <T> top;

    //constructor
    public Stack (){
        this.top = null;
    }
    public void push(T data){
        //which takes any value as an argument
        // and adds a new node with that value
        // to the top of the stack
        // with an O(1) Time performance
        //create new node
        Node<T> node = new Node(data);

        //point new node at old node
        node.next = this.top;
        //set top top new node
        this.top = node;
    }

    public T pop(){
        //create reference called temp that points to the same node that top points to
        Node<T> temp = this.top;
        //re-assign Top to the value that the Next property is referencing
        this.top = top.next;
        //clear out the next property in your current Temp
        temp.next = null;
        return temp.data;
    }
    public Node peek(){
        //Define a method called peek that
        // does not take an argument and returns the
        // node located on the top of the stack.

        return this.top;
}

    public int length(Node head){
        if(head == null){
            return 0;
        }
        //create count variable to hold head
        int count = 0;
        Node current = head;
        while(current!=null){
            count++;
            current= current.next;
        }
        return count;
    }

    public T[] toArray(){
        T[] arr = (T[])new Object[length(this.top)];
        int i = 0;
        while(this.top != null){
            arr[i++] = this.top.data;
            this.top = this.top.next;
        }
        return arr;
    }
}
