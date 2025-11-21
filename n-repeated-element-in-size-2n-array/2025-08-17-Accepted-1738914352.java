/*
 * Submission: 1738914352
 * Problem: N-Repeated Element in Size 2N Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 19:14:31 UTC
 * Runtime: 1 ms
 * Memory: 45.4 MB
 */

class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> fuck = new HashSet<>();
        for (int n : nums){
            if(fuck.contains(n)) return n;
            fuck.add(n); 
        } return -1;
    }
}