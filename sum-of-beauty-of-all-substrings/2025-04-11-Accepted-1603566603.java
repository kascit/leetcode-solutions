/*
 * Submission: 1603566603
 * Problem: Sum of Beauty of All Substrings (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 10:47:08 UTC
 * Runtime: 173 ms
 * Memory: 42.6 MB
 */

class Solution {
    public int beautySum(String s) {
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int mask = 0;

            for (int j = i; j < n; j++) {
                int c = s.charAt(j) - 'a';
                freq[c]++;
                mask |= (1 << c);

                int max = 0, min = Integer.MAX_VALUE;

                for (int b = mask; b > 0; b &= b - 1) {
                    int bit = Integer.numberOfTrailingZeros(b);
                    int f = freq[bit];
                    max = Math.max(max, f);
                    min = Math.min(min, f);
                }

                ans += max - min;
            }
        }

        return ans;
    }
}
