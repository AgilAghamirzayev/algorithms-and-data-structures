package strings;

import java.util.Arrays;

public class LeetCode567 {
    public static void main(String[] args) {
        LeetCode567 l = new LeetCode567();

        System.out.println(l.checkInclusion("adc", "dcda"));
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
