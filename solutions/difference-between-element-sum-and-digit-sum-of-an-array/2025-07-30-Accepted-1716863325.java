/*
 * Submission: 1716863325
 * Problem: Difference Between Element Sum and Digit Sum of an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 09:01:48 UTC
 * Runtime: 2 ms
 * Memory: 45 MB
 */

class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0, dsum = 0, len = nums.length;
        for (int i = 0; i < len; i++){
            int cur = nums[i];
            sum += cur;
            while (cur > 0){
                dsum += cur%10;
                cur /= 10;
            }
        }
        return sum-dsum;
    }
}