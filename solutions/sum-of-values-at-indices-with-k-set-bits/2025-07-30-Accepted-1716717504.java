/*
 * Submission: 1716717504
 * Problem: Sum of Values at Indices With K Set Bits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 06:28:25 UTC
 * Runtime: 1 ms
 * Memory: 44.6 MB
 */

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0, idx = 0;
        for (Integer i : nums){
            int cur = idx, bits = 0;
            while (cur > 0){
                cur &= (cur-1);
                bits++;
            }
            if (bits == k) sum += nums.get(idx);
            idx++;
        }
        return sum;
    }
}