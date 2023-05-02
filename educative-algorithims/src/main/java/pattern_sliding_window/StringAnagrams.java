package pattern_sliding_window;

import java.util.*;

public class StringAnagrams {

    public static void main(String[] args) {
        System.out.println(findStringAnagrams("ppqp", "pq"));
        System.out.println(findStringAnagrams("abbcabc", "abc"));
    }


    public static List<Integer> findStringAnagrams(String str, String pattern) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        int windowStart = 0;
        int matched = 0;

        for (char chr : pattern.toCharArray()) {
            charFrequencyMap.put(chr, charFrequencyMap.getOrDefault(chr, 0) + 1);
        }

        List<Integer> resultIndicates = new ArrayList<>();

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);

            if (charFrequencyMap.containsKey(rightChar)) {
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if (charFrequencyMap.get(rightChar) == 0) matched++;
            }

            if (matched == charFrequencyMap.size()) resultIndicates.add(windowStart);

            if (windowEnd >= pattern.length() - 1) {
                char leftChar = str.charAt(windowStart++);
                if (charFrequencyMap.containsKey(leftChar)) {
                    if (charFrequencyMap.get(leftChar) == 0) matched--;
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
            }
        }

        return resultIndicates;
    }


    public static List<Integer> findStringAnagramsV1(String str, String pattern) {
        List<Integer> resultIndicates = new ArrayList<>();
        int windowStart = 0;
        int[] charCountS = new int[26];
        int[] charCountP = new int[26];

        for (char c : pattern.toCharArray()) {
            charCountP[c - 'a']++;
        }

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            charCountS[rightChar - 'a']++;

            if (windowEnd - windowStart + 1 == pattern.length()) {
                if (Arrays.equals(charCountP, charCountS)) {
                    resultIndicates.add(windowStart);
                }
                charCountS[str.charAt(windowStart) - 'a']--;
                windowStart++;
            }
        }

        return resultIndicates;
    }
}
