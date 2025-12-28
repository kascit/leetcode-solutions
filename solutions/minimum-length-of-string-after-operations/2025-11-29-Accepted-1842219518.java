/*
Submission: 1842219518
Status: Accepted
Timestamp: 2025-11-29 05:32:24 UTC
Runtime: 28 ms
Memory: 48.4 MB
*/

class Solution {
    public int minimumLength(String s) {
        int len = 0;
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch-'a']++;
            len++;
            if (freq[ch-'a'] > 2) {
                len -= 2;
                freq[ch-'a'] -= 2;
            }
        } return len;
    }
}