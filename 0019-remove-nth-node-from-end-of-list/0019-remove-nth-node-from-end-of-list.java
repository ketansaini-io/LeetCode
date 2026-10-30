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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode temp= new ListNode();
        temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==1){
            head=null;
            return head;
        }
        int i=0;
        temp=head;
        if(n==1){
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
        else if(n==len){
            head=head.next;
        }
        else{
            while(i!=len-n-1){
                temp=temp.next;
                i++;
            }
          temp.next=temp.next.next;
        }
        return head;
    }
}