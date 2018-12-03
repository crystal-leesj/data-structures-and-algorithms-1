public class SinglyLinkedList {

    public static void main (String[] args){
        //creating a linkList
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        //Attach them together
        head.next= second; //10-->8
        second.next = third; //10--8--1
        third.next = fourth; // 10--8--1--11--null

        //creating a instance of the class
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        //applying the insert method
        ListNode newhead = singlyLinkedList.insertAtBeginning(head,5);
        singlyLinkedList.print(newhead);
System.out.println();
        //applying includes method
        System.out.println(singlyLinkedList.includes(newhead,1));
        System.out.println(singlyLinkedList.length(newhead));

    }

    public ListNode insertAtBeginning(ListNode head, int data){
        ListNode newNode = new ListNode(data);

        if(head == null){
            return newNode;
        }
        newNode.next= head;
        head = newNode;
        return head;
    }

    public boolean includes (ListNode head, int x){

       ListNode current = head; //initializing current
        while(current != null){
            if(current.data ==  x){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //given a list node, print all elements it holds
    public void print(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data+ " -->");
            current = current.next;
        }
        System.out.println(current); //until nothing in list
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

}


