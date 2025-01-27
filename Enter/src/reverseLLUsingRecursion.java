package io.github.jiangdequan;

public class reverseLLUsingRecursion {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head); // Helper function ko call kar rahe hain
    }

    private ListNode reverse(ListNode head) {
        // Base case: agar head null ho ya sirf ek hi node ho
        if (head == null || head.next == null) {
            return head;
        }

        // Recursively reverse baaki list
        ListNode newHead = reverse(head.next);

        // Current node ka next ka next ko current node par point karna hai
        head.next.next = head;
        head.next = null; // Current node ka forward link todna hai

        return newHead; // Naya head return karega
    }
}

}