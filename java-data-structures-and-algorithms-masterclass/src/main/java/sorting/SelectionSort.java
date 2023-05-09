package sorting;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SelectionSort {


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
    selectionSort(a);
    return timer.elapsedTime();
  }


  public static void selectionSort(int[] array) {
    int size = array.length;

    for (int step = 0; step < size - 1; step++) {
      int min_idx = step;

      for (int i = step + 1; i < size; i++) {
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }

      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }
}
