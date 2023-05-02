package sorting.tasks;

import java.util.Arrays;

public class SortingCartesianPoints {
    public static void main(String[] args) {
        int[][] data = {{3, 4}, {2, 3}, {3, 7}, {1, 5}, {3, 4}};
        System.out.println(Arrays.deepToString(sortCartesian(data)));
    }

    public static int[][] sortCartesian(int[][] v) {

        double[][] valueToIndex = new double[v.length][2];
        int[][] result = new int[v.length][2];

        for (int i = 0; i < v.length; i++) {
            int x = v[i][0];
            int y = v[i][1];

            double z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

            valueToIndex[i][0] = z;
            valueToIndex[i][1] = i;
        }

        bubbleSort(valueToIndex);

        for (int i = 0; i < v.length; i++) {
            int index = (int) valueToIndex[i][1];

            result[i][0] = v[index][0];
            result[i][1] = v[index][1];

        }

        return result;
    }

    private static void bubbleSort(double[][] array) {
        for (int i = 1; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j <= array.length - i - 1; j++) {
                if (array[j][0] > array[j + 1][0]) {
                    swapped = true;
                    double temp0 = array[j][0];
                    double temp1 = array[j][1];

                    array[j][0] = array[j + 1][0];
                    array[j][1] = array[j + 1][1];

                    array[j + 1][0] = temp0;
                    array[j + 1][1] = temp1;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
