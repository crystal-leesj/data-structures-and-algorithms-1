package Tree;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {

    //Setting up to be able to test for System.out.println()

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }





    @Test
    public void preOrderEmpty() {
        BinaryTree classToTest = new BinaryTree();
        Node node = null;
        List<Node> actual = classToTest.preOrder(node);
        List<Node> exected = new ArrayList<>();

        assertEquals(exected, actual);
    }

    @Test
    public void preOrderShort() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.left = n2;
        n1.right = n3;
        List<Node> test = classToTest.preOrder(n1);
        String actual = classToTest.print(test);

        List<Node> expect = Arrays.asList(n1, n2, n3);
        String expected = classToTest.print(expect);

        assertEquals(expected, actual);

    }

    @Test
    public void preOrderMedium() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        List<Node> test = classToTest.preOrder(n1);
        String actual = classToTest.print(test);

        List<Node> expect = Arrays.asList(n1, n2, n4, n5, n3);
        String expected = classToTest.print(expect);
        assertEquals(expected, actual);
    }

    @Test
    public void preOrderLarge() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
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

        List<Node> test = classToTest.preOrder(n1);

        String actual = classToTest.print(test);
        List<Node> expect = Arrays.asList(n1, n2, n4, n5, n3, n6, n7);
        String expected = classToTest.print(expect);
        assertEquals(expected, actual);
    }

    //STARTING TEST FOR INORDER
    @Test
    public void inOrderEmpty() {
        BinaryTree classToTest = new BinaryTree();
        Node node = null;
        List<Node> actual = classToTest.inOrder(node);
        List<Node> expected = new ArrayList<>();

        assertEquals(expected, actual);
    }

    @Test
    public void inOrderShort() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.left = n2;
        n1.right = n3;
        List<Node> test = classToTest.inOrder(n1);
        String actual = classToTest.print(test);

        List<Node> expect = Arrays.asList(n2, n1, n3);
        String expected = classToTest.print(expect);

        assertEquals(expected, actual);
    }

    @Test
    public void inOrderMedium() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        List<Node> test = classToTest.inOrder(n1);
        String actual = classToTest.print(test);

        List<Node> expect = Arrays.asList(n4, n2, n5, n1, n3);
        String expected = classToTest.print(expect);
        assertEquals(expected, actual);
    }

    @Test
    public void inOrderLarge() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
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

        List<Node> test = classToTest.inOrder(n1);

        String actual = classToTest.print(test);
        List<Node> expect = Arrays.asList(n4, n2, n5, n1, n6, n3, n7);
        String expected = classToTest.print(expect);
        assertEquals(expected, actual);
    }

    //TESTING FOR POSTORDER

    @Test
    public void postOrderEmpty() {
        BinaryTree classToTest = new BinaryTree();
        Node node = null;
        List<Node> actual = classToTest.postOrder(node);
        List<Node> expected = new ArrayList<>();

        assertEquals(expected, actual);
    }

    @Test
    public void postOrderShort() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.left = n2;
        n1.right = n3;
        List<Node> test = classToTest.postOrder(n1);
        String actual = classToTest.print(test);

        List<Node> expect = Arrays.asList(n2, n3, n1);
        String expected = classToTest.print(expect);

        assertEquals(expected, actual);
    }

    @Test
    public void postOrderMedium() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        List<Node> test = classToTest.postOrder(n1);
        String actual = classToTest.print(test);

        List<Node> expect = Arrays.asList(n4, n5, n2, n3, n1);
        String expected = classToTest.print(expect);
        assertEquals(expected, actual);
    }
    @Test
    public void postOrderLarge() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
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

        List<Node> test = classToTest.postOrder(n1);

        String actual = classToTest.print(test);
        List<Node> expect = Arrays.asList(n4, n5, n2, n6, n7, n3, n1);
        String expected = classToTest.print(expect);
        assertEquals(expected, actual);
    }

    //TESTING FOR breadthFirstTraversal
    @Test
    public void breadthFirstTraversalShort() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.left = n2;
        n1.right = n3;

        classToTest.breadthFirstTraversal(n1);

        String expected = "1"+"\n"+"2"+"\n"+"3"+"\n";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void breadthFirstTraversalMedium() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        classToTest.breadthFirstTraversal(n1);

        String expected = "1"+"\n"+"2"+"\n"+"3"+"\n"+"4"+"\n"+"5"+"\n";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void breadthFirstTraversalLarge() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
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

        classToTest.breadthFirstTraversal(n1);

        String expected = "1"+"\n"+"2"+"\n"+"3"+"\n"+"4"+"\n"+"5"+"\n"+"6"+"\n"+"7"+"\n";
        assertEquals(expected, outContent.toString());
    }

    //STARTING TEST FOR maxValue Method
    @Test
    public void maxValueShort() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.left = n2;
        n1.right = n3;
        int expected = 3;
        int actual = classToTest.maxValue(n1);

       assertEquals(expected,actual);
    }

    @Test
    public void maxValueMedium() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        int expected = 5;
        int actual = classToTest.maxValue(n1);

        assertEquals(expected,actual);
    }

    @Test
    public void maxValueLarge() {
        BinaryTree classToTest = new BinaryTree();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
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

        int expected = 7;
        int actual = classToTest.maxValue(n1);

        assertEquals(expected,actual);
    }

}