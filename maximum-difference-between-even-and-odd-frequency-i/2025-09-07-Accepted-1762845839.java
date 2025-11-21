/*
 * Submission: 1762845839
 * Problem: Maximum Difference Between Even and Odd Frequency I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 16:09:55 UTC
 * Runtime: 1 ms
 * Memory: 42.2 MB
 */

class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        int len = s.length();
        int maxe = -1, mine = -1, maxo = -1, mino = -1;
        for (int i = 0; i < len; i++) {
            freq[s.charAt(i)-'a']++;
        }
        for (int f : freq) {
            if (f == 0) continue;
            if ( (f&1) == 0) {
                if (mine == -1 || f < mine) {
                    mine = f;
                }
                // if (maxe == -1 || f > maxe) {
                //     maxe = f;
                // }
            } else {
                // if (mino == -1 || f < mino) {
                //     mino = f;
                // }
                if (maxo == -1 || f > maxo) {
                    maxo = f;
                }
            }
        } 
        // if ((mine == -1 && maxe == -1) || (mino == -1 && maxo == -1)) return -1;
        // return Math.max(maxo-mine,maxe-mino);
        return maxo - mine;
    }
}