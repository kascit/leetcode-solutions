/*
 * Submission: 1759584667
 * Problem: Smallest Range I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 16:36:42 UTC
 * Runtime: 1 ms
 * Memory: 45.7 MB
 */

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0], min = nums[0], len = nums.length;
        for (int i = 1; i < len; i++) {
            int cur = nums[i];
            if (max < cur)  max = cur;
            if (min > cur)  min = cur;
        }
        if(max - min <= 2 * k){
            return 0;
        }
        return max - min - (2*k);
    }
}