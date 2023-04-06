/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode list = head;
        int counter = 1;
        if (head == null || head.next == null) {
            return head;
        }
        while (list.next != null) {
            counter++;
            list = list.next;
        }
        list.next = head;
        for (int i = 0; i < counter - (k % counter); i++) {
            head = head.next;
        }
        ListNode result = new ListNode();
        ListNode copy = result;
        result.val = head.val;
        head = head.next;

        for (int i = 0; i < counter - 1; i++) {
            result.next = new ListNode();
            result.next.val = head.val;
            result = result.next;
            head = head.next;
        }


        return copy;
    }
}
