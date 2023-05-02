package org.coursera.algorithms.week_1.assignment1;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String winner = "";
        int count = 0;

        while (!StdIn.isEmpty()) {
            String challenger = StdIn.readString();
            count++;
            if (StdRandom.bernoulli(1.0 / count)) {
                winner = challenger;
            }
        }

        StdOut.println(winner);
    }

}
