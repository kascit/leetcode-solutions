/*
 * Submission: 1832121941
 * Problem: Cousins in Binary Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 08:43:05 UTC
 * Runtime: 0 ms
 * Memory: 43.1 MB
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
    int px, py, dx, dy;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, null, 0, x, y);
        return dx == dy && px != py;
    }

    void dfs(TreeNode n, TreeNode p, int d, int x, int y) {
        if (n == null) return;

        if (n.val == x) { px = p == null ? -1 : p.val; dx = d; }
        if (n.val == y) { py = p == null ? -1 : p.val; dy = d; }

        dfs(n.left, n, d + 1, x, y);
        dfs(n.right, n, d + 1, x, y);
    }
}
