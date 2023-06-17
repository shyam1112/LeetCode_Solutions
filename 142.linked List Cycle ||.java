/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int length=0;
        while(fast != null && fast.next!= null){
            fast=fast.next.next;
            slow=slow.next;
            

            if(fast==slow){
               length=lengthCycle(slow);
               break;
            }
        }

    if(length==0){
        return null;
    }
        ListNode f=head;
        ListNode s=head;

        while(length>0){
            s=s.next;
            length--;
        }

        while(f!=s){
            f=f.next;
            s=s.next;
        }

        return s;

    }
    public static int lengthCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast != null && fast.next!= null){
            fast=fast.next.next;
            slow=slow.next;
            int l=0;

            if(fast==slow){
                do{
                    fast=fast.next;
                    l++;
                }while(fast!=slow);
                return l;
            }
        }
        return 0;
    }
}
