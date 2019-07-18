package org.smartinterviews.poc.trees;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BinarySearchTree {

    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    BinarySearchTree() {
        root = null;
    }

    void removeAllNodes() {
        root = null;
    }

    Node getRoot() {
        return root;
    }

    void insert(int data) {
        root = insertNode(root, data);
    }

    Node insertNode(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }

        if(data < root.data) {
            root.left = insertNode(root.left, data);
        }
        else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }

        return root;
    }

}

public class TreeTraversals {

    private static BinarySearchTree bst;

    public static void main(String[] args) throws Exception {

        bst = new BinarySearchTree();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            int arrSize = Integer.parseInt(br.readLine());
            int[] arr = new int[arrSize];
            String[] inp = br.readLine().split(" ");
            for (int j = 0; j < arrSize; j++) {
                arr[j] = Integer.parseInt(inp[j]);
            }
            printTreeTraversals(arr, arrSize);
            System.out.println();
            bst.removeAllNodes();
        }

        br.close();
        bw.close();

    }

    private static void printTreeTraversals(int[] arr, int arrSize) {
        constructBST(arr, arrSize);
        printPreorderTraversal(bst.getRoot());
        System.out.println();
        printInorderTraversal(bst.getRoot());
        System.out.println();
        printPostorderTraversal(bst.getRoot());
        System.out.println();
    }

    private static void printPostorderTraversal(BinarySearchTree.Node root) {
        if(root != null) {
            printPostorderTraversal(root.left);
            printPostorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    private static void printPreorderTraversal(BinarySearchTree.Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            printPreorderTraversal(root.left);
            printPreorderTraversal(root.right);
        }
    }

    private static void printInorderTraversal(BinarySearchTree.Node root) {
        if(root != null) {
            printInorderTraversal(root.left);
            System.out.print(root.data + " ");
            printInorderTraversal(root.right);
        }
    }

    private static void constructBST(int[] arr, int arrSize) {
        for (int i = 0; i < arrSize; i++) {
            bst.insert(arr[i]);
        }
    }

}
