/*
 * Submission: 1606441345
 * Problem: Climbing Stairs (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-14 09:40:46 UTC
 * Runtime: 0 ms
 * Memory: 40.5 MB
 */

class Solution {
    public int climbStairs(int n) {
        int first = 1;
        int second = 2;
        int ans = 0;
        if (n == 1) return first; 
        if (n == 2) return second;
        for (int i = 3; i <=n; i++){
            ans = second + first;
            first = second;
            second = ans;
        }
        return ans;
    }
}