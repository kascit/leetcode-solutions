/*
 * Submission: 1834108329
 * Problem: Distance Between Bus Stops (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 10:10:56 UTC
 * Runtime: 0 ms
 * Memory: 44.2 MB
 */

class Solution {
    public int distanceBetweenBusStops(int[] d, int start, int dest) {
        int n = d.length;

        int forward = 0;
        for (int i = start; i != dest; i = (i + 1) % n)
            forward += d[i];

        int total = 0;
        for (int x : d) total += x;

        int backward = total - forward;

        return Math.min(forward, backward);
    }
}
