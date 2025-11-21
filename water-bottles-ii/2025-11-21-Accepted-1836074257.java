/*
 * Submission: 1836074257
 * Problem: Water Bottles II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 15:04:51 UTC
 * Runtime: 1 ms
 * Memory: 42.4 MB
 */

class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = 0, empty = 0;
        while (numBottles > 0) {
            numBottles--;
            ans++;
            empty++;
            if (empty == numExchange) {
                empty = 0;
                numExchange++;
                numBottles++;
            }
        } return ans;
    }
}