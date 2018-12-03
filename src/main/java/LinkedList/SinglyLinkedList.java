package LinkedList;

import java.util.Arrays;

public class SinglyLinkedList {
    public ListNode head;

    public static void main (String[] args){
//        //creating a linkList
//        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//        singlyLinkedList.head = singlyLinkedList.insertAtBeginning(1);
//        singlyLinkedList.insertAtBeginning(2);
//        singlyLinkedList.insertAtBeginning(3);
//        singlyLinkedList.insertAtBeginning(5);
//
//
////        ListNode head = new ListNode(10);
////        ListNode second = new ListNode(8);
////        ListNode third = new ListNode(1);
////        ListNode fourth = new ListNode(11);
//
////        //Attach them together
////        head.next= second; //10-->8
////        second.next = third; //10--8--1
////        third.next = fourth; // 10--8--1--11--null
//
//        //creating a instance of the class
//
//        //applying the insert method
//
//        singlyLinkedList.print();
//        System.out.println(Arrays.toString(singlyLinkedList.toArray()));
//        //applying includes method
////        System.out.println(singlyLinkedList.includes(25));
////        System.out.println(singlyLinkedList.length(this.head));

    }

    public ListNode insertAtBeginning(int data){
        ListNode newNode = new ListNode(data);

        if(this.head == null){
            return newNode;
        }
        newNode.next= this.head;
        this.head = newNode;
        return newNode;
    }

    public boolean includes (int x){

       ListNode current = this.head; //initializing current
        while(current != null){
            if(current.data ==  x){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //given a list node, print all elements it holds
    public void print() {
        if (this.head == null) {
            return;
        }
        ListNode current = this.head;
        while (current != null) {
            System.out.print(current.data+ " -->");
            current = current.next;
        }
//        System.out.println(current); //until nothing in list
    }


    //given a list node fine out length, not part of lab, just something I wanted
    //to see
    public int length(ListNode head){
        if(head == null){
            return 0;
        }
        //create count variable to hold head
        int count = 0;
        ListNode current = head;
        while(current!=null){
            count++;
            current= current.next;
        }
        return count;
    }

    public int[] toArray(){
        int[] arr = new int[length(this.head)];
        int i = 0;
        while(this.head != null){
            arr[i++] = this.head.data;
            this.head = this.head.next;
        }
        return arr;
    }
}


