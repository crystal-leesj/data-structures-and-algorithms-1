package stacksandqueues;

public class Queue <T> {
    Node<T> front;
    Node<T> rear;
     //testing purposes to keep track of the whole list while populating using the toArray Method
    public Queue (){
        this.front = null; //assignment called this top
        this.rear= null; //aka rear
    }

    public void enqueue(T data){
        //create new node
        Node<T> node = new Node<T>(data);
        if(this.front == null){ // had this. rear as null
            //re-assign rear
            rear = node;
            this.front = node;
        } else {
            //First, we should change the Next property of Node5 to point to the node we are adding.
            rear.next = node;
            rear = node;
        }
    }

    public T dequeue(){

        //create a temporary reference type named
        //Temp and have it point to the same node that Front is pointing too

        if(this.front == null){
            return null;
        }
        //more conditional
        Node<T> temp = front;
        front = front.next;
        temp.next = null;
        return temp.data;
    }

    public Node peek (){
        return this.front;
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

    public boolean isEmpty(){
        return this.front == null;
    }
    public T[] toArray(){
        Node<T> current = this.front;
        T[] arr = (T[])new Object[length(this.front)];
        int i = 0;
        while(current != null){
            arr[i++] = current.data;
            current = current.next;
        }
        return arr;
    }

}
