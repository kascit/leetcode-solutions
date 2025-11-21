/*
 * Submission: 1737031565
 * Problem: Maximum Strong Pair XOR I (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-16 08:35:13 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max = 0, len = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < len - 1; i++){
            int xor = 0;
            int last = 0;
            for (int j = i + 1; j < len; j++){
                int cur = nums[j];
                if (nums[j] - nums[i] <= nums[i]){
                    if (xor == 0) xor ^= nums[i];
                    xor ^= cur;
                    xor ^= last;
                }
                last = cur;
                max = (max > xor) ? max : xor;
            }
        } return max;
    }
}