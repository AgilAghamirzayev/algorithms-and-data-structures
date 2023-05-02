package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        long f = fibonacci.fibonacci(50);
        System.out.println(f);
    }

    public long fibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
