package org.smartinterviews.poc.graphs;

import java.util.*;

/**
 * <a href="https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-in-java-using-priorityqueue/"/>
 * <a href="https://algorithms.tutorialhorizon.com/dijkstras-shortest-path-algorithm-spt-adjacency-list-and-priority-queue-java-implementation/"
 * <a href="https://algorithms.tutorialhorizon.com/dijkstras-shortest-path-algorithm-spt-adjacency-list-and-min-heap-java-implementation/"
 */

public class DijkstrasUndirectedWeighted {

    private int dist[];
    private Set<Integer> settled;
    private PriorityQueue<Node> pq;
    private int vertices;

    // list of lists to represent adjacency list
    public static List<List<Node>> adjMatrix = new LinkedList<>();

    public DijkstrasUndirectedWeighted(int v) {
        this.vertices = v;
        dist = new int[v];
        settled = new HashSet<>();
        pq = new PriorityQueue<>(vertices, new Node());
    }


    static class Node implements Comparator<Node> {

        private int dest;
        private int cost;

        public Node() {}

        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compare(Node o1, Node o2) {
            if (o1.cost > o2.cost) return 1;
            if (o1.cost < o2.cost) return -1;
            return 0;
        }
    }

    static class Edge {

        private int src;
        private int dest;
        private int weight;

        Edge(int src, Node node) {
            this.src = src;
            this.dest = node.dest;
            this.weight = node.cost;
        }
    }

    static class Graph {

        public Graph(List<Edge> edges) {

            adjMatrix.add(0, null);

            // allocate memory for adjacency list
            for (int i = 1; i <= edges.size() + 1; i++) {
                adjMatrix.add(i, new ArrayList<>());
            }

            for (Edge edge : edges)  {
                adjMatrix.get(edge.src).add(new Node(edge.dest, edge.weight));
                adjMatrix.get(edge.dest).add(new Node(edge.src, edge.weight));
            }
        }
    }

    private void dijkstraAlgorithm(int src) {
        for (int i = 0; i < 5; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        // add src to priority queue
        pq.add(new Node(src, 0));
        // distance to src is 0
        dist[src] = 0;

    }

    public static void main(String[] args) {
        int vertices = 5;
        List<Edge> edges = Arrays.asList(
                new Edge(1, new Node(3, 6)),
                new Edge(1, new Node(2, 9)),
                new Edge(1, new Node(4, 5)),
                new Edge(1, new Node(5, 3)),
                new Edge(3, new Node(2, 2)),
                new Edge(3, new Node(4, 4))
        );
        Graph graph = new Graph(edges);
        int src = 1;
        DijkstrasUndirectedWeighted djk = new DijkstrasUndirectedWeighted(vertices);
        djk.dijkstraAlgorithm(src);
    }
}
