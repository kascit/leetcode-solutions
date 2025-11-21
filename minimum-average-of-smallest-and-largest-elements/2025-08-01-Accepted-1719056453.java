/*
 * Submission: 1719056453
 * Problem: Minimum Average of Smallest and Largest Elements (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-01 04:33:55 UTC
 * Runtime: 2 ms
 * Memory: 43.9 MB
 */

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        float ans = 51;
        while (i < j){
            float cur = (float) (nums[i++] + nums[j--]) / 2;
            ans = (ans > cur) ? cur : ans;
        } return ans;
    }
}