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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        if(temp==null){
            return null;
        }
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                ListNode temp1=temp.next;
                while(temp1!=null&&temp.val==temp1.val){
                    temp1=temp1.next;
                }
                temp.next=temp1;
            }
            else{
                temp=temp.next;
            }
        }
        return head;    
}
}