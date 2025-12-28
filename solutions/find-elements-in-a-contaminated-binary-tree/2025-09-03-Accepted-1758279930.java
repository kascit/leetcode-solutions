/*
 * Submission: 1758279930
 * Problem: Find Elements in a Contaminated Binary Tree (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 14:08:33 UTC
 * Runtime: 20 ms
 * Memory: 47.7 MB
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
class FindElements {
    TreeNode root;
    Set<Integer> set = new HashSet<>();

    public FindElements(TreeNode root) {
        this.root = root;
        fix(root,0);
        // ino(root);
    }
    
    public boolean find(int target) {
        // return is(this.root,target);
        return set.contains(target);
    }

    // private boolean is(TreeNode cur, int target) {
    //     if (cur == null) return false;
    //     // System.out.print(cur.val+" ");
    //     if (cur.val == target) return true;         
    //     return is(cur.right,target) || is(cur.left,target);
    // }

    // private void ino(TreeNode cur) {
    //     if (cur == null) return;
    //     ino(cur.left);
    //     System.out.print(cur.val+" ");
    //     ino(cur.right);
    // }

    private void fix(TreeNode cur, int put) {
        if (cur == null) return;
        cur.val = put;
        set.add(put);
        fix(cur.left,put*2+1);
        fix(cur.right,put*2+2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */