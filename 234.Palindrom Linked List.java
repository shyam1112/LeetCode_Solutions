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
        ListNode next=pres.next;

        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next != null){
                next=next.next;
            }
        }

        return prev;

    }
    public boolean isPalindrome(ListNode head) {
    
        ListNode mid=middel(head);
        ListNode headsecond=reverce(mid);
        ListNode revercehead=headsecond;

        while(head!=null && headsecond!=null){
            if(head.val != headsecond.val){
                break;
            }
            head=head.next;
            headsecond=headsecond.next;
        }
        return head==null || headsecond==null;
    }
}
