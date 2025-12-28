/*
 * Submission: 1758520522
 * Problem: Diameter of Binary Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 17:45:29 UTC
 * Runtime: 0 ms
 * Memory: 44.7 MB
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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        brum(root);
        return max;
    }
    private int brum(TreeNode cur) {
        if (cur==null) return 0;
        int l = brum(cur.left);
        int r = brum(cur.right);
        max = Math.max(max,l+r);
        return Math.max(l,r) + 1;
    }


}