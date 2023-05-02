package sorting.findmax;// Bubble sort in Java

import java.util.Arrays;

class Main {

  public static void main(String args[]) {

    int[] data = {-2, 45, 0, 11, 2, 31, 1, 31, 2};

    for (int i = 0; i < data.length - 1; i++) {
      for (int j = 0; j < data.length - i - 1; j++) {
        if (data[j] < data[j + 1]) {
          int temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(data));
  }
}