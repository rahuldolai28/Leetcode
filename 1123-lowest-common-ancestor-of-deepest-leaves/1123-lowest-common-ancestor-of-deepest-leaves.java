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
    static class Info {
        int depth;
        TreeNode node;

        Info(int depth, TreeNode node) {
            this.depth = depth;
            this.node = node;
        }
    }

    private Info findDeepest(TreeNode root) {
        if (root == null) {
            return new Info(0, null);
        }

        Info left = findDeepest(root.left);
        Info right = findDeepest(root.right);

        if (left.depth > right.depth) {
            return new Info(left.depth + 1, left.node);
        }

        if (right.depth > left.depth) {
            return new Info(right.depth + 1, right.node);
        }

        return new Info(left.depth + 1, root);
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        Info lca = findDeepest(root);
        return lca.node;
    }
}