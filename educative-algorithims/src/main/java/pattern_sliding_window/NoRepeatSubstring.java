package pattern_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring {

    public static void main(String[] args) {

        String s1 = "a";
        String s2 = new String("a");
        String s3 = new String("a");
        String s4 = "a";

//        System.out.println(s1.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s4);

//        System.out.println(findLength("aabccbb"));
//        System.out.println(findLength("abbbb"));
//        System.out.println(findLength("abccde"));
    }

//aabccbb


    public static int findLength(String str) {
        Map<Character, Integer> charToCount = new HashMap<>();
        int windowStart = 0;
        int maxLength = 0;

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char end = str.charAt(windowEnd);
            if (charToCount.containsKey(end)) {
                windowStart = Math.max(windowStart, charToCount.get(end) + 1);
            }
            charToCount.put(end, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }

    public static int findLengthV1(String str) {
        Map<Character, Integer> charToCount = new HashMap<>();
        int windowStart = 0;
        int maxLength = 0;

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char end = str.charAt(windowEnd);
            charToCount.put(end, charToCount.getOrDefault(end, 0) + 1);

            while (charToCount.get(end) > 1) {
                char start = str.charAt(windowStart);
                charToCount.put(start, charToCount.get(start) - 1);
                if (charToCount.get(start) == 0) charToCount.remove(start);
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }


        return maxLength;
    }
}
