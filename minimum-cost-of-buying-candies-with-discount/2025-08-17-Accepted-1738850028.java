/*
 * Submission: 1738850028
 * Problem: Minimum Cost of Buying Candies With Discount (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 18:10:47 UTC
 * Runtime: 2 ms
 * Memory: 42.7 MB
 */

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int end = cost.length - 1;
        int ans = 0, idx = 0;
        for (int i = end; i >= 0; i--){
            if (idx != 2) ans += cost[i];
            idx = (idx+1)%3;
        } return ans;
    }
}