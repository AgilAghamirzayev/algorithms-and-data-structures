package math;

public class UglyNumber {

    public static void main(String[] args) {
        System.out.println(isUgly(1));
        System.out.println(isUgly(6));
        System.out.println(isUgly(14));
        System.out.println(isUgly(13));
    }

    public static boolean isUgly(int num) {
        while (num > 1) {
            int flag = num;
            if (num % 2 == 0) num = num / 2;
            if (num % 3 == 0) num = num / 3;
            if (num % 5 == 0) num = num / 5;
            if (num == flag) return false;
        }
        return true;
    }
}
