package recursion;

public class ThePowerSum {

    public static void main(String[] args) {
        System.out.println(powerSum(1000, 2));
    }

    public static int powerSum(int X, int N) {
        return helper(X, N, 1);
    }

    private static int helper(int total, int power, int num) {
        int val = (int) (total - Math.pow(num, power));
        if (val == 0) return 1;
        if (val < 0) return 0;
        return helper(val, power, num + 1) + helper(total, power, num + 1);
    }

}
