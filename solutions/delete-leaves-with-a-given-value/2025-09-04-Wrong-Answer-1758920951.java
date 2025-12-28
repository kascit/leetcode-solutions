/*
 * Submission: 1758920951
 * Problem: Delete Leaves With a Given Value (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-04 04:23:15 UTC
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
    int delete;
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        this.delete = target;
        dos(root);
        return root;
    }
    private boolean dost(TreeNode cur) {
        if (cur == null) return false;
        if (cur.left == null && cur.right == null) {
            if (cur.val == delete) {
                return true;
            }
        }
        return false;
    }
    private void dos(TreeNode cur) {
        if (cur == null) return;
        dos(cur.left);
        if (dost(cur.left)) cur.left = null;
        dos(cur.right);
        if (dost(cur.right)) cur.right = null;
    }
}