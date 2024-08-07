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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int ans=0;
        while(!q.isEmpty()){
            int sum=0;
            int currentsize=q.size();
            for(int i=0;i<currentsize;i++){
                
                TreeNode curr=q.poll();
                sum+=curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                }   
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            ans=sum;
        }
        return ans;
    }
}