/*
 * Submission: 1724542766
 * Problem: Find a Corresponding Node of a Binary Tree in a Clone of That Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 15:24:00 UTC
 * Runtime: 2 ms
 * Memory: 49.6 MB
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode t = null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
       t = target;
       return in(original,cloned); 
    }

    TreeNode in(TreeNode original,TreeNode cloned){
        if (original == null) return null;
        if(original == t) return cloned;        
        TreeNode left = in(original.left,cloned.left);
        TreeNode right = in(original.right,cloned.right);
        return (left != null) ? left : right;
    }
}