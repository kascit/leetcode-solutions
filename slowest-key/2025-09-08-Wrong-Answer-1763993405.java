/*
 * Submission: 1763993405
 * Problem: Slowest Key (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-08 16:19:24 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] dur = new int[26];
        int len = releaseTimes.length;
        int last = 0;
        for (int i = 0; i < len; i++) {
            int cur = keysPressed.charAt(i) - 'a';
            int stop = releaseTimes[i];
            dur[cur] += stop - last;
            last = stop;
        }
        int max = 0;
        for (int i = 25; i >= 0; i--) {
            if (dur[i] == 0) continue;
            if (dur[i] > dur[max]) {
                max = i;
            }
        } return (char) ('a' + max);
    }
}