/*
 * Submission: 1738905053
 * Problem: Merge Two Binary Trees (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 19:03:43 UTC
 * Runtime: 0 ms
 * Memory: 45 MB
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
    public TreeNode mergeTrees(TreeNode r1, TreeNode r2) {
        return doit(r1,r2);
        
    }

    private TreeNode doit(TreeNode l, TreeNode r){
        if (l == null && r == null) return null;
        if (l == null) return r;
        if (r == null) return l;
        TreeNode head = new TreeNode(l.val+r.val);
        head.left = doit(l.left,r.left);
        head.right = doit(l.right,r.right);
        return head;

    }
}