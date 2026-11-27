/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        int l=0;
        while(temp!=null){
            l++;
            temp=temp.next;
            if(l>10000){
                return true;
            }
        }
        return false;
    }
}