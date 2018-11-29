import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void arrayShift() {
        ArrayShift classToTest = new ArrayShift();
        int[] nums = {1,2,3,4,6};
        int[] expected = {1,2,3,5,4,6};
        assertArrayEquals(expected,classToTest.arrayShift(nums,5));

        int[] nums2 = {1,2,3,4,7,8,9};
        int[] expected2 = {1,2,3,4,5,7,8,9};
        assertArrayEquals(expected2,classToTest.arrayShift(nums2,5));


        assertEquals(nums.length+1, classToTest.arrayShift(nums,5).length);

    }
}