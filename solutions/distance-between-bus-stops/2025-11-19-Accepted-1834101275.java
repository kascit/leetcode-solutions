/*
 * Submission: 1834101275
 * Problem: Distance Between Bus Stops (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-19 10:00:56 UTC
 * Runtime: 0 ms
 * Memory: 44.1 MB
 */

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int t = 0, j = 0, l = distance.length;for (int i = 0; i < l; i++) {
            t += distance[i];
        } 
            while (start != destination) {
                j += distance[start];
                start++;
                if(start == l) {
                    start = 0;
                }
                }
        // System.out.println(t+"   "+j);
        return (j < t- j) ? j : t- j;
    }
}