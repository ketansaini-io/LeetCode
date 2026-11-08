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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
      int len=0;
      ListNode temp =head;
      while(temp!=null){
        len++;
        temp=temp.next;
      }
      if(len==2){
        int [] arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        return arr;
      }
      int []arr=new int[len-2];
      int i=0;
      int j=1;
      temp=head.next;
      ListNode pre=head;
      ListNode nex=temp.next;
      while(temp.next!=null){
        if(temp.val>nex.val&&temp.val>pre.val){
            arr[i]=j;
            i++;
        }
        else if(temp.val<nex.val&&temp.val<pre.val){
            arr[i]=j;
            i++;
        }
        j++;
        pre=temp;
        temp=temp.next;
        nex=temp.next;
      }
      if(i==0||i==1){
        int [] ar=new int[2];
        ar[0]=-1;
        ar[1]=-1;
        return ar;
      }
      int []ans= new int[i];
      i=0;
      while(i<ans.length){
        ans[i]=arr[i];
        i++;
      }
    int [] an=new int[2];
    int min=Integer.MAX_VALUE;
    i=0;
    while(i<ans.length-1){
        if(ans[i+1]-ans[i]<min){
            min=ans[i+1]-ans[i];
        }
        i++;
    }
    an[0]=min;
    an[1]=ans[ans.length-1]-ans[0];
return an;
    }
}