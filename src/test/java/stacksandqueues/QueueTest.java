package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void enqueueTestShort() {
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(5);
        Integer[] expected = {5};
        Object[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void enqueueTestMedium() {
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        Integer[] expected = {5,4,3};
        Object[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }
    @Test
    public void enqueueTestLarge() {
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        Integer[] expected = {5,4,3,2,1};
        Object[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }


//TESTING FOR DEQUEUE METHOD
    @Test
    public void dequeueTestEmpty() {
        Queue <Integer> queue = new Queue<>();
        queue.dequeue();
        Integer[] expected = {};
        Object[] act = queue.toArray();

        assertArrayEquals(expected,act);

    }

    @Test
    public void dequeueTestShort() {
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.dequeue();
        Integer[] expected = {4};
        Object[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void dequeueTestMedium() {
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.dequeue();
        Integer[] expected = {4,3};
        Object[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void dequeueTestLarge() {
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.dequeue();
        Integer[] expected = {4,3,2,1};
        Object[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }
    //STARTING PEEK METHOD TEST

    @Test
    public void peekTestShort() {
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.peek();
        Integer[] expected = {5,4};
        Object[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void peekTestMedium() {
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.peek();
        Integer[] expected = {5,4,3};
        Object[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void peekTestLarge() {
        Queue <Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.peek();
        Integer[] expected = {5,4,3,2};
        Object[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }
}