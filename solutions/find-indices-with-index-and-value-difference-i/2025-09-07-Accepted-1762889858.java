/*
 * Submission: 1762889858
 * Problem: Find Indices With Index and Value Difference I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 16:50:37 UTC
 * Runtime: 1 ms
 * Memory: 43.5 MB
 */

class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int len = nums.length;
        for (int i = 0; i < len - indexDifference; i++) {
            for (int j = i + indexDifference ; j < len; j++) {
                if (Math.abs(nums[i]-nums[j]) >= valueDifference) return new int[] {i,j};
            }
        } return new int[]{-1,-1};
    }
}