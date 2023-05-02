package strings;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int[] chars = new int[26];
        int count = 0;

        for(char c: text1.toCharArray()) {
            chars[c - 'a']  = 1;
        }

        for(char c: text2.toCharArray()) {
            if(chars[c - 'a'] > 0) {
                count++;
            }
        }
        return count;
    }
}
