package array_easy.exercises;

public class MaximumSubarraySum {
    public static void main(String[] args) {


    }

    public static int maxSumSubarray(int[] arr) {


        boolean f = true;
        int rr = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > 0) {
                f = false;
                break;
            }
            if (x > rr) rr = x;
        }

        if (f) return rr;


        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
