/*
 * Submission: 1758494276
 * Problem: Same Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 17:25:27 UTC
 * Runtime: 0 ms
 * Memory: 41 MB
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return br(p,q);
    }
    private boolean br(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return br(p.left,q.left) && br(p.right,q.right);
    }
}