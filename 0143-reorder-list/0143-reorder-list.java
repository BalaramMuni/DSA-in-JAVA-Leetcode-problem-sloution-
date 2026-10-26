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
    public void reorderList(ListNode head) {
          if(head == null || head.next == null || head.next.next == null){
            return;
        }
        //find the middle of the ll
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //new ll head is sechead
        ListNode sechead = slow.next;
       
        //detach the linked list
         slow.next = null;

         //reverse second linked list where head is sechead

         ListNode prev = null;
         ListNode curr = sechead;
         while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
         }

         //t1 --> head of the 1st linked list
         //t2 ---> head of the 2nd linked list jiska head abhi prev hai (after reverse)

         ListNode t1 = head;
         ListNode t2 = prev;
         //now traverse 2nd linked list and insert to original linked list 
         while(t2 != null){
            ListNode m1 = t1.next;
            ListNode m2 = t2.next;
            t1.next = t2;
            t2.next = m1;
            t1 = m1;
            t2 = m2;
         }
    }
    }
