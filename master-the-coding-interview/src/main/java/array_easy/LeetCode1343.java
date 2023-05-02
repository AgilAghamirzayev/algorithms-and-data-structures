package array_easy;

public class LeetCode1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int numOfArray = 0;
        int windowStart = 0;
        int windowSum = 0;

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];

            if(windowEnd >= k - 1) {
                int avg = windowSum / k;
                if(avg >= threshold) numOfArray++;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return numOfArray;
    }
}
