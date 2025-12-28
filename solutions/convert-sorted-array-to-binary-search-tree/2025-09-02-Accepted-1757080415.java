/*
 * Submission: 1757080415
 * Problem: Convert Sorted Array to Binary Search Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-02 13:44:17 UTC
 * Runtime: 0 ms
 * Memory: 43.1 MB
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
    private int[] nums;
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return doi(0,nums.length-1);
    }

    private TreeNode doi(int l,int r) {
        if (l > r) return null;
        int mid = l + (r-l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = doi(l,mid-1);
        root.right = doi(mid+1,r);
        return root;
    }
}