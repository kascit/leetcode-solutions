/*
 * Submission: 1759291685
 * Problem: Three Consecutive Odds (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 11:26:18 UTC
 * Runtime: 0 ms
 * Memory: 42.1 MB
 */

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 2; i++) {
            if ((arr[i]&1)==1) {
                if ((arr[i+1]&1)==1) {
                    if ((arr[i+2]&1)==1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}