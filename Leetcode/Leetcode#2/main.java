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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remaining = 0;
        ListNode r = new ListNode();
        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode current = r;
        ListNode prev = null;
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + remaining;
            l1 = l1.next;
            l2 = l2.next;

            remaining = 0;
            if (val >= 10) {
                val = val % 10;
                remaining++;
            }
            current.val = val;
            current.next = new ListNode();
            prev = current;
            current = current.next;
        }

        while (l1 != null) {
            int val = l1.val + remaining;
            l1 = l1.next;

            remaining = 0;
            if (val >= 10) {
                val = val % 10;
                remaining++;
            }
            current.val = val;
            current.next = new ListNode();
            prev = current;
            current = current.next;
        }

        while (l2 != null) {
            int val = l2.val + remaining;
            l2 = l2.next;

            remaining = 0;
            if (val >= 10) {
                val = val % 10;
                remaining++;
            }
            current.val = val;
            current.next = new ListNode();
            prev = current;
            current = current.next;
        }

        if (remaining == 1) {
            current.val = 1;
        } else {
            prev.next = null;
        }

        return r;
    }
}