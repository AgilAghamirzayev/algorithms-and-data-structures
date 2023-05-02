package pattern_sliding_window;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationInAString {


    public static boolean findPermutation(String str, String pattern) {
        int windowStart = 0;
        int matched = 0;
        Map<Character, Integer> charToCount = new HashMap<>();

        for (char chr : pattern.toCharArray()) {
            charToCount.put(chr, charToCount.getOrDefault(chr, 0) + 1);
        }

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charToCount.containsKey(rightChar)) {
                charToCount.put(rightChar, charToCount.get(rightChar) - 1);
                if (charToCount.get(rightChar) == 0) matched++;
            }

            if (matched == charToCount.size()) return true;

            if (windowEnd >= pattern.length() - 1) {
                char leftChar = str.charAt(windowStart++);
                if (charToCount.containsKey(leftChar)) {
                    if (charToCount.get(leftChar) == 0) {
                        matched--;
                    }
                    charToCount.put(leftChar, charToCount.get(leftChar) + 1);
                }
            }
        }

        return false;
    }


    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int windowStart = 0;
        int[] windowS1 = new int[26];
        int[] windowS2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            windowS1[s1.charAt(i) - 'a']++;
        }

        for (int windowEnd = 0; windowEnd < s2.length(); windowEnd++) {
            windowS2[s2.charAt(windowEnd) - 'a']++;
            if (windowEnd >= s1.length()) {
                windowS2[s2.charAt(windowStart) - 'a']--;
                windowStart++;
            }
            if (Arrays.equals(windowS1, windowS2)) return true;
        }

        return false;
    }
}
