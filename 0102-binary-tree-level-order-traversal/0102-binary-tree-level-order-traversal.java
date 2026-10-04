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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //basically level order traversal is bredth first search(BFS)
        List<List<Integer>>ls=new ArrayList<>();
        if(root==null)return ls;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> level=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                TreeNode curNode=q.poll();
                level.add(curNode.val);
                if(curNode.left!=null){
                    q.offer(curNode.left);
                }
                if(curNode.right!=null){
                    q.offer(curNode.right);
                }
            }
            ls.add(level);
        }
        return ls;
        
    }
}