/*
 * Submission: 1831290366
 * Problem: Smallest Missing Multiple of K (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 11:59:32 UTC
 * Runtime: 1 ms
 * Memory: 44.9 MB
 */

class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums) {
            if (n % k == 0) s.add(n);
        }
        int i = 1;
        while(true) {
            if(!s.contains(k*i)) return k*i;
            i++;
        }
    }
}