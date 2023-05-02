package strings;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1876 {

    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("wbwqjjyqrcbmfzvqjmlg"));
    }

    public static int countGoodSubstrings(String s) {
        Map<Character, Integer> charToCount = new HashMap<>();
        int windowStart = 0;
        int numOfGoodSubStr = 0;

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            charToCount.put(s.charAt(windowEnd), charToCount.getOrDefault(s.charAt(windowEnd), 0) + 1);
            if (windowEnd >= 3 - 1) {
                if (charToCount.size() == 3) numOfGoodSubStr++;
                if (charToCount.get(s.charAt(windowStart)) == 1) {
                    charToCount.remove(s.charAt(windowStart));
                } else {
                    charToCount.put(s.charAt(windowStart), charToCount.get(s.charAt(windowStart)) - 1);
                }
                windowStart++;
            }
        }

        return numOfGoodSubStr;
    }
}
