/*
 * Submission: 1755010170
 * Problem: Sum of Left Leaves (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 17:05:41 UTC
 * Runtime: 0 ms
 * Memory: 41.3 MB
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
    public int sumOfLeftLeaves(TreeNode root) {
        return doi(root,false);
    }
    private int doi(TreeNode cur, Boolean isLeft) {
        if (cur == null) return 0;
        if (isLeft && cur.left == null && cur.right == null) {
            return cur.val;
        }
        return doi(cur.left,true) + doi(cur.right,false);
    }
}