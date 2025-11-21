/*
 * Submission: 1762874078
 * Problem: Minimum Distance Between BST Nodes (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-07 16:36:07 UTC
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
    int min = 100000;
    public int minDiffInBST(TreeNode root) {
        dost(root);
        return min;
    }
    private void dost(TreeNode cur) {
        if (cur == null || min == 1) return;
        if (cur.left != null ) {
            min = Math.min(min,cur.val-cur.left.val);
            dost(cur.left);
        }
        if (cur.right != null ) {
            min = Math.min(min,cur.right.val-cur.val);
            dost(cur.right);
        }
    }
}