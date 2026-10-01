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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
          List<List<Integer>> ans = new ArrayList<>();
        ans =  solve(ans, 0, root);
        for(int i = 0 ; i<ans.size(); i++){
            if(i%2 != 0 ){
                List<Integer> temp = ans.get(i);
                Collections.reverse(temp);
            }
        }
        return ans;
    }

    static List<List<Integer>> solve (List<List<Integer>> ans, int level, TreeNode root) {
        if (root==null) return ans;
        if (ans.size() <= level) ans.add(new ArrayList<>());
        ans.get(level).add(root.val);
        ans=solve(ans, level+1, root.left);
        ans=solve(ans, level+1, root.right);
        return ans;
    }
}