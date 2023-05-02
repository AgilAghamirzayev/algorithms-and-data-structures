package array_easy;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] ints = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(ints));
        reverse(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
