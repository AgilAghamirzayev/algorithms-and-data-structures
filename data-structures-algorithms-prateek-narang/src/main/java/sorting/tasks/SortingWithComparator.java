package sorting.tasks;

import java.util.Arrays;

public class SortingWithComparator {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortingWithComparator(new int[]{111, 33, 5, 7, 29}, true)));
        System.out.println(Arrays.toString(sortingWithComparator(new int[]{111, 33, 5, 7, 29}, false)));
    }


    public static int[] sortingWithComparator(int[] array, boolean isReverse) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (compare(array[j], array[j + 1], isReverse)) {
                    swapped = true;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return array;
    }

    public static boolean compare(int a, int b, boolean isReverse) {
        return isReverse ? a > b : a < b;
    }
}
