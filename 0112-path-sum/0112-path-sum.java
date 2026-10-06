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
    public boolean helper(TreeNode root, int prev, int target){
        if(root == null ) return false;
        int sum = root.val+prev;
        if(sum == target && root.left == null && root.right == null) return true;
        return helper(root.left,sum,target) || helper(root.right,sum , target);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, 0, targetSum);
    }
}