package pattern_sliding_window;

public class AverageOfSubarrayOfSizeK {


    // first approach TC: O(N*K)
    public double[] findAverages(int K, int[] arr) {
        double[] result = new double[arr.length - K + 1];

        for (int i = 0; i < arr.length - K; i++) {
            double sum = 0;
            for (int j = i; j < i + K; j++) {
                sum += arr[j];
            }
            result[i] = sum / K;
        }

        return result;
    }

    // second approach  Sliding Window // O(n)

    public double[] findAverage2(int K, int[] arr) {
        double[] result = new double[arr.length - K + 1];
        double windowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];

            if (windowEnd >= K - 1) {
                result[windowStart] = windowSum / K;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return result;
    }


}
