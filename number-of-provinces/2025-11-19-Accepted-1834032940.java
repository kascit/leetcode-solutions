/*
 * Submission: 1834032940
 * Problem: Number of Provinces (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 08:24:24 UTC
 * Runtime: 6 ms
 * Memory: 47.1 MB
 */

class Solution {
    int[][] adj;
    int n;
    public int findCircleNum(int[][] isConnected) {
        this.adj = isConnected;
        this.n = adj.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (adj[i][i] == 1) {
                adj[i][i] = 0;
                consume(i);
                ans++;
            }
            
        } return ans;
    }

    void consume(int i) {
        for (int edgeTo = 0; edgeTo < n; edgeTo++) {
            if(adj[i][edgeTo] == 1) {
                adj[i][edgeTo] = 0;
                if (i != edgeTo) consume(edgeTo);
            }
        }
    }
}