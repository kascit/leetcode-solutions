/*
 * Submission: 1739592274
 * Problem: Symmetric Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 12:33:42 UTC
 * Runtime: 0 ms
 * Memory: 42.2 MB
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
    public boolean isSymmetric(TreeNode root) {
        // if (root == null) return false;
        // Queue<TreeNode> q = new LinkedList<>();
        // Stack<Integer> s = new Stack<>();
        // q.offer(root);
        // boolean first = true;
        // while( !q.isEmpty() ) {
        //     int size = q.size();
        //     int half = size/2;
        //     while(size>0){
        //         TreeNode cur = q.poll();
        //         if (cur.left != null) q.offer(cur.left);
        //         if (cur.right != null) q.offer(cur.right);
        //         if (size > half) s.push(cur.val);
        //         else if(s.peek() == cur.val) s.pop();
        //         else return false;
        //         size--;
        //     }
        //     System.out.println(s.toString());
        //     if (first){
        //         s.pop();
        //         first = false;
        //     }
        //     if (!s.isEmpty()) return false;
        // } return true;

        // boolean l = isSymmetric(root.left);
        // boolean r = isSymmetric(root.right);
        // return l && r;




        return fuckall(root.left,root.right);
    }

    private boolean fuckall(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return fuckall(left.right,right.left) && fuckall(left.left,right.right);
    }
}