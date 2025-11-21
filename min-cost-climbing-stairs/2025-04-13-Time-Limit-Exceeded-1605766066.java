/*
 * Submission: 1605766066
 * Problem: Min Cost Climbing Stairs (Easy)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-04-13 16:11:30 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n];
        return Math.min(minCost(cost, n-1), minCost(cost, n-2));
    }
    private int minCost(int[] cost, int n) {
        if (n < 0) return 0;
        if (n==0 || n==1) return cost[n];
        if (dp[n] != 0) return dp[n];
        dp[n] = cost[n] + Math.min(minCost(cost, n-1), minCost(cost, n-2));
        return dp[n];
    }
}