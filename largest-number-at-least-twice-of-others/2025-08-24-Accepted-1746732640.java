/*
 * Submission: 1746732640
 * Problem: Largest Number At Least Twice of Others (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 14:52:27 UTC
 * Runtime: 0 ms
 * Memory: 41.9 MB
 */

class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0, sMax = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > nums[max]) {
                sMax = nums[max];
                max = i;
            } else if (nums[i] > sMax) {
                sMax = nums[i];
            }
            // System.out.println(max+"   "+sMax);
        } return (nums[max] >= 2*sMax) ? max : -1;
    }
}