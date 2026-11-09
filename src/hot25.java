public class hot25 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode cur=head;
            int length=1;
            while(cur.next!=null){

                length++;
                cur=cur.next;
            }
            cur=head;
            if(length==1) return null;
            if(n==1){
                while(cur.next!=null&&cur.next.next!=null){
                    cur=cur.next;
                }
                cur.next=null;
                cur=head;
            } else if (n==length) {
                head=cur.next;
            } else {
                for(int i=0;i<length-n-1;i++) {
                    if (cur != null) {
                        cur=cur.next;
                    }
                }
                ListNode pre=cur;
                if (cur != null) {
                    cur=cur.next;
                }
                if (pre != null) {
                    if (cur != null) {
                        pre.next=cur.next;
                    }
                }
            }
            return head;
        }
}


