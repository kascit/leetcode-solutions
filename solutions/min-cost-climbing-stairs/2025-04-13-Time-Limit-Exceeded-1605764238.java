/*
 * Submission: 1605764238
 * Problem: Min Cost Climbing Stairs (Easy)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-04-13 16:09:09 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        return dp(cost.length, dp, cost);
    }

    int dp(int n, int[] dpr, int[] cost){
        if(n<=1) return 0;
        if(dpr[n] != 0) return dpr[n];
        int prev = dp(n-1, dpr, cost) + cost[n-1];
        int just = dp(n-2, dpr, cost) + cost[n-2];
        dpr[n] = (prev > just) ? just : prev;
        return dpr[n]; 
    }
}