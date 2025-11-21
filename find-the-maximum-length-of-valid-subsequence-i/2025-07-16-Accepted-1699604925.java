/*
 * Submission: 1699604925
 * Problem: Find the Maximum Length of Valid Subsequence I (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-16 05:02:53 UTC
 * Runtime: 6 ms
 * Memory: 62.3 MB
 */

class Solution {
    public int maximumLength(int[] nums) {
        int e = 0, o = 0, eo = 0, oe = 0;
        boolean eob = false, oeb = false;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                e++;
                if (eo%2 == 0) {
                    eo++;
                }
                if (oe%2 == 1){
                    oe++;
                }
            }
            else {
                o++;
                if (oe%2 == 0) {
                    oe++;
                }
                if (eo%2 == 1){
                    eo++;
                }
            }
        }
        return (e > o) ? ((e > eo) ? ((e > oe) ? e : oe) :(eo > oe) ? eo : oe) : (o > eo) ? (o > oe) ? o : oe : (eo > oe) ? eo : oe;
    }
}