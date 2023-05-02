package hashmap;

import java.util.*;

public class MinimumTime {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Set<Integer>> adjacency = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adjacency.put(i, new HashSet<>());
        }

        int e = edges.length;
        for (int[] edge : edges) {
            adjacency.get(edge[0]).add(edge[1]);
            adjacency.get(edge[1]).add(edge[0]);
        }

        int res = visit(0, visited, adjacency, hasApple);

        return res == 0 ? 0 : res - 2;
    }

    private int visit(int node, Set<Integer> visited, Map<Integer, Set<Integer>> adjacency,
                      List<Boolean> hasApple) {
        if (visited.contains(node)) return 0;

        visited.add(node);
        int res = 0;
        for (int neighbor : adjacency.get(node)) {
            res += visit(neighbor, visited, adjacency, hasApple);
        }
        if (res != 0 || hasApple.get(node)) {
            res += 2;
        }
        return res;
    }
}
