package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void pushTestShort() {

            Stack <Integer> stack = new Stack<>();
            stack.push(5);
            Integer[] expected = {5};
            Object[] act = stack.toArray();
            assertArrayEquals(expected,act);
    }

    @Test
    public void pushTestMedium() {
        Stack <Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        Integer[] expected = {3,4,5};
        Object[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void pushTestLarge() {
        Stack <Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        Integer[] expected = {1,2,3,4,5};
        Object[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }

    //TESTING FOR POP METHOD
    @Test
    public void popTestShort() {
        Stack <Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.pop();
        Integer[] expected = {4,5};
        Object[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }
    @Test
    public void popTestMedium() {

        Stack <Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.pop();
        Integer[] expected = {3,4,5};
        Object[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void popTestLarge() {
        Stack <Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();
        Integer[] expected = {2,3,4,5};
        Object[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }
    //TESTING FOR PEEK METHOD
    @Test
    public void peekTestShort() {
        Stack <Integer> stack = new Stack<>();


//        stack.push(5);
//        stack.push(4);
        stack.peek();
        Integer[] expected = {};
        Object[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void peekTestMedium() {
        Stack <Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.peek();
        Integer[] expected = {3,4,5};
        Object[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }
    @Test
    public void peekTestLarge() {
        Stack <Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.peek();
        Integer[] expected = {1,2,3,4,5};
        Object[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }
}