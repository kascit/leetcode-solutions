/*
 * Submission: 1762879176
 * Problem: Minimum Absolute Difference in BST (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 16:40:59 UTC
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
    Integer prev=null;
    int minDiff=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
    }
    public void inOrder(TreeNode root){
        if(root==null)return;
        inOrder(root.left);
        if(prev!=null)minDiff = Math.min(minDiff,root.val-prev);
        prev=root.val;
        inOrder(root.right);
    }
}