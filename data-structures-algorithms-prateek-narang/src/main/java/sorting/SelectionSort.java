package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ints = {1, 8, 5, 4, 1, 9, 3};

        Arrays.sort(ints);
        System.out.println(Arrays.toString(selectionSort(ints)));
    }

    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = 0;
            int min = Integer.MAX_VALUE;

            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        return arr;
    }
}
