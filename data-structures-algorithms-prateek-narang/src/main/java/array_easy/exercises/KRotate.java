package array_easy.exercises;

import java.util.Arrays;

public class KRotate {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(kRotate(new int[]{1, 2, 3, 4, 5, 6}, 1)));
    }


    public static int[] kRotate(int[] a, int k) {
        k = k % a.length;

        for (int i = 0; i < k; i++) {
            int temp = a[i];
            a[i] = a[a.length - k + i];
            a[a.length - k + i] = temp;
        }

        return a;
    }
}
