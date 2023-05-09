package sorting;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class InsertionSort {

  public static void main(String[] args) {
    for (int N = 250; true; N += N) {
      double time = timeTrial(N);
      StdOut.printf("%7d element %5.1f saniyə \n", N, time);
    }
  }

  public static double timeTrial(int N) {
    int MAX = 100_000_0;
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = StdRandom.uniformInt(-MAX, MAX);
    }
    Stopwatch timer = new Stopwatch();
    insertionSort(a);
    return timer.elapsedTime();
  }


  public static void insertionSort(int[] array) {
    int size = array.length;

    for (int step = 1; step < size; step++) {
      int key = array[step];
      int j = step - 1;

      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }

      array[j + 1] = key;
    }
  }
}
