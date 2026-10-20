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
    public ListNode middleNode(ListNode head) {
        if(head == null)return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode dommy = new ListNode(-1);
        ListNode curr = dommy;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }        
        while(slow!=null){
           curr.next = slow;
            slow = slow.next;
            curr = curr.next;
        }
        return dommy.next;
    }
}