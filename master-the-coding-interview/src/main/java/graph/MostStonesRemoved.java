package graph;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MostStonesRemoved {
    public static void main(String[] args) {
        System.out.println(removeStones(new int[][]{{0, 1}, {1, 0}, {1, 1}}));
    }


    public static int removeStones(int[][] stones) {
        Arrays.sort(stones, Comparator.<int[]>comparingDouble(a -> a[0]).thenComparingDouble(a -> a[1]));

        int count1 = 0;
        int count2 = 0;
        count1 = getCount(stones, count1);

        Arrays.sort(stones, Comparator.<int[]>comparingDouble(a -> a[0]).thenComparingDouble(a -> a[1]).reversed());

        count2 = getCount(stones, count2);

        return Math.max(count1, count2);
    }

    private static int getCount(int[][] stones, int count2) {
        for (int i = 0; i < stones.length; i++) {
            for (int j = i + 1; j < stones.length; j++) {
                if (stones[j][0] == stones[i][0] || stones[j][1] == stones[i][1]) {
                    count2++;
                    break;
                }
            }
        }
        return count2;
    }
}
