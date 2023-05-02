package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] ints = {1, 8, 5, 4, 1, 9};
        int[] mergesort = mergesort(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(mergesort));
    }

    public static int[] mergesort(int[] input) {

        int n = input.length;

        if (n < 2)
            return input;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = input[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = input[i];
        }



        return mergesort(input);
    }
}
