/*
 * Submission: 1693930072
 * Problem: Divisor Game (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-11 06:07:28 UTC
 * Runtime: 0 ms
 * Memory: 40.6 MB
 */

class Solution {
    public boolean divisorGame(int n) {
        return n%2 == 0;
        // boolean[] dp = new boolean[n+1];
        // dp[0] = false;
        // dp[1] = true;
        // for(int i = 2; i < n; i++){
        //     for(int j = 1; j < i; j++){
        //         if(divides(i,j) && !dp[i-j]){
        //             dp[i] = true;
        //         }
        //     }
        // }
        // return dp[n];
    }
    // public boolean divides(int n,int i){
    //     return n%i == 0;
    // }
}