/*
 * Submission: 1758948971
 * Problem: Binary Tree Inorder Traversal (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 04:53:54 UTC
 * Runtime: 0 ms
 * Memory: 41.8 MB
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
        // in(root); the things i love about you in my mind

        Stack<TreeNode> heheboi = new Stack<>();
        while (root != null || !heheboi.isEmpty()) {
            while (root != null) {
                heheboi.push(root);
                root = root.left;
            }

            root = heheboi.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }


    // who the fuck is ava

    // void in(TreeNode root){
    //     if (root == null) return;
    //     in(root.left);
    //     ans.add(root.val);
    //     in(root.right);
    //     return;
    // }
}