/*
 * Submission: 1707294607
 * Problem: Best Time to Buy and Sell Stock (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-22 13:57:51 UTC
 * Runtime: 2 ms
 * Memory: 62 MB
 */

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}