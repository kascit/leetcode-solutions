/*
 * Submission: 1758564125
 * Problem: Validate Binary Search Tree (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 18:19:24 UTC
 * Runtime: 0 ms
 * Memory: 43.6 MB
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

    private boolean val(TreeNode cur, long greaterThan, long lesserThan) {
        if (cur == null) return true;
        if (cur.val < greaterThan || cur.val > lesserThan) return false;
        // System.out.println((long)cur.val - 1);
        return val(cur.left,greaterThan,(long)cur.val - 1) && val(cur.right,(long)cur.val+1,lesserThan);
    }
}