/*
 * Submission: 1834077768
 * Problem: All Paths From Source to Target (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 09:27:12 UTC
 * Runtime: 3 ms
 * Memory: 47.7 MB
 */

class Solution {
    int[][] g;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.g = graph;
        List<List<Integer>> ans = new ArrayList<>();
        dos(ans,new ArrayList<>(),0);
        return ans;
    }
    void dos(List<List<Integer>> ans, List<Integer> cur, int i) {
        // boolean wentSomewhere = false;
        if (i == 0) cur.add(0);
        if (i == g.length - 1) {
            ans.add(new ArrayList(cur));
            return;
        }
        for (int idx = 0; idx < g[i].length; idx++) {
            // wentSomewhere = true;
            cur.add(g[i][idx]);
            dos(ans,cur,g[i][idx]);
            cur.remove(Integer.valueOf(g[i][idx]));
        }
    }
}