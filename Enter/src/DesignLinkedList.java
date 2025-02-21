
public class DesignLinkedList {
    class MyLinkedList {
        private Node head;
        private int length;
    
        public class Node {
            int val;
            Node next;
            Node(int val) {
                this.val = val;
                this.next = null;
            }
        }
    
        public MyLinkedList() {
            this.head = null;
            this.length = 0;
        }
    
        public int get(int index) {
            if (index < 0 || index >= length) {
                return -1;
            }
            int count = 0;
            Node temp = head;
            while (count < index) {
                count++;
                temp = temp.next;
            }
            return temp.val;
        }
    
        public void addAtHead(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            length++; // Update length
        }
    
        public void addAtTail(int val) {
            if (head == null) {
                addAtHead(val);
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; // Move to last node
            }
            temp.next = new Node(val);
            length++; // Update length
        }
    
        public void addAtIndex(int index, int val) {
            if (index > length) {
                return;
            }
            if (index == 0) {
                addAtHead(val);
                return;
            }
            Node temp = head;
            int count = 0;
            while (count < index - 1) { // Move to the node before the index
                temp = temp.next;
                count++;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            length++; // Update length
        }
    
        public void deleteAtIndex(int index) {
            if (index < 0 || index >= length) {
                return;
            }
            if (index == 0) {
                head = head.next;
            } else {
                int count = 0;
                Node temp = head;
                while (count < index - 1) { // Move to the node before the index
                    temp = temp.next;
                    count++;
                }
                temp.next = temp.next.next;
            }
            length--; // Update length
        }
    }
    
}