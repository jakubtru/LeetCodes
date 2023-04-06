/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ArrayList<ListNode> visited = new ArrayList<>();
        if (head != null) {
            visited.add(head);
            while (head.next != null) {
                if (visited.contains(head.next)) {
                    return head.next;
                } else {
                    visited.add(head.next);
                    head = head.next;
                }
            }
        }
        return null;
    }
}
