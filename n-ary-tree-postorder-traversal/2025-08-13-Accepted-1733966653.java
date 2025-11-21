/*
 * Submission: 1733966653
 * Problem: N-ary Tree Postorder Traversal (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-13 16:27:31 UTC
 * Runtime: 0 ms
 * Memory: 44.9 MB
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
}
*/

class Solution {
    private List<Integer> ans = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        posty(root);
        return ans;
    }
    private void posty(Node root){
        if (root == null) return;
        for (Node child : root.children){
            posty(child);
        }
        ans.add(root.val);
    }
}