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
    boolean ans;

    public int checkBalanced(TreeNode root){
        if(root == null ) return 0;
        int left = checkBalanced(root.left);
        int right = checkBalanced(root.right);
        if(left == -1 || right == -1) return -1;
        int diff = Math.abs(left-right);
        if(diff>1) return -1;
        return Math.max(left,right) +1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int diff = checkBalanced(root);
       
        if(diff == -1){
            return false;
        }
        return true;
    }
}