// package io.github.jiangdequan;

public class ReverseNodeInKgroup {
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode nextNode=new ListNode();
        ListNode prev=null;
        while(temp!=null){
            ListNode kNode= findkNode(temp,k);
            if(kNode==null){
                prev.next=temp;
                break;
            }
            nextNode=kNode.next;
            kNode.next=null;
            reverse(temp);
            if(temp==head){
                head=kNode;
            }
            else{
                prev.next=kNode;
            }
            prev=temp;
            temp=nextNode;

        }
        return head ;
            }
    public ListNode findkNode(ListNode list, int k){
        while(k>1 && list!=null ){
            k--;
            list=list.next;

        } 
        return list;

    }
    public ListNode  reverse(ListNode list){
        ListNode curr=list;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
}