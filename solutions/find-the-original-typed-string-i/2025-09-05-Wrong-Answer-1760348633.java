/*
 * Submission: 1760348633
 * Problem: Find the Original Typed String I (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-05 10:34:43 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int possibleStringCount(String word) {
        int[] freq = new int[26];
        int len = word.length(), ans = 1;
        for(int i = 0; i < len; i++) {
            freq[word.charAt(i)-'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if (freq[i] > 1) {
                ans += freq[i] - 1;
            }
        } return ans;
    }
}