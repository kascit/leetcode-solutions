/*
 * Submission: 1718154494
 * Problem: Maximum Binary Tree (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-31 09:44:42 UTC
 * Runtime: 1 ms
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
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }

    public TreeNode mergeSort(int[] arr, int left, int right) {
        if (left > right) return null;
        int mid = findMax(arr, left, right);
        TreeNode curr = new TreeNode(arr[mid]);
        curr.left = mergeSort(arr, left, mid - 1);        
        curr.right = mergeSort(arr, mid + 1, right);  
        return curr;
    }


    public int findMax(int[] arr,int left,int right){
        int maxi = left;
        for (int i = left + 1; i <= right; i++) {
            if (arr[i] > arr[maxi]) maxi = i;
        }
        return maxi;
    }
}