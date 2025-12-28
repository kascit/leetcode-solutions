/*
Submission: 1842219165
Status: Accepted
Timestamp: 2025-11-29 05:31:51 UTC
Runtime: 32 ms
Memory: 48.1 MB
*/

class Solution {
    public int minimumLength(String s) {
        int len = 0;
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch-'a']++;
            if (freq[ch-'a'] > 2) {
                // len++;
                freq[ch-'a'] -= 2;
            }
        } return Arrays.stream(freq).sum();
    }
}