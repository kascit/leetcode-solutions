/*
 * Submission: 1718181531
 * Problem: Sum of Nodes with Even-Valued Grandparent (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-31 10:11:20 UTC
 * Runtime: 1 ms
 * Memory: 46.3 MB
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
    int ans = 0;
    public int sumEvenGrandparent(TreeNode root) {
        dfs(root, null, null);
        return ans;
    }

    void dfs(TreeNode curr, TreeNode parent, TreeNode grandparent) {
        if (curr == null) return;

        if (grandparent != null && (grandparent.val % 2 == 0)) {
            ans += curr.val;
        }

        dfs(curr.left, curr, parent);
        dfs(curr.right, curr, parent);
    }

}