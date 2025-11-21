/*
 * Submission: 1734606529
 * Problem: N-ary Tree Level Order Traversal (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-14 06:32:55 UTC
 * Runtime: N/A
 * Memory: N/A
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
            ans.add(new ArrayList(cur));
            cur.clear();
        }
        return ans;
    }
}