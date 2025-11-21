/*
 * Submission: 1738910151
 * Problem: N-Repeated Element in Size 2N Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 19:09:32 UTC
 * Runtime: 17 ms
 * Memory: 45.6 MB
 */

class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxElem = -1, maxFreq = 0;
        int k = nums.length/2;
        for (int x : nums) {
            int count = freq.getOrDefault(x, 0) + 1;
            freq.put(x, count);
            if (count == k) {
                return x;
            }
        }
        return -1;
    }
}