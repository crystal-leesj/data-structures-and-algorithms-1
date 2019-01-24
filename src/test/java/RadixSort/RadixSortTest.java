package RadixSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class RadixSortTest {

    @Test
    public void radixSortSmall() {
        RadixSort classToTest = new RadixSort();
        int[] input = {170, 45, 75, 90};
        int n = input.length;
        int[] actual = {45,75 ,90 ,170};
        int [] expected = classToTest.radixSort(input);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void radixSortMedium() {
        RadixSort classToTest = new RadixSort();
        int[] input = {170, 45, 75, 90, 802};
        int n = input.length;
        int[] actual = {45,75 ,90 ,170, 802};
        int [] expected = classToTest.radixSort(input);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void radixSortLarge() {
        RadixSort classToTest = new RadixSort();
        int[] input = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = input.length;
        int[] actual = {2, 24 ,45, 66 ,75 ,90 ,170, 802};
        int [] expected = classToTest.radixSort(input);
        assertArrayEquals(expected,actual);
    }
}