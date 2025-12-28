/*
 * Submission: 1716947387
 * Problem: Missing Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 10:22:19 UTC
 * Runtime: 0 ms
 * Memory: 45.2 MB
 */

class Solution {
    public int missingNumber(int[] nums) {
        int[] freq = new int[nums.length + 1];
        for (int i : nums){
            freq[i]++;
        }
        for (int i = 0; i < freq.length; i++){
            if (freq[i] == 0) return i;
        }
        return -1;
    }
}