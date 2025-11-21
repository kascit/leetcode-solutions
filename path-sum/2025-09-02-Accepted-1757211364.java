/*
 * Submission: 1757211364
 * Problem: Path Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-02 15:44:21 UTC
 * Runtime: 0 ms
 * Memory: 43.6 MB
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
    private int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        this.target = targetSum;
        return doi(root,0);
    }

    private boolean doi(TreeNode cur, int sum) {
        if (sum + cur.val == target && cur.left == null && cur.right == null) return true;
        boolean l = false, r = false;
        if (cur.left != null) {
            l = doi(cur.left,sum+cur.val);
        }
        if (cur.right != null) {
            r = doi(cur.right,sum+cur.val);
        }
        return l || r;
    }
}