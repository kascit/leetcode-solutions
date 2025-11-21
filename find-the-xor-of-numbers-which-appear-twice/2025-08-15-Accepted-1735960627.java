/*
 * Submission: 1735960627
 * Problem: Find the XOR of Numbers Which Appear Twice (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 10:17:11 UTC
 * Runtime: 3 ms
 * Memory: 43.8 MB
 */

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
            ans ^= n;
        }
        for(int n : set){
            ans ^= n;
        } return ans;
    }
}