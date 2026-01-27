public class ll_cycle_det_II {
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        int len = 0;

        // Step 1: Detect cycle and get length
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                len = cycleLength(slow);
                break;
            }
        }

        if (len == 0) return null; // no cycle

        // Step 2: Find start of cycle
        ListNode p1 = head;
        ListNode p2 = head;

        // move p2 ahead by cycle length
        while (len > 0) {
            p2 = p2.next;
            len--;
        }

        // move both until they meet
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1; // cycle start
    }

    private int cycleLength(ListNode slow) {
        ListNode fast = slow;
        int length = 0;

        do {
            fast = fast.next;
            length++;
        } while (fast != slow);

        return length;
    }
}

