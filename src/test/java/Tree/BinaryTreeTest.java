package Tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {

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
}