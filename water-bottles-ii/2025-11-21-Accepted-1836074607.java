/*
 * Submission: 1836074607
 * Problem: Water Bottles II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 15:05:26 UTC
 * Runtime: 1 ms
 * Memory: 42.2 MB
 */

class Solution {
    public int maxBottlesDrunk(int numBottles, int x) {
        int ans = numBottles;
        while (numBottles >= x) {
            numBottles -= x - 1;
            x++;
            ans++;
        }
        return ans;
    }
}