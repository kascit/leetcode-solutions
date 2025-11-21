/*
 * Submission: 1746214884
 * Problem: Count Elements With Maximum Frequency (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 05:38:29 UTC
 * Runtime: 1 ms
 * Memory: 42.8 MB
 */

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for (int n : nums) {
            freq[n]++;
        }
        int maxF = 0;
        for (int f : freq) {
            maxF = (maxF > f) ? maxF : f;
        }
        int ans = 0;
        for (int f : freq) {
            if (f == maxF) ans += maxF;
        } return ans;
    }
}