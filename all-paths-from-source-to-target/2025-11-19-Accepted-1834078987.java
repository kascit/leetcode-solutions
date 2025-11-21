/*
 * Submission: 1834078987
 * Problem: All Paths From Source to Target (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 09:29:03 UTC
 * Runtime: 2 ms
 * Memory: 48 MB
 */

class Solution {
    int[][] graph;
    int n;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.graph = graph;
        this.n = graph.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(0, cur, ans);
        return ans;
    }

    private void dfs(int node, List<Integer> cur, List<List<Integer>> ans) {
        cur.add(node);                     

        if (node == n - 1) {                 
            ans.add(new ArrayList<>(cur));   
            cur.remove(cur.size() - 1);     
            return;
        }

        for (int neigh : graph[node]) {
            dfs(neigh, cur, ans);
        }

        cur.remove(cur.size() - 1);          
    }
}
