/*
 * Submission: 1834103190
 * Problem: Distance Between Bus Stops (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 10:03:32 UTC
 * Runtime: 0 ms
 * Memory: 44 MB
 */

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int t = start; start = destination; destination = t;
        }

        int total = 0, forward = 0;
        for (int d : distance) total += d;
        for (int i = start; i < destination; i++) forward += distance[i];

        return Math.min(forward, total - forward);
    }
}
