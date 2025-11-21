/*
 * Submission: 1724488547
 * Problem: Range Sum of BST (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 14:38:59 UTC
 * Runtime: 0 ms
 * Memory: 51.6 MB
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
    int ans = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        dot(root,low,high);
        return ans;
    }

    void dot(TreeNode root, int low, int high){
        if (root == null) return;
        int cur = root.val;
        if (cur >= low && cur <= high){
            ans += cur;
        }
        if (cur <= high){
            
            dot(root.right,low,high);
            // dot(root.right,low,high);
        } 
        if (cur >= low){
            
            // dot(root.left,low,high);
            dot(root.left,low,high);
        }

    }
}