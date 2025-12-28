/*
 * Submission: 1831291201
 * Problem: Two Sum IV - Input is a BST (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 12:00:53 UTC
 * Runtime: 2 ms
 * Memory: 47 MB
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
    List<Integer> arr = new ArrayList<>();

    public boolean findTarget(TreeNode root, int k) {
        inorder(root);                   
        int l = 0, r = arr.size() - 1;

        while (l < r) {
            int sum = arr.get(l) + arr.get(r);
            if (sum == k) return true;
            if (sum < k) l++;
            else r--;
        }
        return false;
    }

    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        arr.add(node.val);
        inorder(node.right);
    }
}
