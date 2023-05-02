package ingress;

import java.util.*;

public class Solution2 {



    public static void main(String[] args) {
        longestIncreasingSubsequence(Arrays.asList(2,4,3,7,1,5));
    }

    public static int longestIncreasingSubsequence(List<Integer> arr) {
        int n = arr.size();
        int[] subsequence = new int[n];
        int len = 0;

        for (int num : arr) {
            int index = Arrays.binarySearch(subsequence, 0, len, num);
            if (index < 0) index = -(index + 1);

            subsequence[index] = num;

            if (index == len) len++;
        }

        return len;
    }


    public static int longestIncreasingSubsequenceV1(List<Integer> arr) {
        int n = arr.size();
        int[] lis = new int[n];

        Arrays.fill(lis, 1);

        int maxLis = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
            maxLis = Math.max(maxLis, lis[i]);//
        }
        return maxLis;
    }

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> freq = new HashMap<>();

        for (int j : arr) {
            freq.put(j, freq.getOrDefault(j, 0) + 1);
        }

        int maxFreq = Collections.max(freq.values());

        return arr.size() - maxFreq;
    }

    static int equalizeArray(int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int j : arr) {
            freq.put(j, freq.getOrDefault(j, 0) + 1);
        }

        int maxFreq = Collections.max(freq.values());

        return arr.length - maxFreq;
    }
}

