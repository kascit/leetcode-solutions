/*
 * Submission: 1738914432
 * Problem: N-Repeated Element in Size 2N Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 19:14:37 UTC
 * Runtime: 0 ms
 * Memory: 45.2 MB
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