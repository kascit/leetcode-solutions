/*
 * Submission: 1758490903
 * Problem: Univalued Binary Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 17:22:52 UTC
 * Runtime: 0 ms
 * Memory: 41.4 MB
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
    int val;
    public boolean isUnivalTree(TreeNode root) {
        this.val = root.val;
        return brrr(root);
    }
    private boolean brrr(TreeNode cur) {
        if (cur.val != this.val) return false;
        boolean l = true, r = true;
        if (cur.left != null) {
            l = brrr(cur.left);
        }
        if (cur.right != null) {
            r = brrr(cur.right);
        }
        return l & r;
    }
}