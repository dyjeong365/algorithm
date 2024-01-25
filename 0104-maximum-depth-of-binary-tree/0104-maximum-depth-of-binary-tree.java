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
    public int maxDepth(TreeNode root) {
        int max = 0;
        max = dfs(root, max);
        
        return max;
    }
    
    private int dfs(TreeNode root, int count) {
        if(root == null) {
            return count;
        }
        
        count++;
        
        return Integer.max(dfs(root.left, count), dfs(root.right, count));
    }
}