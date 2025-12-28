/*
 * Submission: 1830561631
 * Problem: Sum of Elements With Frequency Divisible by K (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-15 17:33:21 UTC
 * Runtime: 1 ms
 * Memory: 44.4 MB
 */

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] freq = new int[101];
        for (int n : nums){
            freq[n]++;
        } int ans = 0;
        for (int i = 1 ; i< 101; i++) {
            if (freq[i]%k == 0) {
                ans += freq[i]*i;
            }
        } return ans;
    }
}