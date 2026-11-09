import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class hot22 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> resultList = new ArrayList<Integer>();
        while(list1!=null){
        resultList.add(list1.val);
        list1=list1.next;
        }
        while(list2!=null){
            resultList.add(list2.val);
            list2=list2.next;
        }
        resultList.sort(null);
        ListNode head = IntStream.range(0, resultList.size())
                .map(i -> resultList.size() - 1 - i)          // 倒序下标
                .boxed()
                .reduce(null, (next, i) -> {
                    ListNode node = new ListNode(resultList.get(i));
                    node.next = next;
                    return node;
                }, (a, b) -> a);
        return head;





    }
    }
}
