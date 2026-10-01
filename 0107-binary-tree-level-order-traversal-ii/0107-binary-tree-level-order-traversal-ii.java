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
        List<List<Integer>> ans = new ArrayList<>();
        solve(root, ans, 0);
        Collections.reverse(ans);
        return ans;
    }

    public static void solve(TreeNode root, List<List<Integer>> ans, int level) {
        if (root == null)
            return;
        if (ans.size() <= level)
            ans.add(new ArrayList<>());
        ans.get(level).add(root.val);
        solve(root.left, ans, level + 1);
        solve(root.right, ans, level + 1);

    }
}