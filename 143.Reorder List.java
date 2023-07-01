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

     public static ListNode middel(ListNode head){
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
   
    public static ListNode reverce(ListNode head){
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=head.next;

        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode mid=middel(head);
        ListNode hs=reverce(mid);   
        ListNode hf=head;
   
        while(hs != null && hf != null){
           ListNode temp=hf.next;
           hf.next=hs;
           hf=temp;

           temp=hs.next;
           hs.next=hf;
           hs=temp;
        }
        if(hf!=null){
            hf.next=null;
        }
    }
}
