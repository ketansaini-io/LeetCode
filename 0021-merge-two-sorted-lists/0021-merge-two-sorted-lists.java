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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nn=new ListNode(0);
        ListNode head=new ListNode(0);
        head=nn;
        if(list1==null&&list2==null){
            return null;
        }
        else if(list1==null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }
        if(list1.val>list2.val){
                nn.val=list2.val;
                nn.next=null;
                list2=list2.next;
            }
        else{
                nn.val=list1.val;
                nn.next=null;
                list1=list1.next;
            }
        while(list1!=null&&list2!=null){
            ListNode temp=new ListNode(0);
            if(list1.val>list2.val){
                temp.val=list2.val;
                temp.next=null;
                list2=list2.next;
            }
            else{
                temp.val=list1.val;
                temp.next=null;
                list1=list1.next;
            }
            nn.next=temp;
            nn=temp;
        }
        while(list1!=null){
            ListNode temp=new ListNode(0);
            temp.val=list1.val;
            temp.next=null;
            nn.next=temp;
            nn=temp;
            list1=list1.next;
        }
        while(list2!=null){
            ListNode temp=new ListNode(0);
            temp.val=list2.val;
            temp.next=null;
            nn.next=temp;
            nn=temp;
            list2=list2.next;
        }
        return head;
    }
}