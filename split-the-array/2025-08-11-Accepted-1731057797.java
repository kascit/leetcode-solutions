/*
 * Submission: 1731057797
 * Problem: Split the Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 09:48:57 UTC
 * Runtime: 7 ms
 * Memory: 43.1 MB
 */

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> s = new HashMap<>();
        for (int i : nums){
            s.put(i,s.getOrDefault(i,0)+1);
        } return !s.values().stream().anyMatch(v -> v > 2);
    }
}