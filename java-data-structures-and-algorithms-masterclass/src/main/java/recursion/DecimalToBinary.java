package recursion;

public class DecimalToBinary {

    public static void main(String[] args) {
        DecimalToBinary d = new DecimalToBinary();
        System.out.println(d.decimalToBinary(10));
    }

    public int decimalToBinary(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        return n % 2 + 10 * decimalToBinary(n / 2);
    }
}
