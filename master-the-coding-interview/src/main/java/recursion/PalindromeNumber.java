package recursion;

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        boolean palindrome = p.isPalindrome(122);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(int x) {
        return x == helper(x, 0);
    }

    private int helper(int x, int temp) {
        if (x <= 0) return temp;
        return helper(x / 10, (temp * 10) + (x % 10));
    }
}
