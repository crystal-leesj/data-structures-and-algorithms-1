package stacksandqueues;

import java.util.Arrays;

public class AnimalShelter<T> {

    private Stack stack1;
    private Stack stack2;

    public static void main(String[] args){
        AnimalShelter as = new AnimalShelter();
        as.enqueue("cat");
        as.enqueue("dog");
        as.enqueue("dog");
        as.enqueue("cat");
        as.dequeue("cat");

        Object[] guess =  as.toArray();


        System.out.println(Arrays.toString(guess));
    }


    public AnimalShelter(){
        this.stack1 = new Stack();
        this.stack2 = new Stack();

    }

    public void enqueue(T animal){
        stack1.push(animal);

    }

    public T dequeue(T pref){

       if (this.stack1.peek() != null){
           Object[] animals = stack1.toArray();
           for(int i = 0; i<animals.length; i++){
               if(animals[i].equals(pref)){
                   return pref;
               }else{
                   return null;
               }
           }
        }
        return pref;
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
