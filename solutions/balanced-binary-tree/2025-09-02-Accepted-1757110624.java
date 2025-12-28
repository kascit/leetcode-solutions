/*
 * Submission: 1757110624
 * Problem: Balanced Binary Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-02 14:12:02 UTC
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

    public boolean isBalanced(TreeNode root) {
        return (doi(root) < 5005);
    }
    private int doi(TreeNode root) {
        if (root == null) return 0;
        int l = doi(root.left);
        int r = doi(root.right);
        if (Math.abs(l-r) > 1) return 5005;
        return Math.max(l,r) + 1;
    }
}