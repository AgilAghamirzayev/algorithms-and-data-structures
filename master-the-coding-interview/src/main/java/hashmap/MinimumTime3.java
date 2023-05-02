package hashmap;

import java.util.*;

public class MinimumTime3 {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        int[] counts = new int[n];

        Arrays.sort(edges, (a, b) -> {
            if (a[1] == b[0]) {
                return -1;
            } else if (a[0] == b[1]) {
                return 1;
            } else {
                return 0;
            }
        });

        // walk backwards
        for (int edgePos = edges.length - 1; edgePos >= 0; --edgePos) {
            int[] edge = edges[edgePos];
            if (hasApple.get(edge[1]) || counts[edge[1]] > 0) {
                // forward and back + from previous node
                counts[edge[0]] += 2 + counts[edge[1]];
            } else if (hasApple.get(edge[0]) || counts[edge[0]] > 0) {
                // forward and back + from previous node
                counts[edge[1]] += 2 + counts[edge[0]];
            }
        }

        return counts[0];
    }
}
