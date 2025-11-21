/*
 * Submission: 1757097140
 * Problem: Balanced Binary Tree (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-02 13:59:49 UTC
 * Runtime: N/A
 * Memory: N/A
 */

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
    private int min = 5000;
    private int max = 0;
    public boolean isBalanced(TreeNode root) {
        doi(root,0);
        // System.out.println(max);
        // System.out.println(min);
        return (max-min <= 1);
    }
    private void doi(TreeNode root, int d) {
        if (root == null) return;
        if (root.left == null || root.right == null) {
            max = Math.max(max,d);
            min = Math.min(min,d);
        }
        doi(root.left,d+1);
        doi(root.right,d+1);
    }
}