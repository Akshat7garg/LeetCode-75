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
    public int count = 0;

    public void findGoods(TreeNode root, int maxVal) {
        if (root == null) return;

        if (root.val >= maxVal) {
            count++;
        }

        findGoods(root.left, Math.max(maxVal, root.val));
        findGoods(root.right, Math.max(maxVal, root.val));
    }

    public int goodNodes(TreeNode root) {
        findGoods(root, root.val);

        return count;
    }
}