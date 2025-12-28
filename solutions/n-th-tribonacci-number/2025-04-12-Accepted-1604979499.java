/*
 * Submission: 1604979499
 * Problem: N-th Tribonacci Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 21:04:25 UTC
 * Runtime: 0 ms
 * Memory: 40.5 MB
 */

class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }

    int solve(int n, int[] dp){
        if(n==0) return 0;
        if (n==1 || n ==2) return 1;
        if(dp[n] != -1) return dp[n];
        return dp[n] = solve(n-1,dp)+solve(n-2,dp)+solve(n-3,dp);
    }
}