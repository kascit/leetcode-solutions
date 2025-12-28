/*
 * Submission: 1734607220
 * Problem: N-ary Tree Level Order Traversal (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 06:33:36 UTC
 * Runtime: 4 ms
 * Memory: 44.6 MB
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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {        
        List<Integer> cur = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            
            while(size-->0){
                Node curr = q.poll();
                if(curr == null) break;
                cur.add(curr.val);
                for(Node child : curr.children){
                    q.offer(child);
                }
            }
            if(cur.size() > 0) ans.add(new ArrayList(cur));
            cur.clear();
        }
        return ans;
    }
}