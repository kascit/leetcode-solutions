/*
 * Submission: 1758570767
 * Problem: Binary Search Tree Iterator (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 18:24:39 UTC
 * Runtime: 16 ms
 * Memory: 47.8 MB
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
class BSTIterator {
    int idx;
    List<Integer> ino;
    int size;
    public BSTIterator(TreeNode root) {
        idx = -1;
        ino = new ArrayList<>();
        dabur(root);
        size = ino.size();
    }

    private void dabur(TreeNode cur) {
        if (cur == null) return;
        dabur(cur.left);
        ino.add(cur.val);
        dabur(cur.right);
    }
    
    public int next() {
        return ino.get(++idx);
    }
    
    public boolean hasNext() {
        return idx < size - 1;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */