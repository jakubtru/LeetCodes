package LeetCode;

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
    public ListNode mergeKLists(ListNode[] lists) {
        boolean isFirst = true;
        boolean areNotEmpty = false;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                areNotEmpty = true;
            }
        }
        if (lists.length == 0 || !areNotEmpty) {
            return null;
        }
        ListNode list = new ListNode();
        ListNode head = list;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                areNotEmpty = true;
            }
        }

        while (areNotEmpty) {
            if (!isFirst) {
                list.next = new ListNode();
                list = list.next;
            }
            System.out.println("X");
            list.val = 10000;
            int counter = 0;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (lists[i].val < list.val) {
                        list.val = lists[i].val;
                        counter = i;
                    }
                }
            }
            lists[counter] = lists[counter].next;
            areNotEmpty = false;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    areNotEmpty = true;
                }
            }
            isFirst = false;
        }
        return head;
    }
}
