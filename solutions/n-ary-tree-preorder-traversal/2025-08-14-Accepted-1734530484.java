/*
 * Submission: 1734530484
 * Problem: N-ary Tree Preorder Traversal (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 05:20:37 UTC
 * Runtime: 0 ms
 * Memory: 44.7 MB
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
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        doi(root);
        return ans;
    }
    private void doi(Node r){
        if (r == null) return;
        ans.add(r.val);
        for(Node child : r.children){
            doi(child);
        }
        return;
    }
}