package pattern_sliding_window;

public class LongestSubarrayWithOnes {

//[0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1]

    public static void main(String[] args) {
        System.out.println(findLength(new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1}, 3));
        System.out.println(findLength(new int[]{0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1}, 2));
        System.out.println(findLength(new int[]{0, 0, 1, 1, 0, 0, 0}, 2));
    }

    public static int findLength(int[] arr, int k) {
        int windowStart = 0;
        int maxOnesCount = 0;
        int maxLength = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            if (arr[windowEnd] == 1) maxOnesCount++;
            if (windowEnd - windowStart + 1 - maxOnesCount > k) {
                if (arr[windowStart] == 1) maxOnesCount--;
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

    public static int findLengthV2(int[] arr, int k) {
        int[] count = new int[2];
        int windowStart = 0;
        int maxLength = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            count[arr[windowEnd]]++;

            if (windowEnd - windowStart + 1 - count[1] > k) {
                count[arr[windowStart]]--;
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
