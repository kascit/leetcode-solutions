/*
 * Submission: 1758514853
 * Problem: Diameter of Binary Tree (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-03 17:41:13 UTC
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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        return brum(root.left) + brum(root.right);
    }
    private int brum(TreeNode cur) {
        if (cur==null) return 0;
        int l = brum(cur.left);
        int r = brum(cur.right);
        return Math.max(l,r) + 1;
    }


}