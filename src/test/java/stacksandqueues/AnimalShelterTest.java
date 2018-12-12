package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void enqueueTestShort() {

        AnimalShelter pq = new AnimalShelter();
        pq.enqueue("cat");
        pq.enqueue("dog");

        Object[] actual = pq.toArray();

        Object[] expected = {"cat","dog"};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void enqueueTestMedium() {

        AnimalShelter pq = new AnimalShelter();
        pq.enqueue("cat");
        pq.enqueue("dog");
        pq.enqueue("lion");
        pq.enqueue("dog");

        Object[] actual = pq.toArray();

        Object[] expected = {"cat","dog","lion","dog"};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void enqueueTestLarge() {

        AnimalShelter pq = new AnimalShelter();
        pq.enqueue("cat");
        pq.enqueue("dog");
        pq.enqueue("lion");
        pq.enqueue("dog");
        pq.enqueue("lion");
        pq.enqueue("dog");

        Object[] actual = pq.toArray();

        Object[] expected = {"cat","dog","lion","dog","lion","dog"};

        assertArrayEquals(expected,actual);
    }
    //TESTING FOR DEQueue
    @Test
    public void dequeueTestShort() {

        AnimalShelter pq = new AnimalShelter();
        pq.enqueue("cat");
        pq.enqueue("dog");
        pq.dequeue("cat");

        Object[] actual = pq.toArray();

        Object[] expected = {"cat"};

        assertArrayEquals(expected,actual);
    }
}