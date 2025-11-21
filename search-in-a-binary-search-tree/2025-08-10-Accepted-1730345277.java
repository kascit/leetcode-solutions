/*
 * Submission: 1730345277
 * Problem: Search in a Binary Search Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 16:48:34 UTC
 * Runtime: 0 ms
 * Memory: 45.3 MB
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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (root.val > val) return searchBST(root.left,val);
        else return searchBST(root.right,val);
    }
}