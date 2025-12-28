/*
 * Submission: 1760202824
 * Problem: Number of Unequal Triplets in Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 07:29:54 UTC
 * Runtime: 2 ms
 * Memory: 41.4 MB
 */

class Solution {
    public int unequalTriplets(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int n : nums) {
            freq.merge(n,1,Integer::sum);
        }
        int l = 0, r = nums.length, res = 0;
        for (int cnt : freq.values()) {
            r -= cnt;
            res += l * cnt * r;
            l += cnt;
        }

        return res;

    }
}