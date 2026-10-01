/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private boolean findPath(TreeNode root, TreeNode x ,  List<TreeNode> list){
        if(root==null){
            return false;
        }
        list.add(root);
        if(root.val == x.val){
            return true;
        }
        boolean left = findPath(root.left, x, list);
        boolean right = findPath(root.right, x, list);
        if(left || right) return true;
        list.remove(list.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();
        findPath(root,p, list1);
        findPath(root,q, list2);

        //compare path
        TreeNode temp = root;
        for(int i = 0; i< list1.size() && i<list2.size(); i++){
            if(list1.get(i).val != list2.get(i).val ){
                break;
            }
            temp = list1.get(i);
        } 


        return temp;
    }
}