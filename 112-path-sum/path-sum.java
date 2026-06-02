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

    int pathsum = 0;

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        // Add current node value to path sum
        pathsum += root.val;

        // Check only at leaf node
        if (root.left == null && root.right == null) {

            if (pathsum == targetSum) {
                return true;
            }

            // Backtrack before returning
            pathsum -= root.val;
            return false;
        }

        // Search in left and right subtrees
        boolean left = hasPathSum(root.left, targetSum);
        boolean right = hasPathSum(root.right, targetSum);

        // Backtrack
        pathsum -= root.val;

        return left || right;
    }
}