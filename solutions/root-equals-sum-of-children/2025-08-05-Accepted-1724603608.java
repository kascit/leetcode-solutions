/*
 * Submission: 1724603608
 * Problem: Root Equals Sum of Children (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 16:11:47 UTC
 * Runtime: 0 ms
 * Memory: 41.2 MB
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
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}