package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueueShortTest() {
        PseudoQueue pq = new PseudoQueue();
        pq.enqueue(5);
        pq.enqueue(20);

        Object[] actual = pq.toArray();

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(20);

        Object[] expected = queue.toArray();

        assertArrayEquals(expected,actual);
    }

    @Test
    public void enqueueMediumTest() {
        PseudoQueue pq = new PseudoQueue();
        pq.enqueue(5);
        pq.enqueue(20);
        pq.enqueue(20);
        pq.enqueue(50);
        pq.enqueue(20);

        Object[] actual= pq.toArray();

        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(20);
        queue.enqueue(20);
        queue.enqueue(50);
        queue.enqueue(20);
        Object[] expected= queue.toArray();

        assertArrayEquals(expected,actual);
    }
    @Test
    public void enqueueLargeTest() {
        PseudoQueue pq = new PseudoQueue();
        pq.enqueue(5);
        pq.enqueue(20);
        pq.enqueue(20);
        pq.enqueue(50);
        pq.enqueue(20);
        pq.enqueue(60);
        pq.enqueue(50);
        pq.enqueue(20);

        Object[] actual= pq.toArray();

        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(20);
        queue.enqueue(20);
        queue.enqueue(50);
        queue.enqueue(20);
        queue.enqueue(60);
        queue.enqueue(50);
        queue.enqueue(20);

        Object[] expected = queue.toArray();

        assertArrayEquals(expected, actual);
    }
    //TESTING FOR DEQUEUE
    @Test
    public void dequeueShortTest() {
            PseudoQueue pq = new PseudoQueue();
            pq.enqueue(5);
            pq.enqueue(20);

            Object[] actual= pq.toArray();

            Queue queue = new Queue();
            queue.enqueue(5);
            queue.enqueue(20);

            Object[] expected= queue.toArray();

            assertArrayEquals(expected, actual);
    }
    @Test
    public void dequeueMediumTest() {
        PseudoQueue pq = new PseudoQueue();
        pq.enqueue(5);
        pq.enqueue(20);
        pq.enqueue(20);
        pq.enqueue(25);

        Object[] actual= pq.toArray();

        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(20);
        queue.enqueue(20);
        queue.enqueue(25);

        Object[] expected= queue.toArray();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void dequeueLargeTest() {
        PseudoQueue pq = new PseudoQueue();
        pq.enqueue(5);
        pq.enqueue(20);
        pq.enqueue(20);
        pq.enqueue(25);
        pq.enqueue(20);
        pq.enqueue(30);
        pq.enqueue(65);

        Object[] actual= pq.toArray();

        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(20);
        queue.enqueue(20);
        queue.enqueue(25);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(65);

        Object[] expected= queue.toArray();

        assertArrayEquals(expected, actual);
    }
}

