package array_easy;

public class SubArrays {
    public static void main(String[] args) {
        int[] ints = {-5, -2, -4, 9, -5, 13, -14, 6, 7};
        largestSubarraySum2(ints);
    }

    // Kadane's Algorithm O(N)
    public static int largestSubarraySum3(int[] array) {
        int currentSum = 0;
        int largestSum = 0;


        for (int num : array) {
            currentSum += num;
            if (currentSum < 0) currentSum = 0;
            largestSum = Math.max(largestSum, currentSum);
        }

        return largestSum;
    }

    // Prefix Sum Approach O(N^2)
    public static int largestSubarraySum2(int[] array) {
        int[] prefix = new int[array.length];
        prefix[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }

        int largestSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int subArraySum = i > 0 ? prefix[j] - prefix[i - 1] : prefix[j];
                largestSum = Math.max(largestSum, subArraySum);
            }
        }

        return largestSum;
    }


    // Brute Force Approach O(N^3)
    public static int largestSubarraySum1(int[] array) {
        int largestSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int subArraySum = 0;
                for (int k = i; k <= j; k++) {
                    subArraySum += array[k];
                }
                largestSum = Math.max(largestSum, subArraySum);
            }
        }

        return largestSum;
    }

    public static void printSubArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + ",");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
