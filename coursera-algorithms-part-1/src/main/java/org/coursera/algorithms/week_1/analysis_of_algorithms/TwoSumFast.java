package org.coursera.algorithms.week_1.analysis_of_algorithms;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;
import java.util.Arrays;

public class TwoSumFast {
  public static int count(int[] a) {
    Arrays.sort(a);
    int n = a.length;
    int count = 0;

    for (int i = 0; i < n; i++) {
      if (a[i] > 0) return count;
      if (BinarySearch.indexOf(a, -a[i]) > i) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int[] a = In.readInts("1Mints.txt");

    Stopwatch timer = new Stopwatch();
    int count = count(a);
    StdOut.println("elapsed time = " + timer.elapsedTime());
    StdOut.println(count);
  }

}
