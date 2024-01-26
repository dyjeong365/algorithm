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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> sequence1 = new ArrayList<>();
        List<Integer> sequence2 = new ArrayList<>();
        
        dfs(root1, sequence1);
        dfs(root2, sequence2);
        
        return sequence1.equals(sequence2);
    }
    
    private void dfs (TreeNode root, List<Integer> sequence) {
        if(root == null) {
            return;
        }
        
        if(root.left == null && root.right == null) {
            sequence.add(root.val);
            return;
        }
        
        dfs(root.left, sequence);
        dfs(root.right, sequence);
    }
}