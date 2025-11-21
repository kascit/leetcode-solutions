/*
 * Submission: 1722843079
 * Problem: Binary Tree Inorder Traversal (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-04 09:06:44 UTC
 * Runtime: 0 ms
 * Memory: 41.7 MB
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
    public List<Integer> inorderTraversal(TreeNode root) {
        in(root);
        return ans;
    }

    void in(TreeNode root){
        if (root == null) return;
        in(root.left);
        ans.add(root.val);
        in(root.right);
        return;
    }
}