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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode track = head;
        ListNode prev = head.next;
        ListNode curr = head.next.next;

        while (curr != null) {
            prev.next = curr.next;
            curr.next = track.next;
            track.next = curr;

            track = track.next;
            prev = prev.next;

            if (prev != null) {
                curr = prev.next;
            } else {
                break;
            }
        }

        return head;
    }
}