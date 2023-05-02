package strings;

import java.util.Arrays;

public class ValidAnagram {


    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[256];

        for (char ch : s.toCharArray()) count[ch]++;
        for (char ch : t.toCharArray()) count[ch]--;
        for (int index: count) if (index != 0) return false;

        return true;
    }

    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for (int i = 0; i < s.length(); i++) {
            if (sArray[i] != tArray[i]) return false;
        }

        return true;
    }
}
