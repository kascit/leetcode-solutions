/*
 * Submission: 1758500136
 * Problem: Average of Levels in Binary Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 17:29:52 UTC
 * Runtime: 2 ms
 * Memory: 45.9 MB
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            double avg = 0;
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                avg += cur.val;
                if (cur.left != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            avg/=size;
            ans.add(avg);
        } return ans;
    }
}