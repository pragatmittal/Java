package io.github.jiangdequan;


class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class InsertUsingRecursion {
    Node head;
    
    public Node insertRecursion(Node node, int val, int pos, int i) {
        if(pos == 0) {
            Node temp = new Node(val);
            temp.next = node;
            return temp;
        }
        if(node == null) {
            return null;
        }
        if(i == pos-1) {
            Node temp = new Node(val);
            temp.next = node.next;
            node.next = temp;
        }
        node.next = insertRecursion(node.next, val, pos, i+1);
        return node;
    }
}