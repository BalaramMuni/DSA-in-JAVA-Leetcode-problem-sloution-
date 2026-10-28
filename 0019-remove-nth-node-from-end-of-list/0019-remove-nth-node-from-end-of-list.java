class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;


        ListNode dommy = new ListNode(0);
        dommy.next = head;

        //dommy-> 1 -> 2 -> 3 ..

        ListNode fast = dommy;
        ListNode slow = dommy;

        for(int i=0;i<=n;i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;


        return dommy.next;
    }
}