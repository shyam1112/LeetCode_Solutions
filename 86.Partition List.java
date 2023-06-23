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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode base=new ListNode();

        ListNode ans=new ListNode();
        ListNode tempans=ans;
        ListNode basee=base;
        
        while(temp != null){
            if(temp.val < x){
                tempans.next=temp;
                tempans=tempans.next;
            }else{
                
                basee.next=temp;
                basee=basee.next;
            }
            temp=temp.next;
        }
        basee.next=null;
        tempans.next=base.next;

        return ans.next; 
    }
}
