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
    
    public void help(List<Integer> lt,TreeNode root1){
        if(root1==null){
            return ;
        }
        help(lt,root1.left);
        lt.add(root1.val);
        help(lt,root1.right);
    }
    public void help1(List<Integer>lt,TreeNode root2){
        if(root2==null){
            return ;
        }
        help1(lt,root2.left);
        lt.add(root2.val);
        help1(lt,root2.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>lt=new ArrayList<>();
        help(lt,root1);
        help1(lt,root2);
        Collections.sort(lt);
        return lt;
    }
}