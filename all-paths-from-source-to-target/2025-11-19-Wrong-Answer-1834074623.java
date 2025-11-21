/*
 * Submission: 1834074623
 * Problem: All Paths From Source to Target (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-19 09:22:45 UTC
 * Runtime: N/A
 * Memory: N/A
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
        boolean wentSomewhere = false;
        cur.add(i);
        for (int idx = 0; idx < g[i].length; idx++) {
            wentSomewhere = true;
            dos(ans,cur,g[i][idx]);
        }
        if (!wentSomewhere) {
            ans.add(new ArrayList(cur));
        }
        cur.remove(Integer.valueOf(i));
    }
}