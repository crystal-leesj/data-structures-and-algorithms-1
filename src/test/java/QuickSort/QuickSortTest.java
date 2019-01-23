package QuickSort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSortLargeSmall() {
        QuickSort classToTest = new QuickSort();

        int[] input = {5,4,9};
        int[] expected = {4,5,9};
        int[] actual = classToTest.quickSort(input, 0, input.length);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void quickSortMedium() {
        QuickSort classToTest = new QuickSort();

        int[] input = {5,4,9,10};
        int[] expected = {4,5,9,10};
        int[] actual = classToTest.quickSort(input, 0, input.length);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void quickSortLarge() {
        QuickSort classToTest = new QuickSort();

        int[] input = {2,6,4,1,5};
        int[] expectd = {1,2,4,5,6};
        int[] actual = classToTest.quickSort(input, 0, input.length);
        assertArrayEquals(expectd,actual);
    }


}