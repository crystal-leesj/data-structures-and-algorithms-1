package BubbleSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSortSortedTest() {
        BubbleSort classToTest = new BubbleSort();
        int[] input = new int[]{1,2,3,33,67};
        int[] expected = {1,2,3,33,67};
        int[] actual = classToTest.bubbleSort(input);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void bubbleSortSmall() {
        BubbleSort classToTest = new BubbleSort();
        int[] input = new int[]{2,1,3,33,67};
        int[] expected = {1,2,3,33,67};
        int[] actual = classToTest.bubbleSort(input);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void bubbleSortMedium() {
        BubbleSort classToTest = new BubbleSort();
        int[] input = new int[]{2,1,33,3,67};
        int[] expected = {1,2,3,33,67};
        int[] actual = classToTest.bubbleSort(input);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void bubbleSortLarge() {
        BubbleSort classToTest = new BubbleSort();
        int[] input = new int[]{67,1,33,3,2};
        int[] expected = {1,2,3,33,67};
        int[] actual = classToTest.bubbleSort(input);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void swap() {
        BubbleSort classToTest = new BubbleSort();
         int[] actual = {2,1};
         int[] expected ={1,2};
         classToTest.swap(actual,0,1);
         assertArrayEquals(expected, actual);
    }

    @Test
    public void isSortedTrue() {
        BubbleSort classToTest = new BubbleSort();
        int[] input= {1,2,3};
        assertTrue(classToTest.isSorted(input));
    }

    @Test
    public void isSortedFalse() {
        BubbleSort classToTest = new BubbleSort();
        int[] input= {2,1,3};
        assertFalse(classToTest.isSorted(input));
    }
}