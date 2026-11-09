import java.util.HashSet;
import java.util.Set;

public class hot21 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {

        if(head==null) return null;
        HashSet<Object> seen = new HashSet<>();
        while(head.next!=null){
            if(!seen.add(head)) return head;
            head=head.next;
        }
        return null;

    }
}
