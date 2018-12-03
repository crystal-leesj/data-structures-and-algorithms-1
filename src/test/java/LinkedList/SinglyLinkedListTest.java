package LinkedList;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {
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
        String expected = "10 -->8 -->1 -->11 -->";
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
        String expected = "12 -->13 -->14 -->10 -->8 -->1 -->11 -->";
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
        String expected = "13 -->14 -->10 -->8 -->1 -->11 -->";
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
}