package treeintersection;

import Tree.BinaryTree;
import Tree.Node;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void treeIntersectionSmall() {
        TreeIntersection classToTest = new TreeIntersection();

        Node tree1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        tree1.left = n2;
        tree1.right = n3;
        n2.left = n4;

        Node tree2 = new Node(1);
        Node n5 = new Node(2);
        Node n6 = new Node(7);
        Node n7 = new Node(4);

        tree2.left = n5;
        tree2.right = n6;
        n5.left = n7;

        Set<Object> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);

        Set<Object> actual = classToTest.treeIntersection(tree1,tree2);
        System.out.println();

        assertEquals(expected,actual);

    }

    @Test
    public void treeIntersectionNoIntersection() {
        TreeIntersection classToTest = new TreeIntersection();

        Node tree1 = new Node(10);
        Node n2 = new Node(22);
        Node n3 = new Node(32);
        Node n4 = new Node(44);
        Node n5 = new Node(55);

        tree1.left = n2;
        tree1.right = n3;
        n2.left = n4;
        n2.right = n5;

        Node tree2 = new Node(1);
        Node n6 = new Node(2);
        Node n7 = new Node(7);
        Node n8 = new Node(4);

        tree2.left = n6;
        tree2.right = n7;
        n6.left = n8;

        Set<Object> expected = new HashSet<>();
        expected.add("No shared values");

        Set<Object> actual = classToTest.treeIntersection(tree1,tree2);
        System.out.println(actual);
        assertEquals(expected,actual);

    }

    @Test
    public void treeIntersectionAllIntersections() {
        TreeIntersection classToTest = new TreeIntersection();

        Node tree1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        tree1.left = n2;
        tree1.right = n3;
        n2.left = n4;

        Node tree2 = new Node(1);
        Node n5 = new Node(2);
        Node n6 = new Node(3);
        Node n7 = new Node(4);

        tree2.left = n5;
        tree2.right = n6;
        n5.left = n7;

        Set<Object> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(3);

        Set<Object> actual = classToTest.treeIntersection(tree1,tree2);
       assertEquals(expected,actual);

    }
}