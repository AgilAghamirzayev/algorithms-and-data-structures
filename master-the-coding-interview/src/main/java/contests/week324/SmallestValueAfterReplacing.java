package contests.week324;

public class SmallestValueAfterReplacing {

    public static void main(String[] args) {
        System.out.println(smallestValue(15));
    }

    public static int smallestValue(int n) {
        while (n != findFactors(n)) {
            n = findFactors(n);
        }
        return n;
    }

    public static int findFactors(int n) {
        int c = 2;
        long sum = 0;

        while (n > 1) {
            if (n % c == 0) {
                sum += c;
                n /= c;
            } else {
                c++;
            }
        }
        return (int) sum;
    }

}
