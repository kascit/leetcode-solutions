/*
 * Submission: 1758096273
 * Problem: Leaf-Similar Trees (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 10:35:54 UTC
 * Runtime: 2 ms
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
    Stack<Integer> st = new Stack<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ino(root1);
        System.out.println(st.toString());
        
        System.out.println(st.toString());
        return pino(root2) != -1 && st.isEmpty();
    }

    private void ino(TreeNode cur) {
        if (cur == null) return;
        ino(cur.left);
        if (cur.left == null && cur.right == null) {
            st.push(cur.val);
        }
        ino(cur.right);
    }
    private int pino(TreeNode cur) {
        if (cur == null) return 0;
        if (pino(cur.right) == -1) return -1;

        if (cur.left == null && cur.right == null) {
            // System.out.println(cur.val);
            if (st.isEmpty() || st.peek() != cur.val) return -1;
            st.pop();
        }
        if (pino(cur.left) == -1) return -1;
        return 0;
    }
}