package recursion;

public class GCD {
    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.gcd(8,16));
        System.out.println(gcd.gcdV2(8,16));
        System.out.println(gcd.lmc(8,16));


        System.out.println(gcd.gcd(324330,123141330));
        System.out.println(gcd.gcdV2(324330,123141330));
        System.out.println(gcd.lmc(3133,1313));
    }

    public int gcd(int a, int b) {
        if (a < 0 || b < 0) return -1;
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int gcdV2(int a, int b) {
        if (a < 0 || b < 0) return  -1;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lmc(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
}
