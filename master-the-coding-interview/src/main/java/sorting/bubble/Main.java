package sorting.bubble;// Bubble sort in Java

import java.util.Arrays;

class Main {

  static void bubbleSort(int array[]) {
    int size = array.length;

    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }


  static void bubbleSort2(int array[]) {

    int length = array.length;

    for (int i = length - 1; i < 0; i--) {
      for (int j = 0; j < length; j++) {

      }
    }
  }

  public static void main(String args[]) {

    int[] data = {-2, 45, 0, 11, -9};

    // call method using class name
    Main.bubbleSort(data);

    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}