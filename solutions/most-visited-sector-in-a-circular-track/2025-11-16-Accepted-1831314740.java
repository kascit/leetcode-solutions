/*
 * Submission: 1831314740
 * Problem: Most Visited Sector in  a Circular Track (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 12:35:26 UTC
 * Runtime: 0 ms
 * Memory: 44.5 MB
 */

class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0];
        int end = rounds[rounds.length - 1];

        List<Integer> ans = new ArrayList<>();

        if (start <= end) {
            for (int i = start; i <= end; i++) ans.add(i);
        } else {
            for (int i = 1; i <= end; i++) ans.add(i);
            for (int i = start; i <= n; i++) ans.add(i);
        }

        return ans;   
    }
}