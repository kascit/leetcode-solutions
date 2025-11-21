/*
 * Submission: 1738914707
 * Problem: N-Repeated Element in Size 2N Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 19:14:54 UTC
 * Runtime: 1 ms
 * Memory: 45.3 MB
 */

class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> fuck = new HashSet<>(nums.length/2);
        for (int n : nums){
            if(fuck.contains(n)) return n;
            fuck.add(n); 
        } return -1;
    }
}