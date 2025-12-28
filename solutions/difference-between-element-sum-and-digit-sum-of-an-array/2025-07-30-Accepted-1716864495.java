/*
 * Submission: 1716864495
 * Problem: Difference Between Element Sum and Digit Sum of an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 09:02:59 UTC
 * Runtime: 2 ms
 * Memory: 45.3 MB
 */

class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0, dsum = 0, len = nums.length;
        for (int i = 0; i < len; i++){
            int cur = nums[i];
            sum += cur;
            if (cur < 10) {dsum += cur; continue;}
            while (cur > 0){
                dsum += cur%10;
                cur /= 10;
            }
        }
        return sum-dsum;
    }
}