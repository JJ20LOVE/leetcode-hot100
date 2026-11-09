public class hot23 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode dummy = new ListNode(0);
            ListNode cur = dummy;
            int carry = 0;                       // 进位放在循环外面，跨轮保留

            while (l1 != null || l2 != null || carry != 0) {   // carry != 0 处理最后的进位
                int x = (l1 != null) ? l1.val : 0;
                int y = (l2 != null) ? l2.val : 0;
                int sum = x + y + carry;

                carry = sum / 10;
                cur.next = new ListNode(sum % 10);
                cur = cur.next;

                if (l1 != null) l1 = l1.next;    // 指针后移
                if (l2 != null) l2 = l2.next;
            }
            return dummy.next;
        }
        }

    }
