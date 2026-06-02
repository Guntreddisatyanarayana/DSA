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
     int ps=0;
        int ts=0;
    public int sumNumbers(TreeNode root) {
          if(root==null){
            return 0;
        }
    
        ps=ps*10+root.val;
        if(root.left==null && root.right ==null){
           ts+=ps;
            ps=ps/10;
            return ts;
        }
         sumNumbers(root.left);
         sumNumbers(root.right);
          ps=ps/10;
        return ts;
      
    }
    
}