/*
Submission: 1842221132
Status: Accepted
Timestamp: 2025-11-29 05:35:07 UTC
Runtime: 29 ms
Memory: 48.4 MB
*/

class Solution {
    public int minimumLength(String s) {
        int len = 0, n = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            int cur = s.charAt(i)-'a';
            freq[cur]++;
            len++;
            if (freq[cur] > 2) {
                len -= 2;
                freq[cur] -= 2;
            }
        } return len;
    }
}