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
    public ListNode swapNodes(ListNode head, int k) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int i=0;
        temp=head;
        while(temp!=null&&i<k-1){
            temp=temp.next;
            i++;
        }
        i=0;
        ListNode temp1=head;
        while(temp1!=null&&i<len-k){
            temp1=temp1.next;
            i++;
        }
        int one=temp.val;
        int two=temp1.val;
        temp1.val=one;
        temp.val=two;
        return head;
    }
}