/*
 * Submission: 1718107457
 * Problem: Count Nodes Equal to Average of Subtree (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-31 08:59:00 UTC
 * Runtime: 1 ms
 * Memory: 44 MB
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
    int count;

    int[] rec(TreeNode root){
        if (root == null) return new int[] {0,0};
        int[] right = rec(root.left);
        int[] left = rec(root.right);
        int sum = root.val + right[0] + left[0];
        int num = 1 + right[1] + left[1];
        // if (sum)
        if (root.val == sum/num) count++;
        return new int[] {sum,num};
    }
    public int averageOfSubtree(TreeNode root) {
        rec(root);
        return count;
    }
}