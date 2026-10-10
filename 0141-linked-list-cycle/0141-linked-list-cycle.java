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
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode last=head;
        if(head==null || head.next==null) return false;
        while(last!=null && last.next!=null){
            fast=fast.next;
            last=last.next.next;
         if(fast==last){
            return true;
        }
        
        }
       

        return false;
    }
}