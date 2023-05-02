package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(bubbleSort(ints)));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int times = 1; times < arr.length; times++) {
            boolean swapped = false;
            for (int j = 0; j <= arr.length - times - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }
}
