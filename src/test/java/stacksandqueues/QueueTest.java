package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void enqueueTestShort() {
        Queue queue = new Queue();
        queue.enqueue(5);
        int[] expected = {5};
        int[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void enqueueTestMedium() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        int[] expected = {5,4,3};
        int[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }
    @Test
    public void enqueueTestLarge() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        int[] expected = {5,4,3,2,1};
        int[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }


//TESTING FOR DEQUEUE METHOD
    @Test
    public void dequeueTestEmpty() {
        Queue queue = new Queue();
        queue.dequeue();
        int[] expected = {};
        int[] act = queue.toArray();

        assertArrayEquals(expected,act);

    }

    @Test
    public void dequeueTestShort() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.dequeue();
        int[] expected = {4};
        int[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void dequeueTestMedium() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.dequeue();
        int[] expected = {4,3};
        int[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void dequeueTestLarge() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.dequeue();
        int[] expected = {4,3,2,1};
        int[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }
    //STARTING PEEK METHOD TEST

    @Test
    public void peekTestShort() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.peek();
        int[] expected = {5,4};
        int[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void peekTestMedium() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.peek();
        int[] expected = {5,4,3};
        int[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }

    @Test
    public void peekTestLarge() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.peek();
        int[] expected = {5,4,3,2};
        int[] act = queue.toArray();
        assertArrayEquals(expected,act);
    }
}