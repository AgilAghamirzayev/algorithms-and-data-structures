package pattern_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKDistinct {

    public static void main(String[] args) {
        System.out.println(findLength("araaci", 2));
        System.out.println(findLength("araaci", 1));
        System.out.println(findLength("cbbebi", 3));
    }


    public static int findLength(String str, int k) {

        if (str == null || str.length() == 0 || str.length() < k)
            throw new IllegalArgumentException();

        Map<Character, Integer> charsToCount = new HashMap<>();
        int maxLength = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            charsToCount.put(rightChar, charsToCount.getOrDefault(rightChar, 0) + 1);
            while (charsToCount.size() > k) {
                char leftChar = str.charAt(windowStart);
                charsToCount.put(leftChar, charsToCount.get(leftChar) - 1);
                if (charsToCount.get(leftChar) == 0) {
                    charsToCount.remove(leftChar);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
