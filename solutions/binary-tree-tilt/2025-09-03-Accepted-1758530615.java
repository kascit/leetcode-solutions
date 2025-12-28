/*
 * Submission: 1758530615
 * Problem: Binary Tree Tilt (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 17:53:19 UTC
 * Runtime: 0 ms
 * Memory: 44.8 MB
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
    int ans = 0;
    public int findTilt(TreeNode root) {
        dud(root);
        return ans;
    }
    private int dud(TreeNode cur) {
        if (cur == null) return 0;
        if (cur.left == null && cur.right == null) return cur.val;
        int l = 0, r = 0;
        if (cur.left != null) l = dud(cur.left);
        if (cur.right != null) r = dud(cur.right);
        ans += Math.abs(l-r);
        // dud(cur.left);
        // dud(cur.right);
        return cur.val + l + r;
    }
}