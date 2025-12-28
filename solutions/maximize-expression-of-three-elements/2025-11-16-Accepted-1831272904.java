/*
 * Submission: 1831272904
 * Problem: Maximize Expression of Three Elements (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 11:33:10 UTC
 * Runtime: 1 ms
 * Memory: 44.9 MB
 */

class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE; 
        for (int n : nums) {
            if (n > max) {
                smax = max;
                max = n;
            } else if (n > smax) smax = n;
            if(n < min) min = n;
        } return max + smax - min;
    }
}