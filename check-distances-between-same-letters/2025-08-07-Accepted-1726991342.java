/*
 * Submission: 1726991342
 * Problem: Check Distances Between Same Letters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-07 15:16:54 UTC
 * Runtime: 1 ms
 * Memory: 42.8 MB
 */

class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int diff = s.indexOf(s.charAt(i), i + 1) - i - 1;
            if (diff >= 0) {
                if (distance[s.charAt(i) - 'a'] != diff)
                    return false;
            }
        }
        return true;
    }
}