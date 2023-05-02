package pattern_sliding_window;

import java.util.Arrays;

public class MinimumWindowSort {

    public static void main(String[] args) {
        System.out.println(sort(new int[]{1, 2, 5, 3, 7, 10, 9, 12}));
        System.out.println(sort(new int[]{1, 3, 2, 0, -1, 7, 10}));
        System.out.println(sort(new int[]{1, 2, 3}));
        System.out.println(sort(new int[]{3, 2, 1}));
    }

    public static int sort(int[] arr) {

        int windowEnd = arr.length - 1;
        int windowStart = 0;

        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        for (int i = 0; i < arr.length; i++) {
            if (sortedArr[windowStart] == arr[windowStart]) windowStart++;
            if (sortedArr[windowEnd] == arr[windowEnd]) windowEnd--;
        }

        return Math.max(windowEnd - windowStart + 1, 0);
    }

}
