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
    public void helper(TreeNode root,int prev, List<Integer> list){
        if(root == null ) return;
        int num = prev*10 + root.val;
        if(root.left == null && root.right == null){
            list.add(num);
            return;
        }
        helper(root.left,num,list);
        helper(root.right,num,list);
    }
    public int sumNumbers(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root,0, list);
        int ans = 0;
        for(int i = 0 ; i< list.size(); i++){
            ans = ans + list.get(i);
        }
        return ans;
    }
}