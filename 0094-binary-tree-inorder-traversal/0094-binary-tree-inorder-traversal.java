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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        if(root==null)return ls;
        Stack<TreeNode> st=new Stack<>();
        TreeNode cur=root;
        while(!st.isEmpty() || cur!=null){
            // traverse left most side
            while(cur!=null){
                st.push(cur);
                cur=cur.left;
            }
            // here left is over
            cur=st.pop();
            ls.add(cur.val);
            // nw add right
            cur=cur.right;

        }
        return ls;
        
    }
}