package recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        System.out.println(sumOfDigits.sumOfDigits(6));
        System.out.println(sumOfDigits.sumOfDigits(111));
        System.out.println(sumOfDigits.sumOfDigits(10));
        System.out.println(sumOfDigits.sumOfDigits(6012));
    }


    public int sumOfDigits(int n) {
        if (n < 0) return 0;
        if (n < 10) return n;
        return n % 10 + sumOfDigits(n / 10);
    }
}
