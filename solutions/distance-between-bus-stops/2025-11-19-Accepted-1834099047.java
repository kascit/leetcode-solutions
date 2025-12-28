/*
 * Submission: 1834099047
 * Problem: Distance Between Bus Stops (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 09:58:10 UTC
 * Runtime: 0 ms
 * Memory: 44.1 MB
 */

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int t = 0, j = 0;for (int i = 0; i < distance.length; i++) {
            t += distance[i];
        } 
            while (start != destination) {
                j += distance[start];
                start++;
                start%=distance.length;
                }
        // System.out.println(t+"   "+j);
        return (j < t- j) ? j : t- j;
    }
}