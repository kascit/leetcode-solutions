/*
 * Submission: 1603561514
 * Problem: Sum of Beauty of All Substrings (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-11 10:39:05 UTC
 * Runtime: 21 ms
 * Memory: 45.2 MB
 */

class Solution {
    public int beautySum(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int[] freqOfFreq = new int[n + 1]; // max freq of any char ≤ n
            int minFreq = 0, maxFreq = 0;

            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                int oldFreq = freq[idx];

                if (oldFreq > 0) {
                    freqOfFreq[oldFreq]--;
                    if (freqOfFreq[oldFreq] == 0 && oldFreq == minFreq)
                        minFreq++;
                }

                freq[idx]++;
                int newFreq = freq[idx];
                freqOfFreq[newFreq]++;

                if (newFreq > maxFreq) maxFreq = newFreq;
                if (minFreq == 0 || newFreq < minFreq) minFreq = newFreq;

                // Fix minFreq if it's pointing to a freq with 0 count
                while (freqOfFreq[minFreq] == 0) minFreq++;

                ans += maxFreq - minFreq;
            }
        }
        return ans;
    }
}
