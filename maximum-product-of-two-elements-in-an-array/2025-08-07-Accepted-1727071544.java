/*
 * Submission: 1727071544
 * Problem: Maximum Product of Two Elements in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-07 16:28:42 UTC
 * Runtime: 0 ms
 * Memory: 43.1 MB
 */

class Solution {
    public int maxProduct(int[] nums) {
        int max = 0, smax = 0;
        for (int i : nums){
            if (i > max) {smax = max; max = i;}
            else if(i > smax) {smax = i;}
        } return (max-1)*(smax-1);
    }
}