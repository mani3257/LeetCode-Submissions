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
    int d=0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        d=0;
        maxDia(root);
        return d;
        
    }
    int maxDia(TreeNode root)
    {
        
        if(root==null)return 0;
        int l=maxDia(root.left);
        int r=maxDia(root.right);
        d= Math.max(l+r,d);
        return Math.max(l,r)+1;
        
        
    }
}