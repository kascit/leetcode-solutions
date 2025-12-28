/*
 * Submission: 1603565112
 * Problem: Sum of Beauty of All Substrings (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 10:44:50 UTC
 * Runtime: 57 ms
 * Memory: 42.9 MB
 */

class Solution {
    public int beautySum(String s) {
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];

            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                freq[idx]++;

                int maxFreq = 0, minFreq = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                ans += maxFreq - minFreq;
            }
        }

        return ans;
    }
}
