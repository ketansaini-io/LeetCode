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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp= list1;
        ListNode temp1= list1;
        int i=1;
        while(i<a){
            temp=temp.next;
            i++;
        }
        i=0;
        while(i<=b){
            temp1=temp1.next;
            i++;
        }
        temp.next=list2;
        temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=temp1;
        return list1;
    }
}