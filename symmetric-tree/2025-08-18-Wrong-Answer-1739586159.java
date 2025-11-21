/*
 * Submission: 1739586159
 * Problem: Symmetric Tree (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-18 12:26:29 UTC
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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        q.offer(root);
        while( !q.isEmpty() ) {
            int size = q.size();
            int half = size/2;
            while(size>0){
                TreeNode cur = q.poll();
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
                if (size > half) s.push(cur.val);
                else s.pop();
                size--;
            }
            if (!s.isEmpty()) return false;
        } return true;

        // boolean l = isSymmetric(root.left);
        // boolean r = isSymmetric(root.right);
        // return l && r;
    }
}