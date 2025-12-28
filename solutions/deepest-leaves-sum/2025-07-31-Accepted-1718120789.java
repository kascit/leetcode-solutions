/*
 * Submission: 1718120789
 * Problem: Deepest Leaves Sum (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-31 09:12:13 UTC
 * Runtime: 1 ms
 * Memory: 47.4 MB
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
    int max = 0, maxSum = 0;
    public int deepestLeavesSum(TreeNode root) {
        doit(root, 0);
        return maxSum;
    }
    public void doit(TreeNode curr, int idx){
        if (curr == null) return;
        if (idx > max){
            max = idx;
            maxSum = 0;
            maxSum += curr.val;
        } else if (idx == max) {
            maxSum += curr.val;
        }
        doit(curr.left, idx+1);
        doit(curr.right,idx + 1);
        return;
    }
}