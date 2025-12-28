/*
 * Submission: 1762889367
 * Problem: Find Indices With Index and Value Difference I (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-07 16:50:12 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int len = nums.length;
        for (int i = 0; i < len - indexDifference; i++) {
            for (int j = i + indexDifference ; j < len; j++) {
                if (Math.abs(nums[i]-nums[j]) == valueDifference) return new int[] {i,j};
            }
        } return new int[]{-1,-1};
    }
}