package array_easy;

import java.util.Arrays;

public class SortedSquaredArray {


  public static void main(String[] args) {
    System.out.println(Arrays.toString(soredSquaredArray(new int[]{-3, 2, 3, 4, 5, 6})));
  }

  public static int[] soredSquaredArray(int[] array) {
    int start = 0;
    int end = array.length - 1;
    int index = array.length - 1;
    int[] result = new int[array.length];

    while (start - 1 != end) {
      if (Math.abs(array[start]) < Math.abs(array[end])) {
        result[index] = (int) Math.pow(array[end], 2);
        end--;
      } else {
        result[index] = (int) Math.pow(array[start], 2);
        start++;
      }
      index--;
    }

    return result;
  }


}
