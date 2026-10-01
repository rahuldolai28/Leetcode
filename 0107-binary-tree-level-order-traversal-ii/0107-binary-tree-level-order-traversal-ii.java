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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans =  new ArrayList<>();
        ans =  solve(root,ans,0);
        Collections.reverse(ans);
        return ans;
    }

    public static List<List<Integer>> solve(TreeNode root, List<List<Integer>> ans, int level) {
        if (root == null)
            return ans;
        if (ans.size() <= level)
            ans.add(new ArrayList<>());

        ans = solve(root.left, ans, level + 1);
        ans = solve(root.right, ans, level + 1);
        ans.get(level).add(root.val);
        return ans;
    }
}