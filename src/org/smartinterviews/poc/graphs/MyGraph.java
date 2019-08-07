package org.smartinterviews.poc.graphs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyGraph {

    // data structure to store graph edge
    static class Edge {
        private int src;
        private int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    private ArrayList<ArrayList<Integer>> adjMatrix = new ArrayList<>();

    public MyGraph(List<Edge> edges) {
        adjMatrix.add(0, null);
        for (int i = 1; i <= edges.size() + 1; i++) {
            adjMatrix.add(i, new ArrayList<>());
        }
        for (Edge currEdge : edges) {
            adjMatrix.get(currEdge.src).add(currEdge.dest);
            adjMatrix.get(currEdge.dest).add(currEdge.src);
        }
    }

    private static void printGraph(MyGraph graph) {
        int src = 0;
        int n = graph.adjMatrix.size() - 1;

        while (src < n) {
            // print current vertex and all its neighboring vertices
            for (int dest : graph.adjMatrix.get(++src)) {
                System.out.print("(" + src + " --> " + dest + ")\t");
            }
            System.out.println();
        }
    }


    private static String checkEdgeExists(MyGraph graph, Edge qryEdge) {
        int found = -1;

        for (int i = 1; i <= graph.adjMatrix.size(); i++) {
            if (null != graph.adjMatrix.get(i)) {
                for (Integer integer : graph.adjMatrix.get(i)) {
                    System.out.print(integer + "\t");
                }
            }
            System.out.println();
        }

        /*for (int i = 0; i < graph.adjMatrix.size(); i++) {
            if ((qryEdge.src == i) && graph.adjMatrix.get(i).stream().filter(x -> x == qryEdge.dest).count() == 1) {
                // if (qryEdge.src == i && graph.adjMatrix.get(i).indexOf(qryEdge.dest) != -1) {
                found = 1;
            }
        }*/

        /*long found = graph.adjMatrix.stream()
                .filter(edge -> qryEdge.src == edge.get(qryEdge.src) && qryEdge.dest == edge.get(qryEdge.dest))
                .count();*/
        // .filter(edge -> edge.get(qryEdge.src) == null && edge.get(qryEdge.dest) == null).count();

        return (1 == found) ? "Yes" : "No";
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            String[] nodesAndEdges = br.readLine().split(" ");
            int numOfNodes = Integer.parseInt(nodesAndEdges[0]);
            int numOfEdges = Integer.parseInt(nodesAndEdges[1]);
            Edge[] edgesArr = new Edge[numOfEdges];
            for (int j = 0; j < numOfEdges; j++) {
                String[] edge = br.readLine().split(" ");
                int src = Integer.parseInt(edge[0]);
                int dest = Integer.parseInt(edge[1]);
                edgesArr[j] = new Edge(src, dest);
            }
            List<Edge> edges = Arrays.asList(edgesArr);
            MyGraph graph = new MyGraph(edges);
            printGraph(graph);
            bw.write("Test Case #" + (i + 1) + ":" + "\n");
            int queries = Integer.parseInt(br.readLine());
            for (int j = 0; j < queries; j++) {
                String[] edge = br.readLine().split(" ");
                int src = Integer.parseInt(edge[0]);
                int dest = Integer.parseInt(edge[1]);
                Edge qryEdge = new Edge(src, dest);
                String result = checkEdgeExists(graph, qryEdge);
                bw.write(result + "\n");
            }
            bw.flush();
        }

        br.close();
        bw.close();

        /*List<Edge> edges = Arrays.asList(
                new Edge(1, 2),
                new Edge(2, 3),
                new Edge(2, 4),
                new Edge(4, 5),
                new Edge(4, 6));
        MyGraph graph = new MyGraph(edges);
        printGraph(graph);*/

    }

}
