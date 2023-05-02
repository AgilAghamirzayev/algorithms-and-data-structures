package array_easy;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] ints = plusOne(new int[]{9, 8, 7, 6, 5, 4, 9, 9, 9, 9});
        System.out.println(Arrays.toString(ints));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
