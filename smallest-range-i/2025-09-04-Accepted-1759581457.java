/*
 * Submission: 1759581457
 * Problem: Smallest Range I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 16:33:59 UTC
 * Runtime: 2 ms
 * Memory: 45.2 MB
 */

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0], min = nums[0], len = nums.length;
        for (int i = 1; i < len; i++) {
            int cur = nums[i];
            max = (max > cur) ? max : cur;
            min = (min < cur) ? min : cur;
        }
        if(max - min <= 2 * k){
            return 0;
        }
        return max - min - (2*k);
    }
}