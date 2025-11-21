/*
 * Submission: 1834035000
 * Problem: Number of Provinces (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 08:27:29 UTC
 * Runtime: 0 ms
 * Memory: 47.2 MB
 */

class Solution {
    int n;
    int[][] g;
    boolean[] vis;

    public int findCircleNum(int[][] isConnected) {
        g = isConnected;
        n = g.length;
        vis = new boolean[n];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i);
                ans++;
            }
        }
        return ans;
    }

    void dfs(int u) {
        vis[u] = true;
        for (int v = 0; v < n; v++) {
            if (g[u][v] == 1 && !vis[v]) {
                dfs(v);
            }
        }
    }
}
