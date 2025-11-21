/*
 * Submission: 1731058924
 * Problem: Split the Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 09:50:11 UTC
 * Runtime: 2 ms
 * Memory: 42.5 MB
 */

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> s = new HashMap<>();
        for (int i : nums){
            s.put(i,s.getOrDefault(i,0)+1);
            if (s.get(i) > 2) return false;
        } return true;
    }
}