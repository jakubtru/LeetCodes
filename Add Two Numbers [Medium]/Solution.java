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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;
        int rest = 0;
        boolean first = true;

        while (l1 != null || l2 != null) {
            if (!first) {
                result.next = new ListNode();
                result = result.next;
            }
            first = false;
            int a = 0, b = 0, sum = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }
            sum = a + b + rest;
            if (sum > 9) {
                rest = sum / 10;
                sum = sum % 10;
            } else {
                rest = 0;
            }
            result.val = sum;
        }

        if (rest > 0) {
            result.next = new ListNode();
            result = result.next;
            result.val = rest;
        }

        return head;
    }
}
