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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)return false;
        return same(root,subRoot) || isSubtree(root.left,subRoot)|| isSubtree(root.right,subRoot);
        
    }
    boolean same(TreeNode subNode,TreeNode Node){
        if(subNode==null && Node==null)return true;
        if(subNode==null || Node==null)return false;
        return (subNode.val==Node.val)&&same(subNode.left,Node.left)&&same(subNode.right,Node.right);
        
    }
    
}