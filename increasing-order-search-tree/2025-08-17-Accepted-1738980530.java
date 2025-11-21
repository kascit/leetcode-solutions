/*
 * Submission: 1738980530
 * Problem: Increasing Order Search Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 20:48:21 UTC
 * Runtime: 0 ms
 * Memory: 41.5 MB
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
    TreeNode head = new TreeNode(-1);
    TreeNode prev = head;
    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        return head.right;
    }

    // private TreeNode doit(TreeNode curr){
    //     if (curr == null) return null;
    //     if (curr.left == null) return curr;
    //     TreeNode t = curr.left;
    //     while(t.right != null){
    //         t = t.right;
    //     }
    //     return t;
        
    // }

    private void dfs(TreeNode curr){
        if (curr == null) return;
        dfs(curr.left);
        prev.right = curr;
        curr.left = null;
        prev = curr;
        dfs(curr.right);
    }



}