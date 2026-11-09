import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class hot19 {
    public static void main(String[] args) {


    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public class Solution {
        public boolean isPalindrome(ListNode head) {

            ListNode current = head;

            List<Object> results = new ArrayList<>();
            while(current!= null){

                results.add(current.val);
                current=current.next;
            }
            List<Object> results2= new ArrayList<>(results);
            Collections.reverse(results);
            if(results2.equals(results)) return true;
            return false;
        }
    }
}
