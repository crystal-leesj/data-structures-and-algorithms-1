package LinkedList;

import java.util.Arrays;


public class SinglyLinkedList {
    public ListNode head;

    public static void main (String[] args){
        //creating a linkList
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = singlyLinkedList.insertAtBeginning(1);
        singlyLinkedList.insertAtBeginning(2);
        singlyLinkedList.insertAtBeginning(3);
        singlyLinkedList.insertAtBeginning(5);
        singlyLinkedList.append(5);
//        singlyLinkedList.insertBefore(1,8);
//        singlyLinkedList.insertAfter(3,8);


        //applying the insert method

        singlyLinkedList.print();
        System.out.println();
        System.out.println(Arrays.toString(singlyLinkedList.toArray()));
        //applying includes method
//        System.out.println(singlyLinkedList.includes(25));
//        System.out.println(singlyLinkedList.length(this.head));

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

    public boolean includes (int value){

       ListNode current = this.head; //initializing current
        while(current != null){//while we are not at the end
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //given a list node, print all elements it holds
    public void print() {
//        if (this.head == null) {
//            return;
//        }
        ListNode current = this.head;
        while (current != null) {
            System.out.print(current.data+ " ");
            current = current.next;
        }
//        System.out.println(current); //null at end of node
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

    public void append (int value){
        ListNode current = this.head;
        ListNode newNode = new ListNode(value);
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;

    }

    public  void insertBefore(int value, int newVal) {
        ListNode newNode = new ListNode(newVal);
        ListNode current = this.head;
        if (current.data == value) {
            newNode.next = current;
            this.head = newNode;
            return;
        }
            while (current.next.data != value) {
                if(current.next == null)
                    return;
                current = current.next;
            }
            ListNode temp = current.next;
            current.next = newNode;
            newNode.next = temp;

    }

    public void insertAfter(int value, int newVal){
        ListNode newNode = new ListNode(newVal);
        ListNode current = this.head;
        if (current.data == value) {
            newNode.next = current.next;
            current.next = newNode;
            return;
        }
        while (current.data != value) {
            if(current == null)
                return;
            current = current.next;
        }
        ListNode temp = current.next;
        current.next = newNode;
        newNode.next = temp;
    }
    public ListNode kthFromEnd (int k){
            ListNode current = this.head;
            int length = length(head);
            int count = 0;
            while(current != null){
                if(length-1-k == count){
                    return current;
                }
                current = current.next;
                count++;
            }
        return null;
    }

    public static ListNode mergeList (ListNode head1,ListNode head2){
        ListNode current1 = head1 , current2 = head2;
        ListNode temp1 = current1.next, temp2 = current2.next;

        if(head1 == null){
            return head2;
        } if(head2 == null){
            return  head1;
        }
        while(temp1!= null && temp2 != null){
           current1.next = current2;
           current2.next = temp1;

           current1= temp1;
           temp1 = temp1.next;
           current2 = temp2;
           temp2 = temp2.next;
        }
        if(current1.next != current2){
            current1.next = current2;
        }
//        if(temp1 == null){
//            current2.next = temp2;
//        }
        if(current2.next == null){
            current2.next = temp1;
        }
        return head1;
    }
}


