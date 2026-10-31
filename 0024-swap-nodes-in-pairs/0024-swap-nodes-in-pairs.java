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
    public ListNode swapPairs(ListNode head) {
        ListNode temp= head;
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        head=temp.next;
        while(temp!=null&&temp.next!=null){
            ListNode te=temp.next;
            ListNode nex=te.next;
            if(temp.next.next==null){
                temp.next=null;
                te.next=temp;
            }
            else if(temp.next.next.next==null){
                temp.next=te.next;
                te.next=temp;
            }
            else{
            temp.next=temp.next.next.next;
            te.next=temp;}
            temp=nex;
            
        }
        
        return head;
    }
}