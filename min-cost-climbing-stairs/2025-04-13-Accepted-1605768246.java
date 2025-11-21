/*
 * Submission: 1605768246
 * Problem: Min Cost Climbing Stairs (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 16:14:13 UTC
 * Runtime: 1 ms
 * Memory: 43 MB
 */

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        Arrays.fill(dp,-1);
        return dp(cost.length, dp, cost);
    }

    int dp(int n, int[] dpr, int[] cost){
        if(n<=1) return 0;
        if(dpr[n] != -1) return dpr[n];
        int prev = dp(n-1, dpr, cost) + cost[n-1];
        int just = dp(n-2, dpr, cost) + cost[n-2];
        dpr[n] = (prev > just) ? just : prev;
        return dpr[n]; 
    }
}