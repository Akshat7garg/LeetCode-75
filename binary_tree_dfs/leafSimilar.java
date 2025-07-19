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
    public ArrayList<Integer> leaf = new ArrayList<>();
    public int index = 0;

    public void findLeaf(TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            leaf.add(root.val);
            return;
        }

        findLeaf(root.left);
        findLeaf(root.right);
    }

    public boolean validateLeaf(TreeNode root) {
        if (root == null)
            return true;
        if (index == leaf.size())
            return false;

        if (root.left == null && root.right == null) {
            if (root.val == leaf.get(index)) {
                index++;
                return true;
            } else {
                return false;
            }
        }

        if (!validateLeaf(root.left) || !validateLeaf(root.right)) {
            return false;
        }

        return true;
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        findLeaf(root1);

        if (validateLeaf(root2) && index == leaf.size()) {
            return true;
        }
        return  false;
    }
}