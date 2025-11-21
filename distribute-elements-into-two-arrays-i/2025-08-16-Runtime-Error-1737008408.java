/*
 * Submission: 1737008408
 * Problem: Distribute Elements Into Two Arrays I (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-16 08:08:09 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] resultArray(int[] nums) {
        int l = 0, r = 1, len = nums.length, cur = 2;
        while (l < r && r < len){
            int TEMP = nums[cur];
            if (nums[l] < nums[r]){
                r++;
                nums[cur] = nums[r];
                nums[r] = TEMP;
            } else {
                l++;
                int shift = l;
                while ( shift < cur){
                    nums[shift+1] = nums[shift];
                    shift++;
                }
                nums[l] = TEMP;
            }
        } return nums;
    }
}