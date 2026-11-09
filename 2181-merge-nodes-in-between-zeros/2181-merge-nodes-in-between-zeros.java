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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ListNode temp1=temp.next;
        int i=0;
        while(temp1!=null){
            int v=0;
            while(temp1.val!=0){
             v+=temp1.val;
             temp1=temp1.next;
            }
            temp.val=v;
            temp=temp.next;
            temp1=temp1.next;
            i++;
        }
        temp=head;
        int l=0;
        while(l<i-1){
            temp=temp.next;
            l++;
        }
        temp.next=null;
        return head;
    }
}