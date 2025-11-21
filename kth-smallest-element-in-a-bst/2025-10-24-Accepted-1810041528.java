/*
 * Submission: 1810041528
 * Problem: Kth Smallest Element in a BST (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-10-24 05:25:20 UTC
 * Runtime: 0 ms
 * Memory: 44.4 MB
 */

class Solution {
    private boolean found = false;

    public int kthSmallest(TreeNode root, int k) {
        int[] arr = new int[2];
        inorder(root, k, arr);
        return arr[1];
    }

    public void inorder(TreeNode cur, int k, int[] arr) {
        if (cur == null || found) return;

        inorder(cur.left, k, arr);

        if (found) return;

        arr[0]++;
        arr[1] = cur.val;
        if (arr[0] == k) {
            found = true;
            return;
        }

        inorder(cur.right, k, arr);
    }
}
