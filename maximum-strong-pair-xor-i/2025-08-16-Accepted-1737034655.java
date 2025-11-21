/*
 * Submission: 1737034655
 * Problem: Maximum Strong Pair XOR I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 08:38:44 UTC
 * Runtime: 4 ms
 * Memory: 42.7 MB
 */

class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max = 0, len = nums.length;
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        for(int i = 0; i < len - 1; i++){
            int xor = 0;
            int last = 0;
            for (int j = i + 1; j < len; j++){
                int cur = nums[j];
                if (nums[i] == nums[j]) continue;
                if (nums[j] - nums[i] <= nums[i]){
                    // System.out.println(i+"          "+j);
                    // System.out.println(nums[i]+"          "+nums[j]);
                    // System.out.println();
                    if (xor == 0) xor ^= nums[i];
                    xor ^= cur;
                    xor ^= last;
                } else break;
                last = cur;
                max = (max > xor) ? max : xor;
            }
        } return max;
    }
}