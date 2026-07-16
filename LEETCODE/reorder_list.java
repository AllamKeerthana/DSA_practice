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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode cur = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode fut = null;

        while(cur!=null){
            fut = cur.next;
            cur.next=prev;
            prev = cur;
            cur = fut;
        }
        ListNode head2 = prev;
        while(head!=null &&head2!=null){
            ListNode temp = head.next;
            head.next = head2;
            head = head.next;
            head2=head2.next;
            head.next = temp;
            head = head.next;
            
        }
        
        
    }
}