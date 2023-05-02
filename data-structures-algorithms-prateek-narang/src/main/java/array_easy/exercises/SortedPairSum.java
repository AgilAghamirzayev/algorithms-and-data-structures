package array_easy.exercises;

import java.util.Arrays;

public class SortedPairSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(closestSum(new int[]{10, 22, 28, 29, 30, 40}, 54)));
    }


    public static int[] closestSum(int[] arr, int key) {
        int min = Integer.MAX_VALUE;
        int[] result = new int[2];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                int twoSum = Math.abs(arr[i] + arr[j] - key);
                if (twoSum < min) {
                    min = twoSum;
                    result = new int[]{arr[i], arr[j]};
                }
            }
        }
        return result;

    }
}
