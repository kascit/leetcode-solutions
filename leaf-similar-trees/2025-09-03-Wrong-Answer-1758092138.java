/*
 * Submission: 1758092138
 * Problem: Leaf-Similar Trees (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-03 10:30:48 UTC
 * Runtime: N/A
 * Memory: N/A
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
    Stack<Integer> st = new Stack<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ino(root1);
        // System.out.println(st.toString());
        pino(root2);
        // System.out.println(st.toString());
        return st.isEmpty();
    }

    private void ino(TreeNode cur) {
        if (cur == null) return;
        ino(cur.left);
        if (cur.left == null && cur.right == null) {
            st.push(cur.val);
        }
        ino(cur.right);
    }
    private void pino(TreeNode cur) {
        if (cur == null) return;
        pino(cur.right);
        if (cur.left == null && cur.right == null) {
            // System.out.println(cur.val);
            if (st.peek() != cur.val) return;
            st.pop();
        }
        pino(cur.left);
    }
}