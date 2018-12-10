package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void pushTestShort() {

            Stack stack = new Stack();
            stack.push(5);
            int[] expected = {5};
            int[] act = stack.toArray();
            assertArrayEquals(expected,act);
    }

    @Test
    public void pushTestMedium() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        int[] expected = {3,4,5};
        int[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void pushTestLarge() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        int[] expected = {1,2,3,4,5};
        int[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }

    //TESTING FOR POP METHOD
    @Test
    public void popTestShort() {

        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.pop();
        int[] expected = {4,5};
        int[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }
    @Test
    public void popTestMedium() {

        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.pop();
        int[] expected = {3,4,5};
        int[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void popTestLarge() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();
        int[] expected = {2,3,4,5};
        int[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }
    //TESTING FOR PEEK METHOD
    @Test
    public void peekTestShort() {

        Stack stack = new Stack();

//        stack.push(5);
//        stack.push(4);
        stack.peek();
        int[] expected = {};
        int[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void peekTestMedium() {

        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.peek();
        int[] expected = {3,4,5};
        int[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }
    @Test
    public void peekTestLarge() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.peek();
        int[] expected = {1,2,3,4,5};
        int[] act = stack.toArray();
        assertArrayEquals(expected,act);
    }
}