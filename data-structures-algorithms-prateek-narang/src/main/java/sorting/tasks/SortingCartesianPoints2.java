package sorting.tasks;

import java.util.Arrays;
import java.util.Comparator;

public class SortingCartesianPoints2 {
    public static void main(String[] args) {

        int[][] data = {{3, 4}, {2, 3}, {3, 7}, {1, 5}, {3, 4}};
        Arrays.sort(data, Comparator.<int[]>comparingDouble(a -> a[0]).thenComparingDouble(a -> a[1]).reversed());
        System.out.println(Arrays.deepToString(data));
        System.out.println(Arrays.deepToString(sortCartesian(data)));
    }

    public static int[][] sortCartesian(int[][] v) {
        bubbleSort(v);
        return v;
    }

    private static void bubbleSort(int[][] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j <= array.length - i - 1; j++) {
                if (array[j][0] > array[j + 1][0]) {
                    swap(array, j);
                    continue;
                }
                if (array[j][0] == array[j + 1][0]) {
                    if (array[j][1] > array[j + 1][1]) {
                        swap(array, j);
                    }
                }
            }
        }
    }

    private static void swap(int[][] array, int j) {
        int x = array[j][0];
        int y = array[j][1];

        array[j][0] = array[j + 1][0];
        array[j][1] = array[j + 1][1];

        array[j + 1][0] = x;
        array[j + 1][1] = y;
    }
}
