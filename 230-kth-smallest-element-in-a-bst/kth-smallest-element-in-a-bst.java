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
    public int kthSmallest(TreeNode root, int k) {
    PriorityQueue<Integer> q1 =
        new PriorityQueue<>(Collections.reverseOrder());
      Queue<TreeNode> tq1 = new LinkedList<>();
      tq1.add(root);
      while(!tq1.isEmpty()){
        
        int size=tq1.size();
        for(int i=1;i<=size;i++){
        TreeNode node=tq1.poll();
        q1.add(node.val);
         if(q1.size()>k){
         q1.poll();
          }
if(node.left!=null){
    tq1.add(node.left);
}
if(node.right!=null){
    tq1.add(node.right);
}
        }
}  
   return q1.peek();     
    }
}