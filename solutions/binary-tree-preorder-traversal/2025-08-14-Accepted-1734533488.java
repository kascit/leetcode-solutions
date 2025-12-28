/*
 * Submission: 1734533488
 * Problem: Binary Tree Preorder Traversal (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 05:23:38 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
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
    public List<Integer> preorderTraversal(TreeNode root) {
    doit(root);
        return ans;
    }

    private void doit(TreeNode r){
        if (r==null) return;
        ans.add(r.val);
        doit(r.left);
        doit(r.right);
        return;
    }
}
