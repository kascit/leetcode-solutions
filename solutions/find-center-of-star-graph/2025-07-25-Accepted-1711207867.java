/*
 * Submission: 1711207867
 * Problem: Find Center of Star Graph (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 16:14:08 UTC
 * Runtime: 0 ms
 * Memory: 72.6 MB
 */

class Solution {
    public int findCenter(int[][] edges) {
        return (edges[0][0] == edges[1][0]) ? edges[0][0] :
               (edges[0][0] == edges[1][1]) ? edges[0][0] :
               edges[0][1]
               ;
    }
}