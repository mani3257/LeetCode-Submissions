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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ls=new ArrayList<>();
        if(root==null)return ls;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curNode=q.poll();
                //only add the right side element
                //here n-1 is last index (in 2 nodes last index is right index)
                if(i==n-1)ls.add(curNode.val);
                if(curNode.left!=null){
                    q.offer(curNode.left);
                }
                if(curNode.right!=null){
                    q.offer(curNode.right);
                }
            }

            


        }
        return ls;
        
    }
}