/*
 * Submission: 1738900381
 * Problem: Invert Binary Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 18:58:29 UTC
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
    public TreeNode invertTree(TreeNode root) {
        doit(root);
        return root;
    }

    private void doit(TreeNode curr){
        if (curr == null) return;
        TreeNode r = null, l = null;
        if (curr.left != null) r = curr.left;
        if (curr.right != null) l = curr.right;
        curr.right = r;
        curr.left = l;
        doit(curr.right);
        doit(curr.left);
        return;
    }
}