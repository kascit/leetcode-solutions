/*
 * Submission: 1757202533
 * Problem: Minimum Depth of Binary Tree (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-09-02 15:36:09 UTC
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
    public int minDepth(TreeNode root) {
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