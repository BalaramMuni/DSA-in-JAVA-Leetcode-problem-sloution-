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
       HashMap<Integer,Integer> hm = new HashMap<>();
       ListNode temp = head;
       ListNode temp1 = head;
       ListNode dummy = new ListNode(-1);
       ListNode curr = dummy;
       if(head == null) return null;
       while(temp!=null){
            if(!hm.containsKey(temp.val)){
                hm.put(temp.val,0);
            }else{
                hm.put(temp.val,hm.get(temp.val)+1);
            }
            temp = temp.next;
       }
        while(temp1!=null){
            if(hm.get(temp1.val) == 0){
                curr.next = temp1;
                curr = curr.next;
            }
            temp1 = temp1.next;
            curr.next = null;
        }
        return dummy.next;
    }
}