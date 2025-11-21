/*
 * Submission: 1758081025
 * Problem: Water Bottles (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-03 10:17:29 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0, spare = 0;
        while(numBottles > 0) {
            ans += numBottles;
            numBottles += spare;
            numBottles/=numExchange;
            spare = numBottles%numExchange;
        } return ans;
    }
}