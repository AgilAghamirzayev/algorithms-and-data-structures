package recursion;

public class PowerOfN {
    public static void main(String[] args) {
        PowerOfN n = new PowerOfN();
        System.out.println(n.power(2,2));
    }

    public int power(int base, int exp) {
        if (exp < 0) return -1;
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }
}
