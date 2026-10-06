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
    ArrayList<TreeNode> list = new ArrayList<>();

    public void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        list.add(root);
        inorder(root.right);

    }

    public void swap(ArrayList<TreeNode> list) {
        int i = 0;
        TreeNode first = null;
        TreeNode second = null;
        for (; i < list.size() - 1; i++) {
            if (list.get(i).val > list.get(i + 1).val) {
                if (first == null) {
                    first = list.get(i);
                }
                second = list.get(i + 1);
            }
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public void recoverTree(TreeNode root) {
        inorder(root);
        swap(list);
    }
}