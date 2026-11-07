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
    public ListNode reverseBetween(ListNode head, int left, int right) {
     int len=0;
     ListNode temp =head;
     while(temp!=null){
        len++;
        temp=temp.next;
     }
     int []arr= new int[len];
     temp=head;
     int i=0;
     while(temp!=null){
        arr[i]=temp.val;
        temp=temp.next;
        i++;
     }  
     for(i=0;left-1+i<=(left-1+right-1)/2;i++){
        int t=arr[left-1+i];
        arr[left-1+i]=arr[right-i-1];
        arr[right-i-1]=t;
     }
     temp=head;
     i=0;
     while(temp!=null){
        temp.val=arr[i];
        i++;
        temp=temp.next;
     }
     return head;
    }
}