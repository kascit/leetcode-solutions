/*
 * Submission: 1760350107
 * Problem: Find the Original Typed String I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 10:36:27 UTC
 * Runtime: 1 ms
 * Memory: 42.3 MB
 */

class Solution {
    public int possibleStringCount(String word) {
        int[] freq = new int[26];
        int len = word.length(), ans = 1;
        char prev = 0;
        for(int i = 0; i < len; i++) {
            char cur = word.charAt(i);
            if (prev == cur)
            freq[cur-'a']++;
            prev = cur;
        }
        for(int i = 0; i < 26; i++) {
            ans += freq[i];
        } return ans;
    }
}