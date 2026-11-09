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
    public ListNode rotateRight(ListNode head, int k) {
        int len=0;
        int i=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==0||k==0){
            return head;
        }
        int []arr=new int[len];
        temp=head;
        while(temp!=null){
            arr[i]=temp.val;
            i++;
            temp=temp.next;
                    }
        while(k>=len){
            k-=len;
        }
        if(k==0){
            return head;
        }
        
        temp=head;
        i=0;
        while(temp!=null){
            temp.val=arr[i];
            i++;
            temp=temp.next;
        }
        int []marr=new int[len];
        int j=0;
        for(i=arr.length-k;i<arr.length;i++){
         marr[j]=arr[i];
         j++;
        }
        for(i=0;i<arr.length-k;i++){
            marr[j]=arr[i];
            j++;
        }
        temp=head;
        i=0;
        while(temp!=null){
            temp.val=marr[i];
            i++;
            temp=temp.next;
        }
        return head;           
    }
}