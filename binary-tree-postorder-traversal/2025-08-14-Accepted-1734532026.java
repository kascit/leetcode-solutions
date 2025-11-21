/*
 * Submission: 1734532026
 * Problem: Binary Tree Postorder Traversal (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 05:22:11 UTC
 * Runtime: 0 ms
 * Memory: 41.9 MB
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
    List<Integer> ans = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        doit(root);
        return ans;
    }

    private void doit(TreeNode r){
        if (r==null) return;
        doit(r.left);
        doit(r.right);
        ans.add(r.val);
        return;
    }
}