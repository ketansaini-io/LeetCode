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
    public ListNode rotateRight(ListNode head, int k) {
        int len=0;
        int i=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==0||k==0){
            return head;
        }
        while(k>=len){
            k%=len;
        }
        if(k==0){
            return head;
        }
        ListNode end=head;
        while(end.next!=null){
            end=end.next;
        }
         i=0;
        temp=head;
        while(i<len-1-k){
            temp=temp.next;
            i++;
        }
        ListNode nhead=temp.next;
        temp.next=null;
        end.next=head;
        head=nhead;
        return head;           
    }
}