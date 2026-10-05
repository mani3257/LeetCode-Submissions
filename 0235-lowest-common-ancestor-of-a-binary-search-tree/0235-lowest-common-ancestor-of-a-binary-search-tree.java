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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null )return root;
        //if p,q are less then root.val then move left side
        if(p.val<root.val && root.val>q.val)return lowestCommonAncestor(root.left,p,q);
        // if p,q are greater than root.val thrn move right side
        if(p.val>root.val && root.val<q.val)return lowestCommonAncestor(root.right,p,q);
        // return root
        return root;
        
        
    }
}