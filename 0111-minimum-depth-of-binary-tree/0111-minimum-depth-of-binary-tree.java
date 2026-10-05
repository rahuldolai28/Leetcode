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
    static int min;

    public static void findDepth(TreeNode root, int c) {
        if (root == null) {
            return;
        }
        if(c>=min) return ;
        if (root.left == null && root.right == null) {
            min = Math.min(c, min);
            return;
        }
        findDepth(root.left, c + 1);
        findDepth(root.right, c + 1);
    }

    public int minDepth(TreeNode root) {
        min = Integer.MAX_VALUE;
        if(root == null) return 0;
        findDepth(root, 1);
        return min;
    }
}