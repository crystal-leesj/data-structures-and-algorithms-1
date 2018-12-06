package LinkedList;

import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.soap.Node;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class SinglyLinkedListTest extends SinglyLinkedList {
//Start of Insert Test
    @Test
    public void insertAtBeginningShortTest() {

        int[] expected = {10,8,1,11};

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);

        assertArrayEquals(expected, actual.toArray());
    }
    @Test
    public void insertAtBeginningMediumTest() {

        int[] expected = {1,2,10,8,1,11};

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(2);
        actual.insertAtBeginning(1);

        assertArrayEquals(expected, actual.toArray());

    }
    @Test
    public void insertAtBeginningLongTest() {

        int[] expected = {12,4,1,2,10,8,1,11};

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(2);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(4);
        actual.insertAtBeginning(12);

        assertArrayEquals(expected, actual.toArray());
    }


//Start of Includes Test
    @Test
    public void includesShortTest() {

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        boolean expected = true;

        assertEquals(expected, actual.includes(8));

    }
    @Test
    public void includesMediumTest() {

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(9);
        actual.insertAtBeginning(13);
        boolean expected = true;

        assertEquals(expected, actual.includes(8));

    }

    @Test
    public void includesLongTest() {

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(6);
        actual.insertAtBeginning(2);
        actual.insertAtBeginning(18);
        actual.insertAtBeginning(15);
        boolean expected = true;

        assertEquals(expected, actual.includes(8));

    }


//Start of Print Test
    @Test
    public void printShortTest() {
        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        String expected = "10 8 1 11 ";
        System.out.println(expected);
        actual.print();
        System.out.println();

    }

    @Test
    public void printLongTest() {
        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(14);
        actual.insertAtBeginning(13);
        actual.insertAtBeginning(12);
        String expected = "12 13 14 10 8 1 11 ";
        System.out.println(expected);
        actual.print();
        System.out.println();

    }
    @Test
    public void printMediumTest() {
        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(14);
        actual.insertAtBeginning(13);
        String expected = "13 14 10 8 1 11 ";
        System.out.println(expected);
        actual.print();
        System.out.println();

    }

//Start of Length Test
    @Test
    public void lengthShortTest() {
        int expected =4;

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);

        assertEquals(expected, actual.toArray().length);


    }

    @Test
    public void lengthMediumTest() {

        int expected = 7;

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);

        assertEquals(expected, actual.toArray().length);


    }

    @Test
    public void lengthLongTest() {

        int expected = 10;

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);

        assertEquals(expected, actual.toArray().length);

    }

    //Testing for insertAfter
    @Test
    public void insertAfterShortTest() {

        int[] expected = {10,8,1,8,11};

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAfter(1,8);
        assertArrayEquals(expected, actual.toArray());
    }

    @Test
    public void insertAfterMediumTest() {

        int[] expected = {1,2,5,10,8,1,11};

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(2);
        actual.insertAtBeginning(1);
        actual.insertAfter(2,5);

        assertArrayEquals(expected, actual.toArray());

    }

    @Test
    public void insertAfterLongTest() {

        int[] expected = {12,4,1,2,8,10,8,1,11};

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(2);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(4);
        actual.insertAtBeginning(12);
        actual.insertAfter(2,8);

        assertArrayEquals(expected, actual.toArray());
    }
    //Testing for insertBefore
    @Test
    public void insertBeforeShortTest() {

        int[] expected = {10,8,8,1,11};

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertBefore(1,8);
        assertArrayEquals(expected, actual.toArray());
    }

    @Test
    public void insertBeforeMediumTest() {

        int[] expected = {1,8,2,10,8,1,11};

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(2);
        actual.insertAtBeginning(1);
        actual.insertBefore(2,8);

        assertArrayEquals(expected, actual.toArray());
    }

    @Test
    public void insertBeforeLongTest() {

        int[] expected = {12,4,1,8,2,10,8,1,11};

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(2);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(4);
        actual.insertAtBeginning(12);
        actual.insertBefore(2,8);

        assertArrayEquals(expected, actual.toArray());
    }

    //Testing for Append
    @Test
    public void appendShortTest() {

        int[] expected = {10,8,1,11,5};

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.append(5);
        assertArrayEquals(expected, actual.toArray());
    }

    @Test
    public void appendMediumTest() {

        int[] expected = {1,8,2,10,8,1,11};

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(2);
        actual.insertAtBeginning(1);
        actual.insertBefore(2,8);

        assertArrayEquals(expected, actual.toArray());
    }

    @Test
    public void appendLongTest() {

        int[] expected = {12,4,1,2,10,8,1,11,5};

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(2);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(4);
        actual.insertAtBeginning(12);
        actual.append(5);

        assertArrayEquals(expected, actual.toArray());
    }

    //Testing kthFromEnd
    @Test
    public void kthFromEndShortTest() {
        int[] arr = {110,8,1,11};

        int expected = 11;

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);

        int actually = actual.kthFromEnd(0).data;

        assertEquals(expected,actually);
    }


    @Test
    public void kthFromEndMediumTest() {
        int[] arr = {1,2,10,8,1,11};

        int expected = 11;

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(2);
        actual.insertAtBeginning(1);

        int actually = actual.kthFromEnd(0).data;

        assertEquals(expected,actually);
    }

    @Test
    public void kthFromEndLongTest() {
        int[] arr = {12,4,1,2,10,8,1,11};

      int expected = 11;

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = actual.insertAtBeginning(11);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(8);
        actual.insertAtBeginning(10);
        actual.insertAtBeginning(2);
        actual.insertAtBeginning(1);
        actual.insertAtBeginning(4);
        actual.insertAtBeginning(12);
        int actually = actual.kthFromEnd(0).data;

        assertEquals(expected,actually);
    }

    //Testing for merged List
    @Test
    public void mergedListShortTest() {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next=n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        ListNode n9 = new ListNode(9);
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;

        ListNode testing = mergeList(n1,n6);

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = testing;

        int[] expected = {1,6,2,7,3,8,4,9,5};
        int[] act = actual.toArray();

        assertArrayEquals(expected,act);
    }

    @Test
    public void mergedListMediumTest() {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n66 = new ListNode(66);

        n1.next=n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next= n66;

        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        ListNode n9 = new ListNode(9);
        ListNode n10 = new ListNode(10);
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;

        ListNode testing = mergeList(n1,n6);

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = testing;

        int[] expected = {1,6,2,7,3,8,4,9,5,10,66};
        int[] act = actual.toArray();

        assertArrayEquals(expected,act);
    }


    @Test
    public void mergedListLongTest() {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n66 = new ListNode(66);
        ListNode n77 = new ListNode(77);

        n1.next=n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next= n66;
        n66.next = n77;

        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        ListNode n9 = new ListNode(9);
        ListNode n10 = new ListNode(10);
        ListNode n11 = new ListNode(11);
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        n10.next = n11;

        ListNode testing = mergeList(n1,n6);

        SinglyLinkedList actual = new SinglyLinkedList();
        actual.head = testing;

        int[] expected = {1,6,2,7,3,8,4,9,5,10,66,11,77};
        int[] act = actual.toArray();

        assertArrayEquals(expected,act);
    }
}