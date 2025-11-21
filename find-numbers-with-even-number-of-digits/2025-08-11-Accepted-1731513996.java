/*
 * Submission: 1731513996
 * Problem: Find Numbers with Even Number of Digits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 17:07:53 UTC
 * Runtime: 1 ms
 * Memory: 42.7 MB
 */

class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int i : nums){
            if ( (i > 9 && i < 100) || (i > 999 && i < 10000) || (i > 99999 && i <= 100000) ) ans++;
        } return ans;
    }
}