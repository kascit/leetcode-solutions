/*
 * Submission: 1739471556
 * Problem: Binary Tree Paths (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 10:06:25 UTC
 * Runtime: 4 ms
 * Memory: 42.7 MB
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
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        doit(root, new StringBuilder());
        return ans;
    }

    private void doit(TreeNode curr, StringBuilder sb){
        if (curr == null) return;
        if (curr.left == null && curr.right == null){
            sb.append(curr.val);
            ans.add(sb.toString());
        }
        sb.append(curr.val+"->");
        int len = sb.length();
        doit(curr.left,sb);
        sb.delete(len,sb.length());
        doit(curr.right,sb);
    }
}