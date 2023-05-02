package pattern_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithSameLetters {

    //abcccddeedd

    public static void main(String[] args) {
        System.out.println(findLength("abcccdddcccddd", 3));
        System.out.println(findLength("abcccddeedd", 2));
        System.out.println(findLength("aabccbb", 2));
        System.out.println(findLength("abbcb", 1));
        System.out.println(findLength("abccde", 1));
    }

    public static int findLength(String str, int k) {
        Map<Character, Integer> charToCount = new HashMap<>();
        int maxRepeatLetterCount = 0;
        int windowStart = 0;
        int maxLength = 0;

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            charToCount.put(rightChar, charToCount.getOrDefault(rightChar, 0) + 1);
            maxRepeatLetterCount = Math.max(maxRepeatLetterCount, charToCount.get(rightChar));

            if (windowEnd - windowStart + 1 - maxRepeatLetterCount > k) {
                char leftChar = str.charAt(windowStart);
                charToCount.put(leftChar, charToCount.get(leftChar) - 1);
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

        }

        return maxLength;
    }


    public static int findLengthV2(String str, int k) {
        Map<Character, Integer> charToCount = new HashMap<>();
        int windowStart = 0;
        int maxLength = 0;

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char end = str.charAt(windowEnd);
            if (charToCount.size() == 2) {

                if (!charToCount.containsKey(end)) {
                    while (charToCount.size() == 2) {
                        char start = str.charAt(windowStart);
                        charToCount.put(start, charToCount.get(start) - 1);
                        if (charToCount.get(start) == 0) charToCount.remove(start);
                        windowStart++;
                    }
                }
            }

            charToCount.put(end, charToCount.getOrDefault(end, 0) + 1);
            int first = (int) charToCount.values().toArray()[0];

            if (charToCount.size() == 2) {
                int second = (int) charToCount.values().toArray()[1];
                if (Math.min(first, second) <= k) {
                    maxLength = Math.max(maxLength, first + second);
                }
            } else maxLength = first;

        }

        return maxLength;
    }
}
