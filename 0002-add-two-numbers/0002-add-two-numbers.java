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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1len=0;
        int l2len=0;
        ListNode temp=new ListNode();
        ListNode sm=new ListNode();
        temp=l1; 
        while(temp!=null){
            l1len++;
            temp=temp.next;
        }
        temp=l2; 
        while(temp!=null){
            l2len++;
            temp=temp.next;
        }
        if(l2len>l1len){
            temp=l2;
            sm=l1;
        }
        else{
            temp=l1;
            sm=l2;
        }
        ListNode head=new ListNode();
        head=temp;
        int carry=0;
        while(temp!=null&&sm!=null){
            int x=temp.val+sm.val+carry;
            temp.val=(x)%10;
            carry=x/10;
            temp=temp.next;
            sm=sm.next;
        }
        while(temp!=null){
            int x= temp.val+carry;
            temp.val=x%10;
            carry=x/10;
            temp=temp.next;
        }
        if(carry!=0){
            temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            ListNode lol=new ListNode(carry);
            temp.next=lol;
            lol.next=null;
        }
        return head;
    }
}