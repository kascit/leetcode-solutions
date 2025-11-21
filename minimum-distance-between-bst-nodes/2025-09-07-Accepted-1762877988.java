/*
 * Submission: 1762877988
 * Problem: Minimum Distance Between BST Nodes (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 16:39:53 UTC
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
    int min = 100000, prev = -1;
    public int minDiffInBST(TreeNode root) {
        dost(root);
        return min;
    }
    private void dost(TreeNode cur) {
        if (cur == null || min == 1) return;
        if (cur.left != null ) {
            // min = Math.min(min,cur.val-cur.left.val);
            dost(cur.left);
        }
        frnd(cur.val);
        if (cur.right != null ) {
            // min = Math.min(min,cur.right.val-cur.val);
            dost(cur.right);
        }
    }

    private void frnd (int val) {
        if (prev == -1) {
            prev = val;
            return;
        }
        min = Math.min(min,val-prev);
        prev = val;
    }
}