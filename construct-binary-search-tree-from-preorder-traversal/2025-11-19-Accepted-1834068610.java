/*
 * Submission: 1834068610
 * Problem: Construct Binary Search Tree from Preorder Traversal (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 09:14:19 UTC
 * Runtime: 0 ms
 * Memory: 43.5 MB
 */

class Solution {
    int[] a;
    int n, idx;

    public TreeNode bstFromPreorder(int[] preorder) {
        a = preorder;
        n = a.length;
        idx = 0;
        return build(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode build(int low, int high) {
        if (idx == n) return null;
        int v = a[idx];
        if (v < low || v > high) return null;

        idx++;
        TreeNode root = new TreeNode(v);
        root.left = build(low, v);
        root.right = build(v, high);
        return root;
    }
}
