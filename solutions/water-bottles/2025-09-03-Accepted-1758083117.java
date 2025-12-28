/*
 * Submission: 1758083117
 * Problem: Water Bottles (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 10:20:01 UTC
 * Runtime: 0 ms
 * Memory: 41.1 MB
 */

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0, spare = 0;
        while(numBottles > 0) {
            // System.out.println(numBottles);
            ans += numBottles;
            numBottles += spare;
            if (numBottles > numExchange ) spare = numBottles%numExchange;
            else spare = 0;
            numBottles/=numExchange;
        } return ans;
    }
}