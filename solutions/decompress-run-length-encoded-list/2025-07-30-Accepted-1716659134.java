/*
 * Submission: 1716659134
 * Problem: Decompress Run-Length Encoded List (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 05:37:02 UTC
 * Runtime: 0 ms
 * Memory: 44.9 MB
 */

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        
        int[] result = new int[arrSize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }
}