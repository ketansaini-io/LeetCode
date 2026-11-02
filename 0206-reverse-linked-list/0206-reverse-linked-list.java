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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode temp1=head;
        ListNode tempo=head;
        int len=0;
        while(temp!=null){
           len++;
           temp=temp.next;
        }
        if(len==1||len==0){
            return head;
        }
        if(len==2){
            temp=head.next;
            temp.next=head;
            head.next=null;
            return temp;
        }
        temp=head.next;
        temp1=temp.next;
        if(len==3){
            temp.next=tempo;
            temp1.next=temp;
            head.next=null;
            return temp1;
        }
        while(temp1.next!=null){
            temp1=temp.next;
            temp.next=tempo;
            tempo=temp;
            temp=temp1;
        }
        temp.next=tempo;
        head.next=null;
        return temp1;
    }
}