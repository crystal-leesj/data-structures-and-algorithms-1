package Tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void addShort() {
        BinaryTree helperClass = new BinaryTree();
        BinarySearchTree classToTest = new BinarySearchTree();

        //creating tree
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        //connecting tree
        n1.left = n2;
        n1.right = n3;

        //creating node to add
        Node n4 = new Node(4);

        classToTest.add(n1, n4);

        List<Node> test = helperClass.preOrder(n1);
        String actual = helperClass.print(test);

        List<Node> expect = Arrays.asList(n1, n2, n3,n4);
        String expected = helperClass.print(expect);

        assertEquals(expected, actual);
    }

    @Test
    public void addMedium() {
        BinaryTree helperClass = new BinaryTree();
        BinarySearchTree classToTest = new BinarySearchTree();

        //creating tree
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        //connecting tree
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;

        //creating node to add
        Node n5 = new Node(5);

        classToTest.add(n1, n5);

        List<Node> test = helperClass.inOrder(n1);
        String actual = helperClass.print(test);

        List<Node> expect = Arrays.asList(n4,n2,n1,n3,n5);
        String expected = helperClass.print(expect);

        assertEquals(expected, actual);
    }


    @Test
    public void addLarge() {
        BinaryTree helperClass = new BinaryTree();
        BinarySearchTree classToTest = new BinarySearchTree();

        //creating tree
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        //connecting tree
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;


        //creating node to add
        Node n8= new Node(8);


        classToTest.add(n1, n8);

        List<Node> test = helperClass.postOrder(n1);
        String actual = helperClass.print(test);

        List<Node> expect = Arrays.asList(n4,n5,n2,n6,n8,n7,n3,n1);
        String expected = helperClass.print(expect);

        assertEquals(expected, actual);
    }

    //TESTING FOR SEARCH
    @Test
    public void searchShort() {
        BinaryTree helperClass = new BinaryTree();
        BinarySearchTree classToTest = new BinarySearchTree();

        //creating tree
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        //connecting tree
        n1.left = n2;
        n1.right = n3;

        classToTest.search(n1, 1);

        List<Node> test = helperClass.preOrder(n1);
        String actual = helperClass.print(test);

        List<Node> expect = Arrays.asList(n1, n2, n3);
        String expected = helperClass.print(expect);

        assertEquals(expected, actual);
    }
    @Test
    public void searchMedium() {
        BinaryTree helperClass = new BinaryTree();
        BinarySearchTree classToTest = new BinarySearchTree();

        //creating tree
        Node n1 = new Node(1);
        Node n2 = new Node(7);
        Node n3 = new Node(3);
        Node n4 = new Node(5);

        //connecting tree
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;

        classToTest.search(n1, 3);

        List<Node> test = helperClass.preOrder(n1);
        String actual = helperClass.print(test);

        List<Node> expect = Arrays.asList(n1, n2, n4,n3);
        String expected = helperClass.print(expect);

        assertEquals(expected, actual);
    }

    @Test
    public void searchLarge() {
        BinaryTree helperClass = new BinaryTree();
        BinarySearchTree classToTest = new BinarySearchTree();

        //creating tree
        Node n1 = new Node(1);
        Node n2 = new Node(7);
        Node n3 = new Node(3);
        Node n4 = new Node(5);
        Node n5 = new Node(9);

        //connecting tree
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;

        classToTest.search(n1, 3);

        List<Node> test = helperClass.preOrder(n1);
        String actual = helperClass.print(test);

        List<Node> expect = Arrays.asList(n1, n2, n4,n5,n3);
        String expected = helperClass.print(expect);

        assertEquals(expected, actual);
    }

}