package stacksandqueues;

public class PseudoQueue<T>  {
    private Stack stack1;
    private Stack stack2;

    public PseudoQueue(){ //implementing a queue using two stacks
        this.stack1 = new Stack();
        this.stack2 = new Stack(); //for dequeueing

    }

    public void enqueue(T value){
        stack1.push(value);
    }

    public T dequeue(){
        while(stack1.peek() != null) {
            stack2.push(stack1.pop());
        }

        T value = (T) stack2.pop();

        while(stack2.peek() != null){
            stack1.push(stack2.pop());
        }
        return value;
    }

    public T[] toArray(){
        int i = 0, count = 0;
        while(stack1.peek() != null) {
            stack2.push(stack1.pop());
            count++;
        }
        T[] result = (T[]) new Object[count];
        while(stack2.peek() != null){
            T val = (T) stack2.pop();
            stack1.push(val);
            result[i++] = val;
        }

        return result;
    }
}
