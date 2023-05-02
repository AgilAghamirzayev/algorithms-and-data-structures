package pattern_sliding_window;

public class MaximumSumSubarrayOfSizeK {

    public static void main(String[] args) {
        int maxSumSubArr = findMaxSumSubArr(1, new int[]{2, 3, 4, 1, 5});
        System.out.println(maxSumSubArr);
    }

    public static int findMaxSumSubArr(int k, int[] arr) {
        int result = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            maxSum += arr[i];
            if (i >= k - 1) {
                result = Math.max(result, maxSum);
                maxSum -= arr[i - k + 1];
            }
        }

        return result;
    }

    public static int findMaxSumSubArrV2(int k, int[] arr) {
        int windowSum = 0;
        int maxSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return maxSum;
    }
}
