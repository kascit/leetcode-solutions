/*
 * Submission: 1834097991
 * Problem: Distance Between Bus Stops (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-11-19 09:56:49 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int t = 0, j = 0;for (int i = 0; i < distance.length; i++) {
            t += distance[i];
            if (i >= start && i < destination) j += distance[i];
        } 
        // System.out.println(t+"   "+j);
        return (j < t- j) ? j : t- j;
    }
}