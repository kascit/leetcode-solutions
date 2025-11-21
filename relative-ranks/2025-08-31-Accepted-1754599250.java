/*
 * Submission: 1754599250
 * Problem: Relative Ranks (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 09:50:10 UTC
 * Runtime: 3 ms
 * Memory: 45.9 MB
 */

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int maxScore = 0;
        for (int s : score) maxScore = Math.max(maxScore, s);

        int[] buckets = new int[maxScore + 1];
        Arrays.fill(buckets, -1);

        for (int i = 0; i < n; i++) {
            buckets[score[i]] = i;
        }

        String[] ans = new String[n];
        int rank = 1;

        for (int s = maxScore; s >= 0; s--) {
            if (buckets[s] != -1) {
                int idx = buckets[s];
                if (rank == 1) ans[idx] = "Gold Medal";
                else if (rank == 2) ans[idx] = "Silver Medal";
                else if (rank == 3) ans[idx] = "Bronze Medal";
                else ans[idx] = String.valueOf(rank);
                rank++;
            }
        }
        return ans;
    }
}
