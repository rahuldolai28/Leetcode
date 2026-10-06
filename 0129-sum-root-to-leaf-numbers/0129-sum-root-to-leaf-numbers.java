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
    int ans;

    public void helper(TreeNode root, int prev) {
        if (root == null)
            return;
         prev = prev * 10 + root.val;
        if (root.left == null && root.right == null) {
            ans = ans + prev;
            return;
        }
        helper(root.left, prev);
        helper(root.right, prev);
    }

    public int sumNumbers(TreeNode root) {
        ans = 0;
        helper(root, 0);
        return ans;
    }
}