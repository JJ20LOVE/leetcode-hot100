public class hot18 {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {

        ListNode listNode = new ListNode();
        ListNode preNode= head;
        ListNode currentNode= head.next;
        while(currentNode!=null){
            ListNode temp = currentNode.next;
            currentNode.next=preNode;
            if(preNode==head) preNode.next=null;
            preNode=currentNode;
            currentNode=temp;
        }
        return preNode;
    }



      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
