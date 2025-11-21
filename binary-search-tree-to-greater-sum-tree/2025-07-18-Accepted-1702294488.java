/*
 * Submission: 1702294488
 * Problem: Binary Search Tree to Greater Sum Tree (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-18 10:10:59 UTC
 * Runtime: 0 ms
 * Memory: 41 MB
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
    public TreeNode bstToGst(TreeNode root) {
        int[] array = new int[1];
        righto(root,array);
        return root;
    }

    public void righto(TreeNode cur,int[] arr){
        if (cur == null) return;
        righto(cur.right,arr);
        cur.val += arr[0];
        arr[0] = cur.val;
        righto(cur.left,arr);

    }
}