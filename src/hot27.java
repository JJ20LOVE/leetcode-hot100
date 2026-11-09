import java.util.HashMap;

public class hot27 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public Node copyRandomList(Node head) {

        if(head==null) return head;
        HashMap<Node, Node> map = new HashMap<>();
        for(Node cur=head; cur!=null;cur=cur.next){
            map.put(cur,new Node(cur.val));
        }
        for(Node cur=head; cur!=null;cur=cur.next){
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
        }
        return map.get(head);


    }
}

