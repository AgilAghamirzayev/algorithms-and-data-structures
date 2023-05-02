package pattern_sliding_window;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSumSubarrayOfSizeKTest {

    @Test
    void findMaxSumSubArr() {
        int k = 3;
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int[] arr2 = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] arr3 = {1};
        int[] arr4 = {};
        int[] arr5 = {1, 2, 3, 4, 5};

        int expected1 = 9;
        int expected2 = 7;
        int expected3 = 1;
        int expected4 = Integer.MIN_VALUE;
        int expected5 = 15;

        assertEquals(expected1, MaximumSumSubarrayOfSizeK.findMaxSumSubArr(k, arr1));
        assertEquals(7, MaximumSumSubarrayOfSizeK.findMaxSumSubArr(2, arr1));
        assertEquals(expected2, MaximumSumSubarrayOfSizeK.findMaxSumSubArr(k, arr2));
        assertEquals(expected3, MaximumSumSubarrayOfSizeK.findMaxSumSubArr(k, arr3));
        assertEquals(expected4, MaximumSumSubarrayOfSizeK.findMaxSumSubArr(k, arr4));
        assertEquals(expected5, MaximumSumSubarrayOfSizeK.findMaxSumSubArr(k, arr5));
    }
}