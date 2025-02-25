
public class IntersetionOf2LinkedList {
 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=tempB){
            tempA=tempA!=null?tempA=tempA.next:headB;
            tempB=tempB!=null?tempB=tempB.next:headA;


        }

return tempA;
    }
}   
}