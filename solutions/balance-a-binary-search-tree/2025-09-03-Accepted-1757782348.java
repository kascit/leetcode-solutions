/*
 * Submission: 1757782348
 * Problem: Balance a Binary Search Tree (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 04:33:03 UTC
 * Runtime: 2 ms
 * Memory: 46.5 MB
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
    private List<Integer> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        makeArr(root);
        // System.out.print("[ ");
        // for (int t : list) {
        //     System.out.print(t);
        //     // else System.out.print("null");
        //     System.out.print(", ");
        // }
        // System.out.print(" ]");
        // Collections.sort(list);
        return makeTree(0,list.size()-1);
        // return null;

    }

    private TreeNode makeTree(int l, int r) {
        if (l>r) return null;
        int mid = l + (r-l)/2;
        TreeNode cur = new TreeNode(list.get(mid));
        cur.left = makeTree(l,mid-1);
        cur.right = makeTree(mid+1,r);
        return cur;
    }

    private void makeArr(TreeNode cur) {
        if (cur == null) return;
        makeArr(cur.left);
        list.add(cur.val);
        makeArr(cur.right);
    }
}