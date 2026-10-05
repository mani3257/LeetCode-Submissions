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
        while(cur!=null || !st.isEmpty()){
            while(cur!=null){
                st.push(cur);
                cur=cur.left;
            }
            // all left are over at this time
            cur=st.pop();
            ls.add(cur.val);
            //and move right
            cur=cur.right;
        }
        return ls;
        
    }
}