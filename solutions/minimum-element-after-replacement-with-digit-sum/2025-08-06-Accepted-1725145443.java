/*
 * Submission: 1725145443
 * Problem: Minimum Element After Replacement With Digit Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-06 04:11:52 UTC
 * Runtime: 1 ms
 * Memory: 43.5 MB
 */

class Solution {
    public int minElement(int[] nums) {
        int min = 10000;
        for (int i : nums){
            int cur = 0;
            while (i > 0){
                cur += i%10;
                i /= 10;
            }
            min = Math.min(cur,min);
        } return min;
    }
}