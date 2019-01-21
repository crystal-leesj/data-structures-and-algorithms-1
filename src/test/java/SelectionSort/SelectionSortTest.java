package SelectionSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void selectionSort() {
        SelectionSort classToTest = new SelectionSort();
        int[] input = {2,1,3,4};
        int[] expected = {1,2,3,4};
        int[] actual = classToTest.selectionSort(input);

        assertArrayEquals(expected,actual);
    }
}