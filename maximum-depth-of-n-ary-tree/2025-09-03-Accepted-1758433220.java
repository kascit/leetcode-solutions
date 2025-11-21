/*
 * Submission: 1758433220
 * Problem: Maximum Depth of N-ary Tree (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 16:36:18 UTC
 * Runtime: 0 ms
 * Memory: 44.8 MB
 */

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        return doi(root);
    }

    private int doi(Node cur) {
        if (cur == null) return 0;
        int max = 0;
        for (Node c : cur.children) {
            max = Math.max(max,doi(c));
        }
        return max + 1;
    }
}