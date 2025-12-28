/*
 * Submission: 1730272839
 * Problem: Evaluate Boolean Binary Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 15:38:46 UTC
 * Runtime: 0 ms
 * Memory: 44.2 MB
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
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) return root.val == 1;
        if (root.val == 2) return evaluateTree(root.left) || evaluateTree(root.right);
        if (root.val == 3) return evaluateTree(root.left) && evaluateTree(root.right);
        return false;
    }
}