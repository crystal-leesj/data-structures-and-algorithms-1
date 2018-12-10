package stacksandqueues;

public class Queue {
    Node front;
    Node rear;
     //testing purposes to keep track of the whole list while populating using the toArray Method
    public Queue (){
        this.front = null; //assignment called this top
        this.rear= null; //aka rear
    }

    public void enqueue(int data){
        //create new node
        Node node = new Node (data);
        if(this.rear == null){
            //re-assign rear
            rear = node;
            this.front = node;
        } else {
            //First, we should change the Next property of Node5 to point to the node we are adding.
            rear.next = node;
            rear = node;
        }
    }

    public Node dequeue(){

        //create a temporary reference type named
        //Temp and have it point to the same node that Front is pointing too

        if(this.front == null){
            return null;
        }
        Node temp = front;
        front = front.next;
        temp.next = null;
        return temp;
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

    public int[] toArray(){
        Node current = this.front;
        int[] arr = new int[length(this.front)];
        int i = 0;
        while(current != null){
            arr[i++] = current.data;
            current = current.next;
        }
        return arr;
    }

}
