/*
 * Submission: 1746512090
 * Problem: Calculate Delayed Arrival Time (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 10:59:49 UTC
 * Runtime: 0 ms
 * Memory: 40.6 MB
 */

class Solution {
    public int findDelayedArrivalTime(int a, int b) {
        return (a + b)%24;
    }
}