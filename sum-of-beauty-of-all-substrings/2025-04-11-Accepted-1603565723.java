/*
 * Submission: 1603565723
 * Problem: Sum of Beauty of All Substrings (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 10:45:46 UTC
 * Runtime: 58 ms
 * Memory: 42.9 MB
 */

class Solution {
    public int beautySum(String s) {
        int ans = 0, n = s.length();

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int nonZeroMask = 0;

            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                freq[idx]++;
                nonZeroMask |= (1 << idx); // mark this char as present

                int maxFreq = 0, minFreq = Integer.MAX_VALUE;

                // Scan only 26 bits, cheap loop
                for (int b = 0; b < 26; b++) {
                    if ((nonZeroMask & (1 << b)) != 0) {
                        int f = freq[b];
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }

                ans += maxFreq - minFreq;
            }
        }

        return ans;
    }
}
