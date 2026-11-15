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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        int len=0;
         while(temp!=null){
            len++;
            temp=temp.next;
         }
         int []arr= new int[len];
         len=0;
         temp=head;
         while(temp!=null){
            arr[len]=temp.val;
            len++;
            temp=temp.next;
         }
         for(int i=0;i<arr.length/2;i++){
            int t=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=t;
         }
         temp=head;
         len=0;
         while(temp!=null){
            temp.val=arr[len];
            len++;
            temp=temp.next;
         }
         temp=head;
         int max=temp.val;
         temp=temp.next;
         ListNode pre=head;
         while(temp!=null){
           if(temp.val<max){
               pre.next=temp.next;
               temp=temp.next;
           }
           else{
            max=temp.val;
            pre=temp;
            temp=temp.next;
           }
         }
         temp=head;
         len=0;
         while(temp!=null){
            len++;
            temp=temp.next;
         }
         int []arr1= new int[len];
         len=0;
         temp=head;
         while(temp!=null){
            arr1[len]=temp.val;
            len++;
            temp=temp.next;
         }
         
         for(int i=0;i<arr1.length/2;i++){
            int t=arr1[i];
            arr1[i]=arr1[arr1.length-i-1];
            arr1[arr1.length-i-1]=t;
         }
         temp=head;
         len=0;
         
         while(temp!=null){
            temp.val=arr1[len];
            len++;
            temp=temp.next;
         }
         return head;
    }
}