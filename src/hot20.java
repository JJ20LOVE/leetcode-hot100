import java.util.HashSet;
import java.util.Set;

public class hot20 {
      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
     }

    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {

        Set<Object> seen = new HashSet<>();
        while(head!=null){
            if(!seen.add(head)) return true;
            head=head.next;
        }
        return false;
    }
}
