/*
 * Submission: 1834079630
 * Problem: All Paths From Source to Target (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 09:30:00 UTC
 * Runtime: 1 ms
 * Memory: 47.9 MB
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
        cur.add(i);
        if (i == g.length - 1) {
            ans.add(new ArrayList(cur));
            cur.remove(cur.size() - 1);
            return;
        }
        for (int idx = 0; idx < g[i].length; idx++) {
            // wentSomewhere = true;
            dos(ans,cur,g[i][idx]);
        }
        cur.remove(cur.size() - 1);
    }
}