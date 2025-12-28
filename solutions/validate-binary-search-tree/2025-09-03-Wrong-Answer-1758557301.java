/*
 * Submission: 1758557301
 * Problem: Validate Binary Search Tree (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-03 18:14:04 UTC
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
    public boolean isValidBST(TreeNode root) {
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);
        return val(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean val(TreeNode cur, int greaterThan, int lesserThan) {
        if (cur == null) return true;
        if (cur.val < greaterThan || cur.val > lesserThan) return false;
        return val(cur.left,greaterThan,cur.val - 1) && val(cur.right,cur.val+1,lesserThan);
    }
}