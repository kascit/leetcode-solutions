/*
 * Submission: 1603563986
 * Problem: Sum of Beauty of All Substrings (Medium)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-04-11 10:43:04 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int beautySum(String s) {
        int ans = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int[] freqOfFreq = new int[27]; // Only frequencies 1 to 26 are possible
            int minFreq = 0, maxFreq = 0;

            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                int oldFreq = freq[idx];

                if (oldFreq > 0) {
                    freqOfFreq[oldFreq]--;
                    if (freqOfFreq[oldFreq] == 0 && oldFreq == minFreq) {
                        minFreq++;
                    }
                }

                freq[idx]++;
                int newFreq = freq[idx];
                freqOfFreq[newFreq]++;

                if (newFreq > maxFreq) maxFreq = newFreq;
                if (minFreq == 0 || newFreq < minFreq) minFreq = newFreq;

                while (freqOfFreq[minFreq] == 0) minFreq++;

                ans += maxFreq - minFreq;
            }
        }

        return ans;
    }
}
