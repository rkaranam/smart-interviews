package org.hackerrank.datastructures.linkedlists;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class LinkedList {

    Node head;


    public void append(int data) {

        System.out.println("**** Appending Node at the end ****");

        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {

        System.out.println("**** Prepending Node at the start ****");

        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public int size() {

        System.out.println("**** Printing Size ****");

        Node current = head;
        int size = 0;
        if(current == null) return 0;
        while(current.next != null) {
            size++;
            current = current.next;
        }
        return 1 + size;
    }

    public void insertAt(int data, int pos) {

        System.out.println("**** Insert Node at Position ****");

        Node current = head;
        Node newNode = new Node(data);
        int count = 0;
        while (current.next != null) {
            count++;
            if (count == pos) {
                newNode.next = current.next;
                current.next = newNode;
            }
            current = current.next;
        }

        if(pos > size()) {
            append(data);
        }
    }

    public void deleteNodeWithValue(int data) {

        System.out.println("**** Deleting Node with Value ****");

    }

    public void printElements() {

        System.out.println("**** Printing Elements ****");

        Node current = head;
        if (current == null) {
            System.out.println("No elements in linked list!!");
            return;
        }
        while (current.next != null) {
            System.out.printf("%d ", current.data);
            current = current.next;
        }
        System.out.printf("%d\n", current.data);
    }

}


public class PrintElements {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.append(201);
        ll.append(43);
        ll.append(66);
        ll.append(-212);
        ll.append(0);
        ll.append(2048);

        System.out.println("Size till now: " + ll.size());

        ll.printElements();

        ll.prepend(1025);

        System.out.println("Size till now: " + ll.size());

        ll.printElements();

        ll.insertAt(6666, 2);

        System.out.println("Size till now: " + ll.size());

        ll.printElements();

        System.out.println("Size till now: " + ll.size());

        ll.insertAt(-256, 18);

        System.out.println("Size till now: " + ll.size());

        ll.printElements();
    }

}
