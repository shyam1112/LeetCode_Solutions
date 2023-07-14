/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=0;
        ListNode temp1=headA;
        while(temp1!=null){
            temp1=temp1.next;
            len1++;
        }
        int len2=0;
        ListNode temp2=headB;
        while(temp2!=null){
            temp2=temp2.next;
            len2++;
        }
        int len=(int)Math.abs(len1-len2);
        
        ListNode h1=headA;
        ListNode h2=headB;
        if(len1>len2){
            int i=0;
            while(i<len){
                h1=h1.next;
                i++;
            }
        }else{
            int i=0;
            while(i<len){
                h2=h2.next;
                i++;
            }
        }

        while(h1!=h2 && h1!=null && h2!=null){
            h1=h1.next;
            h2=h2.next;
        }
        if(h1==null || h2==null){
            return null;
        }
        return h1;

    }
}
