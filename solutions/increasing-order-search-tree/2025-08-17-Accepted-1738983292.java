/*
 * Submission: 1738983292
 * Problem: Increasing Order Search Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 20:53:27 UTC
 * Runtime: 0 ms
 * Memory: 41.1 MB
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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(0);
        TreeNode prev = dummy;
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left == null) {
                // visit curr
                prev.right = curr;
                curr.left = null;   // cut left link
                prev = curr;
                curr = curr.right;
            } else {
                // use your doit helper to get the inorder predecessor
                TreeNode pred = doit(curr); // rightmost node in curr.left subtree
                if (pred.right == null) {
                    // make a temporary thread to curr
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    // thread exists -> remove it and visit curr
                    pred.right = null;
                    prev.right = curr;
                    curr.left = null;
                    prev = curr;
                    curr = curr.right;
                }
            }
        }

        return dummy.right;
    }

    // returns the rightmost node of curr.left (stops early if there's already a thread to curr)
    private TreeNode doit(TreeNode curr) {
        if (curr == null || curr.left == null) return null;
        TreeNode t = curr.left;
        while (t.right != null && t.right != curr) {
            t = t.right;
        }
        return t;
    }
}
