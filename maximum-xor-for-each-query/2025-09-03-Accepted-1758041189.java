/*
 * Submission: 1758041189
 * Problem: Maximum XOR for Each Query (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 09:31:32 UTC
 * Runtime: 2 ms
 * Memory: 60.8 MB
 */

class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int mask = (1<<(maximumBit)) - 1;
        // System.out.println(Integer.toBinaryString(mask));
        // int o = Integer.MAX_VALUE;
        int xor = 0, len = nums.length;
        for (int n : nums){
            xor ^= n;
        }
        int l = 0, r = len - 1;
        for(int i = len - 1; i >= 0; i--) {
            // System.out.println(Integer.toBinaryString(xor));
            int x = xor^mask;
            // System.out.println(Integer.toBinaryString(x));
            xor ^= nums[i];
            nums[i] = x;
        }
        while(l<r) {
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l++;r--;
        } return nums;
    }
}