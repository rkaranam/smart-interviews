package org.smartinterviews.poc.graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

    private static final int vertices = 12;
    private static boolean[] vis = new boolean[vertices + 1];

    public static void main(String[] args) {
        List<MyGraph.Edge> edges = Arrays.asList(
                new MyGraph.Edge(4, 7),
                new MyGraph.Edge(7, 8),
                new MyGraph.Edge(3, 7),
                new MyGraph.Edge(3, 6),
                new MyGraph.Edge(2, 3),
                new MyGraph.Edge(2, 9),
                new MyGraph.Edge(1, 6),
                new MyGraph.Edge(2, 10),
                new MyGraph.Edge(1, 10),
                new MyGraph.Edge(10, 12),
                new MyGraph.Edge(5, 11)
        );
        MyGraph graph = new MyGraph(edges);
        MyGraph.printGraph(graph);
        Arrays.fill(vis, false);
        int src = 3, dest = 12; // true
        boolean pathExists = checkPathExists(graph, src, dest);
        System.out.println("Is path exists between " + src + " and " + dest + ": " + pathExists);
    }

    private static boolean checkPathExists(MyGraph graph, int src, int dest) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(src);
        vis[src] = true;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : graph.adjMatrix.get(u)) {
                if (!vis[v]) {
                    queue.add(v);
                    vis[v] = true;
                }
            }
        }
        return vis[dest];
    }
}
