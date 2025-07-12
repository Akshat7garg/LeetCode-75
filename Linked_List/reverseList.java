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
    public ListNode reverseList(ListNode head) {
        // 'revNode' will become the new head of the reversed list
        ListNode revNode = null;
        // 'currNode' is the pointer used to traverse the original list
        ListNode currNode = head;

        // Traverse through the list
        while (currNode != null) {
            // Save the next node before changing the pointer
            ListNode nextNode = currNode.next;

            // Reverse the link: point current node to the reversed list's head
            currNode.next = revNode;

            // Move 'revNode' one step forward to include current node
            revNode = currNode;

            // Move to the next node in the original list
            currNode = nextNode;
        }

        // Return the head of the reversed list
        return revNode;
    }
}
