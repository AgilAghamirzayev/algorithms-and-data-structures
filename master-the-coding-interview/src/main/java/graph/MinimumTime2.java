package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MinimumTime2 {
    private boolean[] visited;
    private Graph graph;

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        // Build tree like structure with each child pointing to its parent node
        // edge[0] is parent by default for edge[1]. 
        // If edge[1] is already assigned a parent, then make edge[1] a parent of edge[0]
        parent[0] = 0;
        for (int[] edge : edges) {
            if (parent[edge[1]] == -1) {
                parent[edge[1]] = edge[0];
            } else {
                parent[edge[0]] = edge[1];
            }
        }

        int timeSpent = 0;
        boolean[] visited = new boolean[n];
        visited[0] = true;

        for (int node = 1; node < n; ++node) {
            if (hasApple.get(node)) {
                for (int parentNode = node; !visited[parentNode]; parentNode = parent[parentNode]) {
                    visited[parentNode] = true;
                    timeSpent += 2;
                }
            }
        }

        return timeSpent;

    }

    public int minTimeDescriptive(int n, int[][] edges, List<Boolean> hasApple) {
        this.graph = new Graph(n, edges);
        this.visited = new boolean[n];
        return collectApples(0, 0, hasApple);
    }

    private int collectApples(int currentNode, int costBefore, List<Boolean> hasApple) {
        if (visited[currentNode]) {
            return 0;
        }

        visited[currentNode] = true;
        int costAfterCurrentNode = 0;

        for (Integer nextNode : graph.adj[currentNode]) {
            costAfterCurrentNode += collectApples(nextNode, 2, hasApple);
        }

        if (hasApple.get(currentNode) || costAfterCurrentNode > 0) {
            return costAfterCurrentNode + costBefore;
        }

        return 0;

    }


}

class Graph {
    int totalVertices;
    List<Integer>[] adj;

    public Graph(int totalVertices, int[][] edges) {
        this.totalVertices = totalVertices;
        this.adj = new ArrayList[totalVertices];

        for (int i = 0; i < totalVertices; ++i) {
            adj[i] = new ArrayList<>();
        }

        addEdge(edges);
    }

    public void addEdge(int[][] edges) {
        for (int[] edge : edges) {
            addEdge(edge[0], edge[1]);
        }
    }

    public void addEdge(int src, int dest) {
        adj[src].add(dest);
        adj[dest].add(src);
    }

}