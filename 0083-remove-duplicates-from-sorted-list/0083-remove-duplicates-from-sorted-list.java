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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode dommy = new ListNode(-1);
        ListNode curr = dommy;
        if(head == null){
            return null;
        }
        while(temp.next!=null){
            if(temp.val != temp.next.val){
                curr.next = temp;
                curr = curr.next;
            }
            temp = temp.next;
        }
        if(curr.val != temp.val){
            curr.next = temp;
        }
        return dommy.next;
    }
}