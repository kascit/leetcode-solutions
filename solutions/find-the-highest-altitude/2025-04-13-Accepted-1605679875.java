/*
 * Submission: 1605679875
 * Problem: Find the Highest Altitude (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 14:21:26 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;
        
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        
        return maxAltitude;
    }
}