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
    public static boolean find(TreeNode root, HashMap<Integer, Integer> hm, int k){
        if(root == null ){
            return false;
        }
        int c = k-root.val;
        if(hm.containsKey(c)){
            return true;
        }
        hm.put(root.val,0);
        boolean left = find(root.left,hm,k);
        boolean right = find(root.right,hm,k);
        return left || right ;
    }
    public boolean findTarget(TreeNode root, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        return find(root,hm,k);
    }
}