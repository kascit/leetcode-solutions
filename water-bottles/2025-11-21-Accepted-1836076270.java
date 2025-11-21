/*
 * Submission: 1836076270
 * Problem: Water Bottles (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 15:08:07 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public int numWaterBottles(int numBottles, int x) {
        int ans = numBottles;
        while (numBottles >= x) {
            numBottles -= x - 1;
            ans++;
        }
        return ans;
    }
}