package stacksandqueues;

public class Stack {
    public Node top;

    //constructor
    public Stack (){
        this.top = null;
    }
    public void push(int data){
        //which takes any value as an argument
        // and adds a new node with that value
        // to the top of the stack
        // with an O(1) Time performance
        //create new node
        Node node = new Node (data);

        //point new node at old node
        node.next = this.top;
        //set top top new node
        this.top = node;
    }

    public Node pop(){
        //create reference called temp that points to the same node that top points to
        Node temp = this.top;
        //re-assign Top to the value that the Next property is referencing
        this.top = top.next;
        //clear out the next property in your current Temp
        temp.next = null;
        return temp;
    }
    public Node peek(){
        //Define a method called peek that
        // does not take an argument and returns the
        // node located on the top of the stack.

        return this.top;
}

    public int length(){
        if(this.top == null){
            return 0;
        }
        //create count variable to hold head
        int count = 0;
        Node current = this.top;
        while(current!=null){
            count++;
            current= current.next;
        }
        return count;
    }

    public int[] toArray(){
        int[] arr = new int[this.length()];
        int i = 0;
        while(this.top != null){
            arr[i++] = this.top.data;
            this.top = this.top.next;
        }
        return arr;
    }
}
