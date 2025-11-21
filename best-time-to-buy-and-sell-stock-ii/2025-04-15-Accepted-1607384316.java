/*
 * Submission: 1607384316
 * Problem: Best Time to Buy and Sell Stock II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-15 09:07:48 UTC
 * Runtime: 0 ms
 * Memory: 45.8 MB
 */

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        int prev = prices[n-1];
        for (int i = n - 2; i >= 0; i--){
            int cur = prices[i];
            if (cur < prev) profit += prev-cur;
            prev = cur;
        }
        return profit;
    }
}