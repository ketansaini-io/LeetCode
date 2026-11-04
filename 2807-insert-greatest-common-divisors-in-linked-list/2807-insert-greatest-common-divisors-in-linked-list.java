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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null){
            ListNode nex= temp.next;
            ListNode hcf=new ListNode();
            hcf.val=gcd(temp.val,nex.val);
            hcf.next=nex;
            temp.next=hcf;
            temp=nex;
        }
        return head;
    }
    int gcd (int a, int b) {
    if (b == 0)
        return a;
    else
        return gcd (b, a % b);
}
}