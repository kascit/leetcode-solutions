/*
 * Submission: 1607387007
 * Problem: Best Time to Buy and Sell Stock II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-15 09:11:56 UTC
 * Runtime: 1 ms
 * Memory: 46.1 MB
 */

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        for (int i = n - 2; i >= 0; i--){
            
            if (prices[i] < prices[i+1]) profit += prices[i+1] - prices[i] ;
            
        }
        return profit;
    }
}