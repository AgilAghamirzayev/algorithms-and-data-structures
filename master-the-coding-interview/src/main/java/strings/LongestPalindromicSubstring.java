package strings;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String c = "avvva".substring(0,1);
        System.out.println(c);
        System.out.println(isPalindrome("aabbaa"));
        System.out.println(isPalindrome("aabba"));
        System.out.println(isPalindrome("aacbcaa"));
        System.out.println(isPalindrome("cb"));
        System.out.println(isPalindrome("bb"));
    }


    private static boolean isPalindrome(String s) {
        int r = s.length() - 1;
        int l = 0;

        while(r >= s.length() / 2) {
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
