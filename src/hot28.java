import java.sql.Array;
import java.util.ArrayList;

public class hot28 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode sortList(ListNode head) {

        if(head==null) return null;
        ListNode cur=head;
        ArrayList<Integer> results = new ArrayList<>();
        while(cur!=null){
            results.add(cur.val);
            cur=cur.next;
        }
        results.sort(null);
        ListNode now= new ListNode(results.get(0));
        ListNode listNode=now;
        for(int i=0;i<results.size()-1;i++){
            ListNode fresh= new ListNode(results.get(i+1));
            listNode.next=fresh;
            listNode=listNode.next;
        }
        return now;
    }
}
