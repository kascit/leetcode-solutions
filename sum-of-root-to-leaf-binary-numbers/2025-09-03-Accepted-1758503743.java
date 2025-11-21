/*
 * Submission: 1758503743
 * Problem: Sum of Root To Leaf Binary Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 17:32:39 UTC
 * Runtime: 0 ms
 * Memory: 42.2 MB
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
    public int sumRootToLeaf(TreeNode root) {
        but(root,0);
        return ans;
    }

    private void but(TreeNode cur, int val) {
        if (cur == null) return;
        val<<=1;
        val+=cur.val;
        if (cur.left == null && cur.right == null) {
            ans += val;
        }
        but(cur.left,val);
        but(cur.right,val);
    }
}