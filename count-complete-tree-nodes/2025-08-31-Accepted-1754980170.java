/*
 * Submission: 1754980170
 * Problem: Count Complete Tree Nodes (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 16:39:40 UTC
 * Runtime: 0 ms
 * Memory: 47.4 MB
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
    public int countNodes(TreeNode root) {
        return doi(root);
    }

    private int doi(TreeNode cur) {
        if (cur == null) return 0;
        return doi(cur.left) + doi(cur.right) + 1;
    }

}