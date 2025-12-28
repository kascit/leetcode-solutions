/*
 * Submission: 1757203126
 * Problem: Minimum Depth of Binary Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-02 15:36:40 UTC
 * Runtime: 1 ms
 * Memory: 63.4 MB
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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int d = 1;
        while(!q.isEmpty()) {
            int size = q.size();
            while (size-->0) {
                TreeNode cur = q.poll();
                if (cur.left == null && cur.right == null) {
                    return d;
                }
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            d++;
        }
        return d;
    }

    
}