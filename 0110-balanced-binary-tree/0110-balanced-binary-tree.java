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

    public int checkBalanced(TreeNode root, int depth){
        if(root == null ) return depth;
        int left = checkBalanced(root.left,depth+1);
        int right  = checkBalanced(root.right,depth+1);
        int diff = Math.abs(right-left);
        System.out.println(diff);
        
        if(diff > 1){
            return -1;
        }else{
            return Math.max(left,right);
        }
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int diff = checkBalanced(root,1);
        System.out.println(diff);
        if(diff == -1){
            return false;
        }
        return true;
    }
}