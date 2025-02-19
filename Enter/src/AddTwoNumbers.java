package io.github.jiangdequan;

public class AddTwoNumbers {
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
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        int sum = 0;
        int carry = 0;
        ListNode ans = null;

        while (l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Add carry
            sum += carry;

            // Create a new node with the current digit
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;

            // Insert new node at the front
            newNode.next = ans;
            ans = newNode;

            // Reset sum for the next iteration
            sum = 0;
        }

        return ans;
    }
}

}