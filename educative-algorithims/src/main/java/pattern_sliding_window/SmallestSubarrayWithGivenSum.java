package pattern_sliding_window;

public class SmallestSubarrayWithGivenSum {

    public static void main(String[] args) {
        System.out.println(findMinSubArr(7, new int[]{2, 1, 5, 2, 3, 2}));
        System.out.println(findMinSubArr(7, new int[]{2, 1, 5, 2, 8}));
        System.out.println(findMinSubArr(8, new int[]{3, 4, 1, 1, 6}));
    }

    public static int findMinSubArr(int S, int[] arr) {

        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            while (windowSum >= S) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static int findMinSubArrMySolution(int S, int[] arr) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int len = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                len++;
                if (sum >= S) {
                    answer = Math.min(len, answer);
                    break;
                }
            }
        }

        return answer;
    }
}
