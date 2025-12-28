/*
 * Submission: 1706124528
 * Problem: How Many Numbers Are Smaller Than the Current Number (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-21 15:37:14 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int[] freq = new int[101];
        for (int i : nums){
            freq[i]++;
        }
        int count = 0;
        for (int i = 0; i < 100; i++){
            if (freq[i] == 0) continue;
            int TEMP = freq[i];
            freq[i] = count;
            count += TEMP;

        }
        for (int i = 0; i < nums.length; i++){
            ans[i] = freq[nums[i]];
        }
        return ans;
    }
}