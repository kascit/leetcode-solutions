/*
 * Submission: 1772845489
 * Problem: Maximize Sum of At Most K Distinct Elements (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-16 14:51:00 UTC
 * Runtime: 4 ms
 * Memory: 45.4 MB
 */

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            int tmp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = tmp;
        }
        int[] ans = new int[k];
        int len = nums.length, idx = 0;
        for (int i = 0; i < len && k > 0; i++) {
            while (i < len - 1 && nums[i] == nums[i+1]) i++;
            ans[idx++] = nums[i];
            k--;
        }

        return Arrays.copyOfRange(ans, 0, idx);
    }
}