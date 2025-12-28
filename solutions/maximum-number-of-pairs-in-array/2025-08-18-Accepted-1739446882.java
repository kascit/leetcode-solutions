/*
 * Submission: 1739446882
 * Problem: Maximum Number of Pairs in Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 09:37:52 UTC
 * Runtime: 0 ms
 * Memory: 42 MB
 */

class Solution {
    public int[] numberOfPairs(int[] nums) {
    
        int[] freq = new int[101];
        for (int x : nums) {
            freq[x]++;
        }

        int pairs = 0;
        int leftovers = 0;
        for (int i = 0; i <= 100; i++) {
            pairs += freq[i] / 2;
            leftovers += freq[i] % 2;
        }

       
        return new int[]{pairs, leftovers};
    }
}