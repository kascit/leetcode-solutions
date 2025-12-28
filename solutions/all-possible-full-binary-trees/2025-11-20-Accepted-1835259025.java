/*
 * Submission: 1835259025
 * Problem: All Possible Full Binary Trees (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-20 15:44:00 UTC
 * Runtime: 1 ms
 * Memory: 47.5 MB
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
    
    Map<Integer,List<TreeNode>> memo = new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> ans = new ArrayList();
        if ((n&1) == 0) {
            return ans;
        }
        if (memo.containsKey(n)) return memo.get(n);
        if (n == 1) {
            ans.add(new TreeNode(0));
            memo.put(1,ans);
            return ans;
        }

        for (int i = 1; i < n; i+=2) {
            List<TreeNode> lefts = allPossibleFBT(i);
            List<TreeNode> rights = allPossibleFBT(n-i-1);
            for (TreeNode l : lefts) {
                for (TreeNode r : rights) {
                    TreeNode cur = new TreeNode(0);
                    cur.left = l;
                    cur.right = r;
                    ans.add(cur);
                }
            }
        }
        memo.put(n,ans);
        return ans;
    }
}