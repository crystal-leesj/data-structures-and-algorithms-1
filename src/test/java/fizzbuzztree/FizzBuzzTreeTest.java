package fizzbuzztree;

import Tree.BinaryTree;
import Tree.Node;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzTreeShort() {
        FizzBuzzTree classToTest = new FizzBuzzTree();
        //allowing me to instance methods
        BinaryTree helperClass = new BinaryTree();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(15);
        Node n4 = new Node(4);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;

        classToTest.fizzBuzzTree(n1);

        List<Node> test = helperClass.preOrder(n1);
        String actual = helperClass.print(test);

        List<Node> expect = Arrays.asList(n1,n2,n4,n3);
        String expected = helperClass.print(expect);

        assertEquals(expected, actual);

    }

    @Test
    public void fizzBuzzTreeMedium() {
        FizzBuzzTree classToTest = new FizzBuzzTree();
        //allowing me to instance methods
        BinaryTree helperClass = new BinaryTree();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(15);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        classToTest.fizzBuzzTree(n1);

        List<Node> test = helperClass.inOrder(n1);
        String actual = helperClass.print(test);

        List<Node> expect = Arrays.asList(n4,n2,n5,n1,n3);
        String expected = helperClass.print(expect);

        assertEquals(expected, actual);

    }

    @Test
    public void fizzBuzzTreeLarge() {
        FizzBuzzTree classToTest = new FizzBuzzTree();
        //allowing me to instance methods
        BinaryTree helperClass = new BinaryTree();

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(15);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;

        classToTest.fizzBuzzTree(n1);

        List<Node> test = helperClass.postOrder(n1);
        String actual = helperClass.print(test);

        List<Node> expect = Arrays.asList(n4,n5,n2,n6,n7,n3,n1);
        String expected = helperClass.print(expect);

        assertEquals(expected, actual);

    }
}