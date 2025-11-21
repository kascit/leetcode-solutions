/*
 * Submission: 1718179149
 * Problem: Sum of Nodes with Even-Valued Grandparent (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-31 10:08:55 UTC
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
    public int sumEvenGrandparent(TreeNode root) {
        doit(root,0,"");
        return ans;
    }
    void doit(TreeNode curr, int idx,String take){
        if (curr == null) return;
        if ((curr.val&1) == 0){
            take+=(idx+2);
        }
        if (take.contains(""+idx)){
            ans += curr.val;
        }
        doit(curr.left,idx+1,take);
        doit(curr.right,idx+1,take);
        return;
    }

}