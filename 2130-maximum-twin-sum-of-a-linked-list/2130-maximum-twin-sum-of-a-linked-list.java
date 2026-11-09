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
    public int pairSum(ListNode head) {
        ListNode temp= head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int []arr= new int[len];
        temp=head;
        len=0;
        while(temp!=null){
            arr[len]=temp.val;
            len++;
            temp=temp.next;
        }
        for(int i=0;i<arr.length/2;i++) {
            int t=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=t;
        }
        int max=Integer.MIN_VALUE;
        temp=head;
        len=0;
        while(temp!=null){
        if(temp.val+arr[len]>max){
            max=temp.val+arr[len];
        }
        len++;
        temp=temp.next;
        }
        return max;
    }
}