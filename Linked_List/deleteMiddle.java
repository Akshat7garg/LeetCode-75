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

    /**
     * Deletes the middle node of a singly linked list.
     *
     * If the list has only one node, it returns null.
     * Otherwise, it removes the exact middle node.
     *
     * Middle node is defined as:
     * - For odd-length lists: the middle element
     * - For even-length lists: the second of the two middle elements
     *
     * Uses the slow and fast pointer approach:
     * - slow pointer moves one step at a time
     * - fast pointer moves two steps at a time
     * When fast reaches the end, slow will be at the middle
     *
     * Example:
     * Input: head = [1, 2, 3, 4, 5]
     * Output: [1, 2, 4, 5]
     */
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // If list is empty or has only one node, return null
        }

        ListNode finalList = null; // Will point to the node just before the middle
        ListNode slowMove = head;  // Moves one step at a time
        ListNode fastMove = head;  // Moves two steps at a time

        // Move slow and fast pointers to find the middle node
        while (fastMove != null && fastMove.next != null) {
            finalList = slowMove;         // Keep track of node before slow
            slowMove = slowMove.next;     // Move slow by 1
            fastMove = fastMove.next.next; // Move fast by 2
        }

        // Remove the middle node by skipping it
        finalList.next = slowMove.next;

        return head; // Return the head of the modified list
    }
}
