/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int findDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = findDepth(root.left);
        int rightDepth = findDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public int maxDepth(TreeNode root) {
        return findDepth(root);
    }
}