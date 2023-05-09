package sorting;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class MergeSort {

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
    mergeSort(a, 0, a.length - 1);
    return timer.elapsedTime();
  }


  public static void merge(int[] arr, int p, int q, int r) {

    int n1 = q - p + 1;
    int n2 = r - q;

    int[] L = new int[n1];
    int[] M = new int[n2];

    for (int i = 0; i < n1; i++) {
      L[i] = arr[p + i];
    }
    for (int j = 0; j < n2; j++) {
      M[j] = arr[q + 1 + j];
    }

    int i, j, k;
    i = 0;
    j = 0;
    k = p;

    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = M[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }
    while (j < n2) {
      arr[k] = M[j];
      j++;
      k++;
    }
  }

  public static void mergeSort(int[] arr, int l, int r) {
    if (l < r) {
      int m = (l + r) / 2;
      mergeSort(arr, l, m);
      mergeSort(arr, m + 1, r);
      merge(arr, l, m, r);
    }
  }
}
