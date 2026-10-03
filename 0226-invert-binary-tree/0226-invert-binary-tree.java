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
    public TreeNode invertTree(TreeNode root) {

        if(root==null)return null;
        //1. swap
        TreeNode swap=root.left;
        root.left=root.right;
        root.right=swap;
        //2. traverse left &  right
        invertTree(root.left);
        invertTree(root.right);
        // return invert (swapped)root
        return root;
        
        
    }
}