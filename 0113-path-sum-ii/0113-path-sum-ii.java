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
    public void helper(TreeNode root, int prev, int target,  List<Integer> list, List<List<Integer>> mainList) {
        if (root == null)
            return;
        list.add(root.val);
        int sum = root.val + prev;
        if (sum == target && root.left == null && root.right == null) {
           mainList.add(new ArrayList<>(list));
        }

        helper(root.left, sum, target,list,mainList);
        helper(root.right, sum, target,list,mainList);

        list.remove(list.size() - 1);

    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(root, 0, targetSum, list, mainList);
        return mainList;
    }
}