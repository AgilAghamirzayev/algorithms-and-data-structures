package sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] ints = {1, 8, 5, 4, 1, 9, 3};

        Arrays.sort(ints);
        System.out.println(Arrays.toString(countingSort(ints)));
    }

    public static int[] countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int k : arr) {
            max = Math.max(k, max);
        }

        int[] frequency = new int[Math.abs(max) + 1];

        for (int j : arr) {
            frequency[j] += 1;
        }


        for (int i = 0, count = 0; i < frequency.length; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                arr[count] = i;
                count++;
            }
        }

        return arr;
    }
}
