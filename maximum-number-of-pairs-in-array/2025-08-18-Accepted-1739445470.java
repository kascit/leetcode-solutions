/*
 * Submission: 1739445470
 * Problem: Maximum Number of Pairs in Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 09:36:18 UTC
 * Runtime: 1 ms
 * Memory: 42.1 MB
 */

class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pairs = 0, len = nums.length, leftovers = len;
        Set<Integer> s = new HashSet<>();
        for(int n : nums){
            if (s.contains(n)){
                pairs++;
                leftovers -= 2;
                s.remove(n);
            } else s.add(n);
        }
        return new int[]{pairs,leftovers};
    }
}