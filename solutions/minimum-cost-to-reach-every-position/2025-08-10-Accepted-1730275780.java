/*
 * Submission: 1730275780
 * Problem: Minimum Cost to Reach Every Position (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 15:41:52 UTC
 * Runtime: 1 ms
 * Memory: 44.7 MB
 */

class Solution {
    public int[] minCosts(int[] cost) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < cost.length; i++){
            min = Math.min(min,cost[i]);
            cost[i] = min;
        } return cost;
    }
}