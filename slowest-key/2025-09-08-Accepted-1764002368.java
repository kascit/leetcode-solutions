/*
 * Submission: 1764002368
 * Problem: Slowest Key (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-08 16:26:17 UTC
 * Runtime: 1 ms
 * Memory: 44.5 MB
 */

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxDuration = releaseTimes[0];
        char ans = keysPressed.charAt(0);

        for (int i = 1; i < releaseTimes.length; i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            char key = keysPressed.charAt(i);

            if (duration > maxDuration || (duration == maxDuration && key > ans)) {
                maxDuration = duration;
                ans = key;
            }
        }

        return ans;
    }
}
