package recursion;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        long result = factorial.factorial(11998);
        System.out.println(result);
    }

    public long factorial(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
