/*
 * Submission: 1731055342
 * Problem: Split the Array (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-11 09:46:14 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int i : nums){
            s.add(i);
        } return s.size() >= nums.length/2;
    }
}