package InsertionSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void insertionSortSmall() {
        InsertionSort classToTest = new InsertionSort();
        int[] input = {2,24,3,44,5};
        int[] expected = {2,3,5,24,44};
        assertArrayEquals(expected,classToTest.insertionSort(input));
    }
    @Test
    public void insertionSortMedium() {
        InsertionSort classToTest = new InsertionSort();
        int[] input = {2,24,3,44,5,45,67,99};
        int[] expected = {2,3,5,24,44,45,67,99};
        assertArrayEquals(expected,classToTest.insertionSort(input));
    }

    @Test
    public void insertionSortLarge() {
        InsertionSort classToTest = new InsertionSort();
        int[] input = {2,24,3,44,5,45,67,99,6,36,22,400};
        int[] expected = {2,3,5,6,22,24,36,44,45,67,99,400};
        assertArrayEquals(expected,classToTest.insertionSort(input));
    }
}