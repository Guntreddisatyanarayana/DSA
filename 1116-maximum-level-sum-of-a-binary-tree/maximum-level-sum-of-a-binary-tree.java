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
    public int maxLevelSum(TreeNode root) {
        Queue <TreeNode> q1=new LinkedList<>();
        q1.offer(root);
        int prevl=0;
        int max=Integer.MIN_VALUE;
        int preslev=0;
        int sum;
        while(!q1.isEmpty()){
            int size=q1.size();
            sum=0;
            preslev++;
            for(int i=0;i<size;i++){
                 TreeNode node=q1.poll();
                
                sum+=node.val;
                if(node.left != null){
                    q1.offer(node.left);

                }
                if(node.right != null){
                    q1.offer(node.right);

                }
            }
               if(sum>max){
                max=sum;
                prevl=preslev;
               }
            

        }
        return prevl;
    }
}