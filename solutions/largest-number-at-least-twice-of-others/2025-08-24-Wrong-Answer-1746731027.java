/*
 * Submission: 1746731027
 * Problem: Largest Number At Least Twice of Others (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-24 14:50:52 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0, sMax = 0;
        for (int i = 0; i < nums.length; i++){
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