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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode curr = ans;
        int carry = 0;
        int sum = 0;
        int rem = 0;
        while (l1 != null || l2 != null) {
             sum = carry;
            //for extra part if l2 is null then l2 part should be run 
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            if (sum >= 10) {
                carry = sum / 10;
                rem = sum % 10;
                curr.next = new ListNode(rem);
            } else {
                carry = 0;
                curr.next = new ListNode(sum);
            }
            curr = curr.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return ans.next;
    }
}