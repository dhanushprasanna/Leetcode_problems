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
    public int height(TreeNode root) {
        return root == null ? 0 : Math.max(height(root.left), height(root.right)) + 1;
    }
    
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        boolean f1 = false;
        boolean f2 = false;
        int lHt = height(root.left);
        int rHt = height(root.right);
        
        if (Math.abs(lHt - rHt) <= 1) {
            f1 = isBalanced(root.left);
            f2 = isBalanced(root.right);
            return f1 && f2;
        } else {
            return false;
        }
    }
}
