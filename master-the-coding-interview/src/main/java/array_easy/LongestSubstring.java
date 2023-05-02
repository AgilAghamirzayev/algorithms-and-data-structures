package array_easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring2("dvdfdgrhr"));
    }


    public static int lengthOfLongestSubstring2(String s) {
        final int n = s.length();
        int len = 0;
        int[] repeat = new int[128];
        for (int c, j = 0, i = 0; j < n; j++) {
            c = s.charAt(j);
            i = Math.max(repeat[c], i);
            len = Math.max(len, j - i + 1);
            repeat[c] = j + 1;
        }
        return len;
    }

    public static int lengthOfLongestSubstring1(String s) {
        int maxLen = 0;
        Set<Character> window = new HashSet<>();

        int left = 0;
        int right = 0;

        while (right < s.length()) {
            while (window.contains(s.charAt(right)))
                window.remove(s.charAt(left++));

            window.add(s.charAt(right++));
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }

    public static int lengthOfLongestSubstring(String s) {
        List<Character> subString = new ArrayList<>();
        int longestSubstringLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (subString.contains(s.charAt(i))) {
                longestSubstringLen = Math.max(subString.size(), longestSubstringLen);
                subString.removeAll(subString.subList(0, subString.indexOf(s.charAt(i)) + 1));
            }

            subString.add(s.charAt(i));
        }

        longestSubstringLen = Math.max(subString.size(), longestSubstringLen);

        return longestSubstringLen;
    }
}
