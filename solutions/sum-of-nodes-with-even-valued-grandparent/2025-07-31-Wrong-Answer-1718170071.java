/*
 * Submission: 1718170071
 * Problem: Sum of Nodes with Even-Valued Grandparent (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-31 09:59:38 UTC
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
    int ans = 0;
    Set<Integer> take = new HashSet<>();
    public int sumEvenGrandparent(TreeNode root) {
        doit(root,0);
        return ans;
    }
    void doit(TreeNode curr, int idx){
        if (curr == null) return;
        if ((curr.val&1) == 0){
            take.add(idx+2);
        }
        if (take.contains(idx)){
            ans += curr.val;
        }
        doit(curr.left,idx+1);
        doit(curr.right,idx+1);
        return;
    }

}