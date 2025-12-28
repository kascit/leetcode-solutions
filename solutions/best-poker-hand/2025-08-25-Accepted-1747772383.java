/*
 * Submission: 1747772383
 * Problem: Best Poker Hand (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 13:39:59 UTC
 * Runtime: 0 ms
 * Memory: 41.5 MB
 */

class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int len = ranks.length;
        if (len == 1) return "High Card";
        int[] freq = new int[4];
        int[] req = new int[14];
        for (char s : suits) {
            freq[s-'a']++;
            if (freq[s-'a'] == 5) return "Flush";
        }
        boolean pair = false;
        for (int i : ranks) {
            req[i]++;
            if (!pair && req[i] == 2) pair = true;
            if (req[i] == 3) return "Three of a Kind";
        }

        if (pair) return "Pair";

        return "High Card";

    }
}