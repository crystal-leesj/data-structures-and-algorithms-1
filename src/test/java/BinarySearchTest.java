import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        BinarySearch classToTest = new BinarySearch();
        //return m
        int[] nums = {1,2,3};
        int expected = 2;
        assertEquals(expected, BinarySearch.binarySearch(nums, 3));

        //return -1
        int[] nums1 = {1,2,3};
        int expected1 = -1;
        assertEquals(expected1, BinarySearch.binarySearch(nums1, 4));

        //return true
        int[] nums2 = {};
        int expected2 = -1;
        assertEquals(expected2, BinarySearch.binarySearch(nums2,4));

    }

}