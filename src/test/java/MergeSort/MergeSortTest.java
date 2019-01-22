package MergeSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSortSmall() {
        MergeSort classToTest = new MergeSort();
        int[] input = {1,3,2,4};
        int[] expected = {1,2,3,4};
        int[] actual = classToTest.mergeSort(input);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void mergeSortMedium() {
        MergeSort classToTest = new MergeSort();
        int[] input = {1,3,2,4,100,45};
        int[] expected = {1,2,3,4,45,100};
        int[] actual = classToTest.mergeSort(input);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void mergeSortLarge() {
        MergeSort classToTest = new MergeSort();
        int[] input = {1,3,2,4,100,45,300,23};
        int[] expected = {1,2,3,4,23,45,100,300};
        int[] actual = classToTest.mergeSort(input);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void merge() {
        MergeSort classToTest = new MergeSort();
        int[] a = {};
        int[] b = {1,2};
        int[] actual =classToTest.merge(a,b);
        int[] expected = {1,2};
        assertArrayEquals(actual,expected);
    }

    @Test
    public void splitLeft() {
        MergeSort classToTest = new MergeSort();
        int[] input = {1,4,3,5,6};
        int[] expected = {1,4};
        int[] actual = classToTest.splitLeft(input);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void splitRight() {
        MergeSort classToTest = new MergeSort();
        int[] input = {1,4,3,5,6};
        int[] expected = {3,5,6};
        int[] actual = classToTest.splitRight(input);
        assertArrayEquals(expected,actual);
    }
}