/*
 * Submission: 1758925046
 * Problem: Delete Leaves With a Given Value (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 04:27:53 UTC
 * Runtime: 0 ms
 * Memory: 44.5 MB
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
        TreeNode d = new TreeNode(-1);
        d.right = root;
        dos(d);
        return d.right;
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
        // if (dost(cur)) cur = null;
    }
}