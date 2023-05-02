package pattern_sliding_window;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {

    public static void main(String[] args) {
        System.out.println(findLength(new char[]{'A', 'B', 'C', 'A', 'C'}));
        System.out.println(findLength(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}));
    }


    public static int findLength(char[] arr) {
        Map<Character, Integer> charToInt = new HashMap<>();
        int maxLength = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            charToInt.put(arr[windowEnd], charToInt.getOrDefault(arr[windowEnd], 0) + 1);

            while (charToInt.size() > 2) {
                charToInt.put(arr[windowStart], charToInt.getOrDefault(arr[windowStart], 0) -1);
                if (charToInt.get(arr[windowStart]) == 0) {
                    charToInt.remove(arr[windowStart]);
                }
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }


        return maxLength;
    }
}
