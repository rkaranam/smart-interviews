package org.smartinterviews.poc.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyGraph {

    // data structure to store graph edges
    static class Edge {

        private int src;
        private int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }

    }

    // list of lists to represent adjacent list
    public List<ArrayList<Integer>> adjMatrix = new LinkedList<>();

    // constructor to construct graph
    private MyGraph(List<Edge> edges) {

        adjMatrix.add(0, null);

        // allocate memory for adjacency list
        for (int i = 1; i <= edges.size() + 1; i++) {
            adjMatrix.add(i, new ArrayList<>());
        }

        // add edges to undirected graph
        for (Edge current : edges) {
            // allocate new node in adjacency list from src to dest
            adjMatrix.get(current.src).add(current.dest);
            // allocate new node in adjacency list from dest to src
            adjMatrix.get(current.dest).add(current.src);
        }
    }

    private static void printGraph(MyGraph graph) {
        int src = 1;
        int n = graph.adjMatrix.size();
        while (src < n) {
            for (int dest : graph.adjMatrix.get(src)) {
                System.out.print("(" + src + " --> " + dest + ")\t");
            }
            System.out.println();
            src++;
        }
    }

    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(
                new Edge(8, 7),
                new Edge(4, 7),
                new Edge(7, 3),
                new Edge(3, 6),
                new Edge(3, 2),
                new Edge(2, 10),
                new Edge(6, 1),
                new Edge(1, 10),
                new Edge(10, 12),
                new Edge(5, 11),
                new Edge(2, 9)
        );

        MyGraph graph = new MyGraph(edges);
        printGraph(graph);
    }
}
