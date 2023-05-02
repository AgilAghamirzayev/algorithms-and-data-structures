package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] ints = {1, 8, 5, 4, 1, 9};
        System.out.println(Arrays.toString(insertionSort(ints)));
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i;
            while (curr < arr[prev - 1]) {
                arr[prev] = arr[prev - 1];
                prev--;
            }
            arr[prev] = curr;
        }
        return arr;
    }
}
