/*
 * Submission: 1835954017
 * Problem: Subtree of Another Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 11:39:27 UTC
 * Runtime: 2 ms
 * Memory: 46.4 MB
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (isEQ(root,subRoot)) return true;
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    boolean isEQ(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;
        if (root.val != subRoot.val) {
            return false;
        }
        return isEQ(root.left,subRoot.left) && isEQ(root.right,subRoot.right);
    }
}