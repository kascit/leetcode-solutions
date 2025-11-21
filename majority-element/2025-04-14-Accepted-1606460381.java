/*
 * Submission: 1606460381
 * Problem: Majority Element (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-14 10:05:57 UTC
 * Runtime: 1 ms
 * Memory: 53.9 MB
 */

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}