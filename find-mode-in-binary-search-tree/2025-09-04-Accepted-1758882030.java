/*
 * Submission: 1758882030
 * Problem: Find Mode in Binary Search Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 03:34:15 UTC
 * Runtime: 4 ms
 * Memory: 45 MB
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
    Map<Integer,Integer> freq;
    public int[] findMode(TreeNode root) {
        freq = new HashMap<>();
        dfs(root);
        int[] ans = new int[freq.size()];
        int idx = 0, maxf = 0;
        for(Map.Entry<Integer,Integer> e : freq.entrySet()) {
            // System.out.println(e.getKey()+"  ->"+e.getValue());
            if (e.getValue() < maxf) continue;
            if (e.getValue() > maxf) {
                maxf = e.getValue();
                idx = 0;
            } 
            ans[idx++] = e.getKey();
        }
        return Arrays.copyOf(ans,idx);
    }

    private void dfs(TreeNode cur) {
        if (cur == null) return;
        dfs(cur.left);
        freq.merge(cur.val,1,Integer::sum);
        dfs(cur.right);
    }
}