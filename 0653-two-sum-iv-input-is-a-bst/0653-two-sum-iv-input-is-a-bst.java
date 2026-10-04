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
    private static ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return list;
        }
        list = inorder(root.left, list);
        list.add(root.val);
        list = inorder(root.right, list);
        return list;
    }

    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        list = inorder(root,list);
        int si = 0;
        int ei = list.size()-1;
        while(ei>si){
            int sum = list.get(si)+list.get(ei);
            if(sum == k) return true;
            else if(sum < k) si++;
            else ei--;
        }
        return false;
    }
}