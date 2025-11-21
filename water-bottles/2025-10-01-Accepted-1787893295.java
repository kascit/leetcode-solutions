/*
 * Submission: 1787893295
 * Problem: Water Bottles (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-10-01 05:23:28 UTC
 * Runtime: 0 ms
 * Memory: 40.3 MB
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