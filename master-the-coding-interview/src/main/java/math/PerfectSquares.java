package math;

public class PerfectSquares {
    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }

    //1 11 111
    // 12 = 4+4+4
    // 13 = 9 + 4
    // 43 = 25 + 9 + 9
    public static int numSquares(int n) {
        if (n < 4) return n;

        int ans = n;

        for (int i = 1; i * i <= n ; i++) {
            int square = i * i;
            ans = Math.min(ans, 1 + numSquares(n - square));
        }

        return ans;
    }
}
