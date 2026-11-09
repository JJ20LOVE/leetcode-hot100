public class hot26 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode second =head.next;
        head.next=swapPairs(second.next);
        second.next=head;
        return head;

    }

}
