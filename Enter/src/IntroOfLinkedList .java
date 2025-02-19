package io.github.jiangdequan;

public class IntroOfLinkedList {

    // Inner Node class
    class Node {
        int data;
        Node next;

        // Default constructor
        Node() {
            this.data = 0;
            this.next = null;
        }

        // Parameterized constructor
        Node(int val, Node next) {
            this.data = val;
            this.next = next;
        }
    }

    // Method to traverse the linked list
    void traverse(Node head) {
        Node curr = head; // Start from the head
        while (curr != null) {
            System.out.println(curr.data); // Print the data of the current node
            curr = curr.next; // Move to the next node
        }
    }

    // Method to add a node at the end of the linked list
    Node addNodeAtEnd(Node head, int val) {
        if (head == null) {
            return new Node(val, null); // Create the first node if the list is empty
        }
        Node ptr = head;
        while (ptr.next != null) { // Traverse to the end of the list
            ptr = ptr.next;
        }
        ptr.next = new Node(val, null); // Add the new node at the end
        return head;
    }

    // Method to add a node at the beginning
    Node addNodeAtFront(Node head, int val) {
        Node newNode = new Node(val, head); // Create a new node and point it to the current head
        return newNode; // Return the new head
    }

    // Method to remove the first node from the linked list
    Node removeNodeAtFront(Node head) {
        if (head == null) {
            return null; // If the list is empty, nothing to remove
        }
        return head.next; // Return the next node as the new head
    }

    // Method to remove the last node from the linked list
    Node removeNodeAtEnd(Node head) {
        if (head == null) {
            return null; // If the list is empty, nothing to remove
        }
        if (head.next == null) {
            return null; // If there is only one node, return null as the list will become empty
        }
        Node prev = null;
        Node curr = head;

        // Traverse to the second-to-last node
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        // Remove the last node
        prev.next = null;
        return head;
    }

    public static void main(String[] args) {
        IntroOfLinkedList list = new IntroOfLinkedList(); // Create an instance of the outer class
        Node head = null; // Initialize the head of the linked list

        // Add nodes to the linked list
        head = list.addNodeAtEnd(head, 423423);
        head = list.addNodeAtEnd(head, 232);
        head = list.addNodeAtEnd(head, 23);
        head = list.addNodeAtEnd(head, 26);
        head = list.addNodeAtFront(head, 999);

        System.out.println("Linked list after additions:");
        list.traverse(head);

        // Remove a node from the front
        head = list.removeNodeAtFront(head);
        System.out.println("Linked list after removing the first element:");
        list.traverse(head);

        // Remove a node from the end
        head = list.removeNodeAtEnd(head);
        System.out.println("Linked list after removing the last element:");
        list.traverse(head);
    }
}
